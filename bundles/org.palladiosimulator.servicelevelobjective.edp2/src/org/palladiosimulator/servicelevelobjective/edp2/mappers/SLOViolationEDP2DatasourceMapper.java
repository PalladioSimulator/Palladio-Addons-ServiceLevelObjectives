package org.palladiosimulator.servicelevelobjective.edp2.mappers;

import java.util.HashMap;

import javax.measure.Measure;

import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPersistable;
import org.eclipse.ui.IPersistableElement;
import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.edp2.datastream.IDataStream;
import org.palladiosimulator.edp2.datastream.configurable.PropertyConfigurable;
import org.palladiosimulator.edp2.datastream.filter.AbstractFilter;
import org.palladiosimulator.measurementframework.MeasuringValue;
import org.palladiosimulator.metricspec.MetricDescription;
import org.palladiosimulator.metricspec.constants.MetricDescriptionConstants;
import org.palladiosimulator.servicelevelobjective.LinearFuzzyThreshold;
import org.palladiosimulator.servicelevelobjective.NegativeQuadraticFuzzyThreshold;
import org.palladiosimulator.servicelevelobjective.QuadraticFuzzyThreshold;
import org.palladiosimulator.servicelevelobjective.ServiceLevelObjective;
import org.palladiosimulator.servicelevelobjective.SoftThreshold;
import org.palladiosimulator.servicelevelobjective.Threshold;

public class SLOViolationEDP2DatasourceMapper extends AbstractFilter implements IPersistable, IPersistableElement {
	@SuppressWarnings({ "rawtypes"})
	HashMap<Measure, Double> map = new HashMap<Measure, Double>();
	double toAdd;

	public SLOViolationEDP2DatasourceMapper() {
		// FIXME: Which metric should really be given here?
		super(MetricDescriptionConstants.RESPONSE_TIME_METRIC_TUPLE);
	}

	public SLOViolationEDP2DatasourceMapper(final IDataSource datasource) {
		// FIXME: Which metric should really be given here?
		super(datasource, MetricDescriptionConstants.RESPONSE_TIME_METRIC_TUPLE);
	}

	public SLOViolationEDP2DatasourceMapper(final IDataSource datasource, final MetricDescription metricDescription) {
		super(datasource, metricDescription);
	}

	/**
	 * Determines whether an SLO violations occurred for the given SLO member
	 * variable and for the given measurement, computes their fulfillment Grade for fuzzy Thresholds.
	 *  Linear, Quadratic and Negative Quadratic Thresholds are supported
	 * {@inheritDoc}
	 */
	@SuppressWarnings({ "rawtypes" })
	@Override
	protected boolean shouldSkip(final MeasuringValue measurement) {
		if (this.getConfiguration().isPropertyNotSet(SLOViolationEDP2DatasourceMapperConfiguration.SLO_KEY)) {
			// throw new RuntimeException("Filter Configuration requires a Service Level
			// Object.");
			return false;
		}

		final Object propertyObject = this.getConfiguration().getProperties()
				.get(SLOViolationEDP2DatasourceMapperConfiguration.SLO_KEY);
		if (!(propertyObject instanceof ServiceLevelObjective)) {
			// throw new RuntimeException("Expected a ServiceLevelObjective for the property
			// "
			// + SLOViolationEDP2DatasourceFilterConfiguration.SLO_KEY);
			return false;
		}
		final ServiceLevelObjective serviceLevelObjective = (ServiceLevelObjective) propertyObject;
		final Measure responseTime = measurement
				.getMeasureForMetric(serviceLevelObjective.getMeasurementSpecification().getMetricDescription());

		final Threshold lowerThreshold = serviceLevelObjective.getLowerThreshold();
		final Threshold upperThreshold = serviceLevelObjective.getUpperThreshold();
		toAdd = getGrade(responseTime, lowerThreshold, upperThreshold);
		map.put(responseTime, toAdd);
		return false;
	}

	@Override
	public String getFactoryId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveState(final IMemento memento) {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private double getGrade(Measure measurement, Threshold lower, Threshold upper) {

		if (lower != null) {
			final Measure lowerThresholdHardLimit = lower.getThresholdLimit();
			if (measurement.compareTo(lowerThresholdHardLimit) < 0) {
				return 0.0;
			}
			if ((lower instanceof SoftThreshold)) {
				final Measure lowerThresholdSoftLimit = ((SoftThreshold) lower).getSoftLimit();
				if (measurement.compareTo(lowerThresholdSoftLimit) < 0) {
					return gradeSoftLowerThreshold(measurement, (SoftThreshold) lower); // modify this
				}
			}
		}
		if (upper != null) {
			final Measure upperThresholdHardLimit = upper.getThresholdLimit();
			if ((upper instanceof SoftThreshold)) {
				final Measure upperThresholdSoftLimit = ((SoftThreshold) upper).getSoftLimit();
				if (measurement.compareTo(upperThresholdSoftLimit) <= 0) {
					return 1.0;
				} else if (measurement.compareTo(upperThresholdHardLimit) <= 0) {
					return gradeSoftUpperThreshold(measurement, (SoftThreshold) upper);
				}
			} else if (measurement.compareTo(upperThresholdHardLimit) <= 0) {
				return 1.0;
			}
		} else {
			return 1.0;
		}

		return 0.0;
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private double gradeSoftLowerThreshold(Measure toGrade, SoftThreshold lowerThreshold) {
		double x = (double) toGrade.getValue();
		double soft = lowerThreshold.getSoftLimit().doubleValue(toGrade.getUnit());
		double hard = lowerThreshold.getThresholdLimit().doubleValue(toGrade.getUnit());

		if (lowerThreshold instanceof LinearFuzzyThreshold) {
			return 1 / (soft - hard) * (x - hard);
		}
		if (lowerThreshold instanceof QuadraticFuzzyThreshold) {
			return 1 / Math.pow((soft - hard), 2) * Math.pow((x - hard), 2);
		}
		if (lowerThreshold instanceof NegativeQuadraticFuzzyThreshold) {
			return 1 - (1 / Math.pow((soft - hard), 2) * Math.pow((x - soft), 2));
		}
		return 0;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private double gradeSoftUpperThreshold(Measure toGrade, SoftThreshold upperThreshold) {
		double x = (double) toGrade.getValue();
		double soft = upperThreshold.getSoftLimit().doubleValue(toGrade.getUnit());
		double hard = upperThreshold.getThresholdLimit().doubleValue(toGrade.getUnit());
		if (upperThreshold instanceof LinearFuzzyThreshold) {
			return -1 / (hard - soft) * (x - hard);
		}
		if (upperThreshold instanceof QuadraticFuzzyThreshold) {
			return 1 / Math.pow((hard - soft), 2) * Math.pow((x - hard), 2);
		}
		if (upperThreshold instanceof NegativeQuadraticFuzzyThreshold) {
			return 1 - (1 / Math.pow((hard - soft), 2) * Math.pow((x - soft), 2));
		}
		return 0;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.palladiosimulator.edp2.datastream.filter.AbstractAdapter#createProperties
	 * ()
	 */
	@Override
	protected PropertyConfigurable createProperties() {
		return new SLOViolationEDP2DatasourceMapperConfiguration();
	}

	/**
	 * returns a Hashmap containing the Measurements and their corresponding Grades according to the SLO 
	 * @return Hashmap<Measurement, Grade>
	 */
	@SuppressWarnings({ "rawtypes"})
	public HashMap<Measure, Double> getMapping() {
		final IDataStream<MeasuringValue> stream = super.getDataStream();
		stream.size();
		stream.close();
		return map;
	}
}

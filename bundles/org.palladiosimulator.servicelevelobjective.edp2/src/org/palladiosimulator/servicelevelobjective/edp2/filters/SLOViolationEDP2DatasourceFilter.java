package org.palladiosimulator.servicelevelobjective.edp2.filters;

import jakarta.measure.Measure;

import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPersistable;
import org.eclipse.ui.IPersistableElement;
import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.edp2.datastream.configurable.PropertyConfigurable;
import org.palladiosimulator.edp2.datastream.filter.AbstractFilter;
import org.palladiosimulator.measurementframework.MeasuringValue;
import org.palladiosimulator.metricspec.MetricDescription;
import org.palladiosimulator.metricspec.constants.MetricDescriptionConstants;
import org.palladiosimulator.servicelevelobjective.ServiceLevelObjective;

public class SLOViolationEDP2DatasourceFilter extends AbstractFilter implements IPersistable, IPersistableElement {

    public SLOViolationEDP2DatasourceFilter() {
        // FIXME: Which metric should really be given here?
        super(MetricDescriptionConstants.RESPONSE_TIME_METRIC_TUPLE);
    }

    public SLOViolationEDP2DatasourceFilter(final IDataSource datasource) {
        // FIXME: Which metric should really be given here?
        super(datasource, MetricDescriptionConstants.RESPONSE_TIME_METRIC_TUPLE);
    }

    public SLOViolationEDP2DatasourceFilter(final IDataSource datasource, final MetricDescription metricDescription) {
        super(datasource, metricDescription);
    }

    /**
     * Determines whether an SLO violations occurred for the given SLO member variable and for the
     * given measurement. For instance, a response time tuple (10s, 5s) would be an SLO violation if
     * the SLO specifies a threshold of 3s.
     *
     * TODO Matthias should enrich this method by fuzzy thresholds. [Lehrig]
     *
     * {@inheritDoc}
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    protected boolean shouldSkip(final MeasuringValue measurement) {
        if (this.getConfiguration().isPropertyNotSet(SLOViolationEDP2DatasourceFilterConfiguration.SLO_KEY)) {
            //    throw new RuntimeException("Filter Configuration requires a Service Level Object.");
            return false;
        }

        final Object propertyObject = this.getConfiguration().getProperties()
                .get(SLOViolationEDP2DatasourceFilterConfiguration.SLO_KEY);
        if (!(propertyObject instanceof ServiceLevelObjective)) {
            //    throw new RuntimeException("Expected a ServiceLevelObjective for the property "
            //            + SLOViolationEDP2DatasourceFilterConfiguration.SLO_KEY);
            return false;
        }

        final ServiceLevelObjective serviceLevelObjective = (ServiceLevelObjective) propertyObject;
        final Measure responseTime = measurement.getMeasureForMetric(serviceLevelObjective
                .getMeasurementSpecification().getMetricDescription());

        if (serviceLevelObjective.getLowerThreshold() != null) {
            final Measure lowerThreshold = serviceLevelObjective.getLowerThreshold().getThresholdLimit();
            if (responseTime.compareTo(lowerThreshold) < 0) {
                return false;
            }
        }

        if (serviceLevelObjective.getUpperThreshold() != null) {
            final Measure upperThreshold = serviceLevelObjective.getUpperThreshold().getThresholdLimit();
            if (responseTime.compareTo(upperThreshold) > 0) {
                return false;
            }
        }

        return true;
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

    /*
     * (non-Javadoc)
     *
     * @see org.palladiosimulator.edp2.datastream.filter.AbstractAdapter#createProperties()
     */
    @Override
    protected PropertyConfigurable createProperties() {
        return new SLOViolationEDP2DatasourceFilterConfiguration();
    }

}

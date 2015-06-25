package org.palladiosimulator.servicelevelobjective.edp2.visualization.wizards;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.palladiosimulator.edp2.datastream.IDataSource;
import org.palladiosimulator.edp2.datastream.chaindescription.ChainDescription;
import org.palladiosimulator.edp2.models.ExperimentData.Measurement;
import org.palladiosimulator.edp2.util.MetricDescriptionUtility;
import org.palladiosimulator.edp2.visualization.jfreechart.input.JFreeChartVisualizationSingleDatastreamInput;
import org.palladiosimulator.metricspec.BaseMetricDescription;
import org.palladiosimulator.metricspec.MetricDescription;
import org.palladiosimulator.metricspec.NumericalBaseMetricDescription;
import org.palladiosimulator.servicelevelobjective.ServiceLevelObjective;
import org.palladiosimulator.servicelevelobjective.ServiceLevelObjectiveRepository;

/**
 * A wizard which is opened upon double clicking an experiment run or a measurement.
 *
 * If the wizard is started by double clicking a measurement, the user is prompted to select either
 * a visualization for the raw data or a corresponding service level objective (SLO) fulfillment
 * report visualization. If the user selects a SLO visualization, a repository containing available
 * SLO has to be imported and an SLO applicable to the metric description of the selected
 * measurements has to be chosen. Next the thresholds of the SLO need to be specified. Then the
 * chosen SLO fulfillment report is generated.
 *
 * If the wizard is started by double clicking an experiment run, the user can select an arbitrary
 * number of measurements, though all selected measurements need to have the same metric type. Next
 * a repository containing available SLO has to be imported and an SLO applicable to the metric
 * description of the selected measurements has to be chosen. If more than one measurement was
 * selected, the user needs to specify how the data are to be aggregated. After the thresholds of
 * the selected SLO are set the user can chose between available SLO fulfillment report
 * visualizations. The chosen report is then generated.
 *
 * @author Andreas Flohre
 *
 */
public class SLOViewsWizard extends Wizard implements INewWizard {

    /**
     * List holding all measuring points selected by the user on the
     * {@link SLODialogChooseMeasuringPointsPage}. If the user selected more than one measuring
     * point the aggregated data from the {@link SLODialogAggDataPage} will be stored in the
     * aggegatedData variable.
     */
    private List<Measurement> selectedMeasurements;

    /**
     * The {@link ServiceLevelObjective} selected by the user on the {@link SLODialogChooseSLOPage}.
     */
    private ServiceLevelObjective selectedSLO;

    /**
     * The Visualization selected on the {@link SLOSelectDefaultCombinationsPage}.
     */
    private ChainDescription selectedDefault;

    /**
     * List holding all {@link ServiceLevelObjective} objects contained in the selected
     * {@link ServiceLevelObjectiveRepository} applicable to the measurement(s) selected by the user
     * on the {@link SLODialogChooseMeasuringPointsPage}.
     */
    private List<ServiceLevelObjective> availableSLOs;

    /**
     * Value for time interval used to calculate relative service level objective fulfillment ratio
     * (qualitative visualization only).
     */
    private double selectedTimestepIntervalForVisualization = 10.;

    /**
     * Label for visualizations. Is only used for aggregated data from multiple measuring points.
     */
    private String measuringPointLabel = "";

    /**
     * Array holding the aggregated data from multiple measurements. Aggregation is selected by the
     * user on the {@link SLODialogAggDataPage}.
     */
    private double[][] aggregatedData;

    /**
     * Variable to indicate whether the user is allowed to finish the Wizard.
     */
    private boolean finishable;

    /**
     * The wizard's pages.
     */
    SLODialogChooseMeasuringPointsPage chooseMeasuringPointsPage;
    SLODialogChooseSLOPage chooseSLOPage;
    SLODialogSpecifiySLOThresholdsPage specifySLOPage;
    SLOSelectDefaultCombinationsPage selectDefaultCombinationsPage_SLO;
    SLODialogAggDataPage aggDataPage;
    SLODialogChooseRepositoryPage chooseRepoPage;

    private IDataSource datasource;

    private MetricDescription metricDescription;

    /**
     * Constructor. Used if the wizard is started from double clicking on an experiment run.
     *
     * @param experimentRun
     *            The double clicked experiment run containing the measuring points.
     */
    public SLOViewsWizard() {
        setWindowTitle("Service Level Objective Fulfillment Report Wizard");
        this.finishable = false;
    }

    public SLOViewsWizard(final List<JFreeChartVisualizationSingleDatastreamInput> inputs) {
        for (final JFreeChartVisualizationSingleDatastreamInput stream : inputs) {
            this.datasource = stream.getDataSource();
            this.metricDescription = stream.getDataSource().getMetricDesciption();
        }
    }


    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench,
     * org.eclipse.jface.viewers.IStructuredSelection)
     */
    @Override
    public void init(final IWorkbench workbench, final IStructuredSelection selection) {
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.jface.wizard.Wizard#performFinish()
     */
    @Override
    public boolean performFinish() {
        if (canFinish()) {
            return true;
        }
        return false;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.jface.wizard.Wizard#addPages()
     */
    @Override
    public void addPages() {
        chooseRepoPage = new SLODialogChooseRepositoryPage("choose repo", this.metricDescription);
        chooseRepoPage.setSelectedMeasurements(selectedMeasurements);
        addPage(chooseRepoPage);
        chooseSLOPage = new SLODialogChooseSLOPage("choose SLO");
        addPage(chooseSLOPage);
        aggDataPage = new SLODialogAggDataPage("aggregate data");
        addPage(aggDataPage);
        specifySLOPage = new SLODialogSpecifiySLOThresholdsPage("specify");
        addPage(specifySLOPage);
        selectDefaultCombinationsPage_SLO = new SLOSelectDefaultCombinationsPage("specify");
        addPage(selectDefaultCombinationsPage_SLO);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.jface.wizard.Wizard#getNextPage(org.eclipse.jface.wizard. IWizardPage)
     */

    @Override
    public IWizardPage getNextPage(final IWizardPage currentPage) {
        if (currentPage == chooseRepoPage && availableSLOs != null) {
            chooseSLOPage.setAvailableSLOs(availableSLOs);
            return chooseSLOPage;
        }

        if (currentPage == chooseSLOPage && selectedSLO != null) {
            specifySLOPage.setSelectedSLO(selectedSLO);
            double maxSimTime;
            if (aggregatedData != null) {
                maxSimTime = aggregatedData[0][aggregatedData[0].length - 1];
            } else {
                maxSimTime = this.calculateMaxSimulationTime(selectedMeasurements);
            }
            specifySLOPage.setMaxSimulationTime(maxSimTime);
            this.setFinishable(true);
            return specifySLOPage;
        }

        if (currentPage == specifySLOPage) {
            this.setFinishable(true);
        }

        if (currentPage == selectDefaultCombinationsPage_SLO && selectedDefault.getChainID().contains("SLO")) {
            chooseRepoPage.setSelectedMeasurements(selectedMeasurements);
            return chooseRepoPage;
        }
        return null;
    }

    /**
     * Calculates maximum simulation time of a set of measurements.
     *
     * @param measurements
     * @return
     */
    private double calculateMaxSimulationTime(final List<Measurement> measurements) {
        /*
         * List<double[][]> xyDataList = new ArrayList<double[][]>(); DescriptiveStatistics stats =
         * new DescriptiveStatistics(); // inputList for descriptiveStatistics List<Double>
         * inputList = new ArrayList<Double>(); for (Measurement currentMeasurement : measurements)
         * { xyDataList.add(getXYData(returnDataTupleFromMeasurement(currentMeasurement))); } Double
         * maxSimulationTime; for (double[][] currentXY : xyDataList) {
         * inputList.add(currentXY[0][currentXY[0].length - 1]); } for (Double currentDouble :
         * inputList) { stats.addValue(currentDouble); } maxSimulationTime = stats.getMax(); return
         * maxSimulationTime;
         */
        return this.datasource.getDataStream().size();

    }

    /**
     * Method checking whether a source is a two dimensional data source with a metric using real or
     * integer values. If not, false is returned.
     *
     * @param source
     *            The source to check.
     * @return
     */
    public boolean canAccept(final IDataSource source) {
        final BaseMetricDescription[] mds = MetricDescriptionUtility.toBaseMetricDescriptions(source.getMetricDesciption());
        if (mds.length != 2) {
            return false; // two-dimensional data needed
        }
        for (final BaseMetricDescription md : mds) {
            if (!(md instanceof NumericalBaseMetricDescription)) {
                return false; // only metrics that use real or integer values
                // can be computed
            }
        }
        return true;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.jface.wizard.Wizard#canFinish()
     */
    @Override
    public boolean canFinish() {
        return finishable;
    }

    public void setFinishable(final boolean finishable) {
        this.finishable = finishable;
    }

    public List<Measurement> getSelectedMeasurements() {
        return selectedMeasurements;
    }

    public void setSelectedMeasurements(List<Measurement> selectedMeasurements) {
        if (selectedMeasurements == null) {
            selectedMeasurements = new ArrayList<Measurement>();
            this.selectedMeasurements = selectedMeasurements;
        } else {
            this.selectedMeasurements = selectedMeasurements;
        }
    }

    public ServiceLevelObjective getSelectedSLO() {
        return selectedSLO;
    }

    public void setSelectedSLO(final ServiceLevelObjective selectedSLO) {
        this.selectedSLO = selectedSLO;
    }

    public ChainDescription getSelectedDefault() {
        return selectedDefault;
    }

    public void setSelectedDefault(final ChainDescription selectedDefault) {
        this.selectedDefault = selectedDefault;
    }

    public List<ServiceLevelObjective> getAvailableSLOs() {
        return availableSLOs;
    }

    public void setAvailableSLOs(final List<ServiceLevelObjective> availableSLOs) {
        this.availableSLOs = availableSLOs;
    }

    public void setAggregatedData(final double[][] aggregatedData) {
        this.aggregatedData = aggregatedData;
    }

    public double[][] getAggregatedData() {
        if (this.aggregatedData != null) {
            return this.aggregatedData;
        }
        return null;
    }

    public double getSelectedTimestepInterval() {
        return selectedTimestepIntervalForVisualization;
    }

    public void setSelectedTimestepInterval(final double selectedTimestepInterval) {
        this.selectedTimestepIntervalForVisualization = selectedTimestepInterval;
    }

    public void setMeasuringPointLabel(final String label) {
        this.measuringPointLabel = label;
    }

    public String getMeasuringPointLabel() {
        return this.measuringPointLabel;
    }

}

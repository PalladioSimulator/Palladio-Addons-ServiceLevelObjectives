package org.palladiosimulator.servicelevelobjective.edp2.visualization.wizards;

import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.palladiosimulator.edp2.models.ExperimentData.Measurement;
import org.palladiosimulator.edp2.models.measuringpoint.impl.StringMeasuringPointImpl;
import org.palladiosimulator.metricspec.MetricDescription;

/**
 * A {@link WizardPage} containing a list of measurements available as choices. The user can select
 * an arbitrary number of measurements. However, all selected measurements must have the same
 * metric.
 * 
 * @author Andreas Flohre
 *
 */
public class SLODialogChooseMeasuringPointsPage extends WizardPage implements ISelectionChangedListener {

    /**
     * A list containing all measurements within the experiment run used to started the
     * {@link SLOViewsWizard} controlling this page.
     */
    private final List<Measurement> measurementsList;

    /**
     * A viewer presenting all measurements from measurementsList to the user as choices.
     */
    private TableViewer choiceViewer;

    /**
     * A list containing all measurements selected by the user.
     */
    private List<Measurement> selectedMeasurements;

    /**
     * The current {@link IStatus} based on the selection in the <choiceViewer>
     */
    private IStatus selectionStatus;

    /**
     * The 'OK'-Status, which signalizes everything is fine.
     */
    private final Status statusOK;

    /**
     * Constructor.
     * 
     * @param pageName
     * @param measurementsList
     *            A list containing all measurements to be presented to the user as choices.
     */
    protected SLODialogChooseMeasuringPointsPage(String pageName, List<Measurement> measurementsList) {
        super(pageName);
        this.setPageComplete(false);
        this.measurementsList = measurementsList;
        setDescription("Please select at least one measuring point to proceed");
        setErrorMessage("Selected measuring points must have same metric type.");
        selectionStatus = new Status(IStatus.INFO, "not_used", 0,
                "Please select at least one measuring point to proceed.", null);
        statusOK = new Status(IStatus.OK, "not_used", 0, "", null);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets .Composite)
     */
    @Override
    public void createControl(final Composite parent) {
        // create the composite to hold the widgets
        Composite composite = new Composite(parent, SWT.NONE);

        // create the desired layout for this wizard page
        GridLayout gl = new GridLayout();
        composite.setLayout(gl);

        Label label = new Label(composite, SWT.NONE);
        label.setText("Available Choices:");

        SashForm sashForm = new SashForm(composite, SWT.HORIZONTAL);
        GridData gd = new GridData(GridData.FILL_BOTH);
        gd.widthHint = 200;
        sashForm.setLayoutData(gd);

        this.choiceViewer = new TableViewer(sashForm, SWT.MULTI | SWT.BORDER);
        initializeChoiceViewer();

        // set the composite as the control for this page
        setControl(composite);
        updatePageStatus();
    }

    /**
     * Initializes the viewer with measurementsList as content.
     */
    private void initializeChoiceViewer() {
        this.choiceViewer.setContentProvider(new IStructuredContentProvider() {
            @Override
            public void dispose() {
                // do nothing here
            }

            @Override
            public Object[] getElements(final Object inputElement) {
                return SLODialogChooseMeasuringPointsPage.this.measurementsList.toArray();
            }

            @Override
            public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
                // do nothing here
            }
        });
        this.choiceViewer.setLabelProvider(new ILabelProvider() {

            @Override
            public void addListener(final ILabelProviderListener listener) {
                // do nothing here
            }

            @Override
            public void dispose() {
                // do nothing here
            }

            @Override
            public Image getImage(final Object element) {
                return null;
            }

            @Override
            public String getText(final Object element) {
                if (element != null) {
                    // the elements in the list are of type Measurements
                    Measurement sequenceElement = (Measurement) element;
                    // FIXME can throw ClassCastException because base
                    // MeasuringPointImpl does not have a measuringPoint, i.e.
                    // all measuring points need to be cast to
                    // StringMeasuringPointImpl
                    StringMeasuringPointImpl measuringPoint = (StringMeasuringPointImpl) sequenceElement
                            .getMeasuringType().getMeasuringPoint();
                    final StringBuffer result = new StringBuffer();
                    result.append("Measuring Point: " + measuringPoint.getMeasuringPoint() + " ("
                            + sequenceElement.getMeasuringType().getMetric().getName() + ")");
                    return result.toString();
                }
                return null;
            }

            @Override
            public boolean isLabelProperty(final Object element, final String property) {
                // not used
                return false;
            }

            @Override
            public void removeListener(final ILabelProviderListener listener) {
                // not used
            }
        });

        this.choiceViewer.setInput(this.measurementsList);
        this.choiceViewer.addSelectionChangedListener(this);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(
     * org.eclipse.jface.viewers.SelectionChangedEvent)
     */
    @Override
    public void selectionChanged(final SelectionChangedEvent event) {
        selectionStatus = statusOK;
        final IStructuredSelection selection = (IStructuredSelection) event.getSelection();
        if (selection.isEmpty()) {
            selectionStatus = new Status(IStatus.ERROR, "not_used", 0, "Please select a Visualization to proceed.",
                    null);
        } else {
            @SuppressWarnings("unchecked")
            List<Measurement> list = selection.toList();
            this.selectedMeasurements = list;
            // all selected measurements must be of same type
            if (checkForSameMetricTypes()) {
                this.setSelectedMeasurementsInWizard(list);
            } else {
                this.setPageComplete(false);
                selectionStatus = new Status(IStatus.ERROR, "not_used", 0,
                        "Selected measuring points must have same metric type.", null);
            }
        }
        updatePageStatus();
    }

    /**
     * Checks if all selected measurements stored in selectedMeasurements have the same metric.
     * 
     * @return true, if all measurements have the same metric, false else.
     * 
     */
    private boolean checkForSameMetricTypes() {
        MetricDescription metricType = selectedMeasurements.get(0).getMeasuringType().getMetric();
        for (Measurement measurement : selectedMeasurements) {
            if (!metricType.equals(measurement.getMeasuringType().getMetric())) {
                return false;
            }
        }
        return true;
    }

    /**
     * Method which handles the status of the whole {@link WizardPage} based on the different states
     * resulting from inputs.
     *
     * @return the page Status
     */
    public IStatus updatePageStatus() {
        IStatus pageStatus = statusOK;
        ((SLOViewsWizard) getWizard()).setFinishable(false);
        switch (selectionStatus.getSeverity()) {
        case IStatus.OK:
            setErrorMessage(null);
            setMessage(selectionStatus.getMessage());
            pageStatus = statusOK;
            this.setPageComplete(true);
            break;
        case IStatus.WARNING:
            setErrorMessage(null);
            setMessage(selectionStatus.getMessage(), WizardPage.WARNING);
            pageStatus = selectionStatus;
            break;
        case IStatus.INFO:
            setErrorMessage(null);
            setMessage(selectionStatus.getMessage(), WizardPage.INFORMATION);
            pageStatus = selectionStatus;
            break;
        default:
            setErrorMessage(selectionStatus.getMessage());
            setMessage(null);
            pageStatus = selectionStatus;
            break;
        }
        return pageStatus;
    }

    /**
     * Forwards the selected measurements to the {@link SLOViewsWizard}.
     * 
     * @param selectedMeasurements
     */
    private void setSelectedMeasurementsInWizard(List<Measurement> selectedMeasurements) {
        ((SLOViewsWizard) this.getWizard()).setSelectedMeasurements(selectedMeasurements);

    }

}

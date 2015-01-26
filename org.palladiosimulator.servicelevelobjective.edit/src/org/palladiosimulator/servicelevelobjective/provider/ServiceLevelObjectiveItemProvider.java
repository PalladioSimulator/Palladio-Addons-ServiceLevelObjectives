/**
 */
package org.palladiosimulator.servicelevelobjective.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.servicelevelobjective.ServiceLevelObjective;
import org.palladiosimulator.servicelevelobjective.ServicelevelObjectiveFactory;
import org.palladiosimulator.servicelevelobjective.ServicelevelObjectivePackage;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.servicelevelobjective.ServiceLevelObjective} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class ServiceLevelObjectiveItemProvider extends NamedElementItemProvider {
    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public ServiceLevelObjectiveItemProvider(final AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(final Object object) {
        if (this.itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            this.addDescriptionPropertyDescriptor(object);
            this.addMetricDescriptionPropertyDescriptor(object);
            this.addMeasuringPointPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Description feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addDescriptionPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ServiceLevelObjective_description_feature"), this.getString(
                        "_UI_PropertyDescriptor_description", "_UI_ServiceLevelObjective_description_feature",
                        "_UI_ServiceLevelObjective_type"),
                ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__DESCRIPTION, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Metric Description feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addMetricDescriptionPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ServiceLevelObjective_metricDescription_feature"), this.getString(
                        "_UI_PropertyDescriptor_description", "_UI_ServiceLevelObjective_metricDescription_feature",
                        "_UI_ServiceLevelObjective_type"),
                ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__METRIC_DESCRIPTION, true, false, true,
                null, null, null));
    }

    /**
     * This adds a property descriptor for the Measuring Point feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addMeasuringPointPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ServiceLevelObjective_measuringPoint_feature"), this.getString(
                        "_UI_PropertyDescriptor_description", "_UI_ServiceLevelObjective_measuringPoint_feature",
                        "_UI_ServiceLevelObjective_type"),
                ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__MEASURING_POINT, true, false, true,
                null, null, null));
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate
     * feature for an {@link org.eclipse.emf.edit.command.AddCommand},
     * {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(final Object object) {
        if (this.childrenFeatures == null) {
            super.getChildrenFeatures(object);
            this.childrenFeatures.add(ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__LOWER_THRESHOLD);
            this.childrenFeatures.add(ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__UPPER_THRESHOLD);
        }
        return this.childrenFeatures;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(final Object object, final Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns ServiceLevelObjective.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/ServiceLevelObjective"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final String label = ((ServiceLevelObjective) object).getName();
        return label == null || label.length() == 0 ? this.getString("_UI_ServiceLevelObjective_type") : this
                .getString("_UI_ServiceLevelObjective_type") + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}
     * . <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void notifyChanged(final Notification notification) {
        this.updateChildren(notification);

        switch (notification.getFeatureID(ServiceLevelObjective.class)) {
        case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__DESCRIPTION:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__LOWER_THRESHOLD:
        case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__UPPER_THRESHOLD:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
            return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that
     * can be created under this object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(final Collection<Object> newChildDescriptors, final Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add(this.createChildParameter(
                ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__LOWER_THRESHOLD,
                ServicelevelObjectiveFactory.eINSTANCE.createHardThreshold()));

        newChildDescriptors.add(this.createChildParameter(
                ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__LOWER_THRESHOLD,
                ServicelevelObjectiveFactory.eINSTANCE.createLinearFuzzyThreshold()));

        newChildDescriptors.add(this.createChildParameter(
                ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__UPPER_THRESHOLD,
                ServicelevelObjectiveFactory.eINSTANCE.createHardThreshold()));

        newChildDescriptors.add(this.createChildParameter(
                ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__UPPER_THRESHOLD,
                ServicelevelObjectiveFactory.eINSTANCE.createLinearFuzzyThreshold()));
    }

    /**
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getCreateChildText(final Object owner, final Object feature, final Object child,
            final Collection<?> selection) {
        final Object childFeature = feature;
        final Object childObject = child;

        final boolean qualify = childFeature == ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__LOWER_THRESHOLD
                || childFeature == ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__UPPER_THRESHOLD;

        if (qualify) {
            return this.getString(
                    "_UI_CreateChild_text2",
                    new Object[] { this.getTypeText(childObject), this.getFeatureText(childFeature),
                            this.getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

}

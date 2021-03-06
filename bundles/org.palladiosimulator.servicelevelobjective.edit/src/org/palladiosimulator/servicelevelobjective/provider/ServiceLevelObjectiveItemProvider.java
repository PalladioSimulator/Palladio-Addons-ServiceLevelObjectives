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
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public ServiceLevelObjectiveItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addDescriptionPropertyDescriptor(object);
			addMeasurementSpecificationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ServiceLevelObjective_description_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ServiceLevelObjective_description_feature",
								"_UI_ServiceLevelObjective_type"),
						ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__DESCRIPTION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Measurement Specification feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addMeasurementSpecificationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ServiceLevelObjective_measurementSpecification_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ServiceLevelObjective_measurementSpecification_feature", "_UI_ServiceLevelObjective_type"),
				ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__MEASUREMENT_SPECIFICATION, true, false,
				true, null, null, null));
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__LOWER_THRESHOLD);
			childrenFeatures.add(ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__UPPER_THRESHOLD);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ServiceLevelObjective.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated not
	 */
	@Override
	public Object getImage(final Object object) {
		return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/servicelevelobjective_16.png"));

	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ServiceLevelObjective) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ServiceLevelObjective_type")
				: getString("_UI_ServiceLevelObjective_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ServiceLevelObjective.class)) {
		case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__DESCRIPTION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__LOWER_THRESHOLD:
		case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__UPPER_THRESHOLD:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(
				createChildParameter(ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__LOWER_THRESHOLD,
						ServicelevelObjectiveFactory.eINSTANCE.createHardThreshold()));

		newChildDescriptors.add(
				createChildParameter(ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__LOWER_THRESHOLD,
						ServicelevelObjectiveFactory.eINSTANCE.createSoftThreshold()));

		newChildDescriptors.add(
				createChildParameter(ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__LOWER_THRESHOLD,
						ServicelevelObjectiveFactory.eINSTANCE.createLinearFuzzyThreshold()));

		newChildDescriptors.add(
				createChildParameter(ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__LOWER_THRESHOLD,
						ServicelevelObjectiveFactory.eINSTANCE.createQuadraticFuzzyThreshold()));

		newChildDescriptors.add(
				createChildParameter(ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__LOWER_THRESHOLD,
						ServicelevelObjectiveFactory.eINSTANCE.createNegativeQuadraticFuzzyThreshold()));

		newChildDescriptors.add(
				createChildParameter(ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__UPPER_THRESHOLD,
						ServicelevelObjectiveFactory.eINSTANCE.createHardThreshold()));

		newChildDescriptors.add(
				createChildParameter(ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__UPPER_THRESHOLD,
						ServicelevelObjectiveFactory.eINSTANCE.createSoftThreshold()));

		newChildDescriptors.add(
				createChildParameter(ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__UPPER_THRESHOLD,
						ServicelevelObjectiveFactory.eINSTANCE.createLinearFuzzyThreshold()));

		newChildDescriptors.add(
				createChildParameter(ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__UPPER_THRESHOLD,
						ServicelevelObjectiveFactory.eINSTANCE.createQuadraticFuzzyThreshold()));

		newChildDescriptors.add(
				createChildParameter(ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__UPPER_THRESHOLD,
						ServicelevelObjectiveFactory.eINSTANCE.createNegativeQuadraticFuzzyThreshold()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__LOWER_THRESHOLD
				|| childFeature == ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__UPPER_THRESHOLD;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

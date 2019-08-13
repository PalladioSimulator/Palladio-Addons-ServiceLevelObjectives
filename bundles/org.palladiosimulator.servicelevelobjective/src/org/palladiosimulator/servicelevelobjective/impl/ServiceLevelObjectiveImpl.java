/**
 */
package org.palladiosimulator.servicelevelobjective.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.palladiosimulator.monitorrepository.MeasurementSpecification;
import org.palladiosimulator.servicelevelobjective.ServiceLevelObjective;
import org.palladiosimulator.servicelevelobjective.ServicelevelObjectivePackage;
import org.palladiosimulator.servicelevelobjective.Threshold;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Service Level Objective</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.servicelevelobjective.impl.ServiceLevelObjectiveImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.palladiosimulator.servicelevelobjective.impl.ServiceLevelObjectiveImpl#getLowerThreshold <em>Lower Threshold</em>}</li>
 *   <li>{@link org.palladiosimulator.servicelevelobjective.impl.ServiceLevelObjectiveImpl#getUpperThreshold <em>Upper Threshold</em>}</li>
 *   <li>{@link org.palladiosimulator.servicelevelobjective.impl.ServiceLevelObjectiveImpl#getMeasurementSpecification <em>Measurement Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceLevelObjectiveImpl extends NamedElementImpl implements ServiceLevelObjective {

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceLevelObjectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String) eDynamicGet(ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__DESCRIPTION,
				ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__DESCRIPTION,
				ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Threshold getLowerThreshold() {
		return (Threshold) eDynamicGet(ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__LOWER_THRESHOLD,
				ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__LOWER_THRESHOLD, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerThreshold(Threshold newLowerThreshold, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newLowerThreshold,
				ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__LOWER_THRESHOLD, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLowerThreshold(Threshold newLowerThreshold) {
		eDynamicSet(ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__LOWER_THRESHOLD,
				ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__LOWER_THRESHOLD, newLowerThreshold);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Threshold getUpperThreshold() {
		return (Threshold) eDynamicGet(ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__UPPER_THRESHOLD,
				ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__UPPER_THRESHOLD, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperThreshold(Threshold newUpperThreshold, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject) newUpperThreshold,
				ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__UPPER_THRESHOLD, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpperThreshold(Threshold newUpperThreshold) {
		eDynamicSet(ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__UPPER_THRESHOLD,
				ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__UPPER_THRESHOLD, newUpperThreshold);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasurementSpecification getMeasurementSpecification() {
		return (MeasurementSpecification) eDynamicGet(
				ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__MEASUREMENT_SPECIFICATION,
				ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__MEASUREMENT_SPECIFICATION, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementSpecification basicGetMeasurementSpecification() {
		return (MeasurementSpecification) eDynamicGet(
				ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__MEASUREMENT_SPECIFICATION,
				ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__MEASUREMENT_SPECIFICATION, false, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMeasurementSpecification(MeasurementSpecification newMeasurementSpecification) {
		eDynamicSet(ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__MEASUREMENT_SPECIFICATION,
				ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__MEASUREMENT_SPECIFICATION,
				newMeasurementSpecification);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__LOWER_THRESHOLD:
			return basicSetLowerThreshold(null, msgs);
		case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__UPPER_THRESHOLD:
			return basicSetUpperThreshold(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__DESCRIPTION:
			return getDescription();
		case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__LOWER_THRESHOLD:
			return getLowerThreshold();
		case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__UPPER_THRESHOLD:
			return getUpperThreshold();
		case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__MEASUREMENT_SPECIFICATION:
			if (resolve)
				return getMeasurementSpecification();
			return basicGetMeasurementSpecification();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__LOWER_THRESHOLD:
			setLowerThreshold((Threshold) newValue);
			return;
		case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__UPPER_THRESHOLD:
			setUpperThreshold((Threshold) newValue);
			return;
		case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__MEASUREMENT_SPECIFICATION:
			setMeasurementSpecification((MeasurementSpecification) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__LOWER_THRESHOLD:
			setLowerThreshold((Threshold) null);
			return;
		case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__UPPER_THRESHOLD:
			setUpperThreshold((Threshold) null);
			return;
		case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__MEASUREMENT_SPECIFICATION:
			setMeasurementSpecification((MeasurementSpecification) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? getDescription() != null
					: !DESCRIPTION_EDEFAULT.equals(getDescription());
		case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__LOWER_THRESHOLD:
			return getLowerThreshold() != null;
		case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__UPPER_THRESHOLD:
			return getUpperThreshold() != null;
		case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__MEASUREMENT_SPECIFICATION:
			return basicGetMeasurementSpecification() != null;
		}
		return super.eIsSet(featureID);
	}

} // ServiceLevelObjectiveImpl

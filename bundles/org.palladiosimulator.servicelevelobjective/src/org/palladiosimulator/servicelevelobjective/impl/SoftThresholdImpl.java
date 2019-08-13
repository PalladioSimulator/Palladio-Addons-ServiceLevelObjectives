/**
 */
package org.palladiosimulator.servicelevelobjective.impl;

import javax.measure.Measure;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.servicelevelobjective.ServicelevelObjectivePackage;
import org.palladiosimulator.servicelevelobjective.SoftThreshold;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Soft Threshold</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.servicelevelobjective.impl.SoftThresholdImpl#getSoftLimit <em>Soft Limit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoftThresholdImpl extends ThresholdImpl implements SoftThreshold {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftThresholdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicelevelObjectivePackage.Literals.SOFT_THRESHOLD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Measure getSoftLimit() {
		return (Measure) eDynamicGet(ServicelevelObjectivePackage.SOFT_THRESHOLD__SOFT_LIMIT,
				ServicelevelObjectivePackage.Literals.SOFT_THRESHOLD__SOFT_LIMIT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSoftLimit(Measure newSoftLimit) {
		eDynamicSet(ServicelevelObjectivePackage.SOFT_THRESHOLD__SOFT_LIMIT,
				ServicelevelObjectivePackage.Literals.SOFT_THRESHOLD__SOFT_LIMIT, newSoftLimit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ServicelevelObjectivePackage.SOFT_THRESHOLD__SOFT_LIMIT:
			return getSoftLimit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ServicelevelObjectivePackage.SOFT_THRESHOLD__SOFT_LIMIT:
			setSoftLimit((Measure) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ServicelevelObjectivePackage.SOFT_THRESHOLD__SOFT_LIMIT:
			setSoftLimit((Measure) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ServicelevelObjectivePackage.SOFT_THRESHOLD__SOFT_LIMIT:
			return getSoftLimit() != null;
		}
		return super.eIsSet(featureID);
	}

} //SoftThresholdImpl

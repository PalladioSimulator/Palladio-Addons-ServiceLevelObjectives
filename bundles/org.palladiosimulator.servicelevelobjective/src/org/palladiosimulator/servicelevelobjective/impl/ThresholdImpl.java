/**
 */
package org.palladiosimulator.servicelevelobjective.impl;

import javax.measure.Measure;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.servicelevelobjective.ServicelevelObjectivePackage;
import org.palladiosimulator.servicelevelobjective.Threshold;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Threshold</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.servicelevelobjective.impl.ThresholdImpl#getThresholdLimit <em>Threshold Limit</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ThresholdImpl extends IdentifierImpl implements Threshold {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ThresholdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicelevelObjectivePackage.Literals.THRESHOLD;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Measure<?, ?> getThresholdLimit() {
		return (Measure<?, ?>) eDynamicGet(ServicelevelObjectivePackage.THRESHOLD__THRESHOLD_LIMIT,
				ServicelevelObjectivePackage.Literals.THRESHOLD__THRESHOLD_LIMIT, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThresholdLimit(Measure<?, ?> newThresholdLimit) {
		eDynamicSet(ServicelevelObjectivePackage.THRESHOLD__THRESHOLD_LIMIT,
				ServicelevelObjectivePackage.Literals.THRESHOLD__THRESHOLD_LIMIT, newThresholdLimit);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ServicelevelObjectivePackage.THRESHOLD__THRESHOLD_LIMIT:
			return getThresholdLimit();
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
		case ServicelevelObjectivePackage.THRESHOLD__THRESHOLD_LIMIT:
			setThresholdLimit((Measure<?, ?>) newValue);
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
		case ServicelevelObjectivePackage.THRESHOLD__THRESHOLD_LIMIT:
			setThresholdLimit((Measure<?, ?>) null);
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
		case ServicelevelObjectivePackage.THRESHOLD__THRESHOLD_LIMIT:
			return getThresholdLimit() != null;
		}
		return super.eIsSet(featureID);
	}

} // ThresholdImpl

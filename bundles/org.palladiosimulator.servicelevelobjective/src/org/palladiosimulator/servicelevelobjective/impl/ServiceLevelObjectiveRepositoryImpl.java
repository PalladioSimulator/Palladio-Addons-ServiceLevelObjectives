/**
 */
package org.palladiosimulator.servicelevelobjective.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.palladiosimulator.servicelevelobjective.ServiceLevelObjective;
import org.palladiosimulator.servicelevelobjective.ServiceLevelObjectiveRepository;
import org.palladiosimulator.servicelevelobjective.ServicelevelObjectivePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Service Level Objective Repository</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.servicelevelobjective.impl.ServiceLevelObjectiveRepositoryImpl#getServicelevelobjectives <em>Servicelevelobjectives</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceLevelObjectiveRepositoryImpl extends CDOObjectImpl implements ServiceLevelObjectiveRepository {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceLevelObjectiveRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ServiceLevelObjective> getServicelevelobjectives() {
		return (EList<ServiceLevelObjective>) eDynamicGet(
				ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE_REPOSITORY__SERVICELEVELOBJECTIVES,
				ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE_REPOSITORY__SERVICELEVELOBJECTIVES, true,
				true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE_REPOSITORY__SERVICELEVELOBJECTIVES:
			return ((InternalEList<?>) getServicelevelobjectives()).basicRemove(otherEnd, msgs);
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
		case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE_REPOSITORY__SERVICELEVELOBJECTIVES:
			return getServicelevelobjectives();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE_REPOSITORY__SERVICELEVELOBJECTIVES:
			getServicelevelobjectives().clear();
			getServicelevelobjectives().addAll((Collection<? extends ServiceLevelObjective>) newValue);
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
		case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE_REPOSITORY__SERVICELEVELOBJECTIVES:
			getServicelevelobjectives().clear();
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
		case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE_REPOSITORY__SERVICELEVELOBJECTIVES:
			return !getServicelevelobjectives().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ServiceLevelObjectiveRepositoryImpl

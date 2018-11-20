/**
 */
package org.palladiosimulator.servicelevelobjective.impl;

import javax.measure.Measure;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.servicelevelobjective.LinearFuzzyThreshold;
import org.palladiosimulator.servicelevelobjective.ServicelevelObjectivePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Linear Fuzzy Threshold</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.servicelevelobjective.impl.LinearFuzzyThresholdImpl#getSoftLimit
 * <em>Soft Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinearFuzzyThresholdImpl extends ThresholdImpl implements LinearFuzzyThreshold {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected LinearFuzzyThresholdImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ServicelevelObjectivePackage.Literals.LINEAR_FUZZY_THRESHOLD;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Measure<?, ?> getSoftLimit() {
        return (Measure<?, ?>) this.eDynamicGet(ServicelevelObjectivePackage.LINEAR_FUZZY_THRESHOLD__SOFT_LIMIT,
                ServicelevelObjectivePackage.Literals.LINEAR_FUZZY_THRESHOLD__SOFT_LIMIT, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setSoftLimit(final Measure<?, ?> newSoftLimit) {
        this.eDynamicSet(ServicelevelObjectivePackage.LINEAR_FUZZY_THRESHOLD__SOFT_LIMIT,
                ServicelevelObjectivePackage.Literals.LINEAR_FUZZY_THRESHOLD__SOFT_LIMIT, newSoftLimit);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case ServicelevelObjectivePackage.LINEAR_FUZZY_THRESHOLD__SOFT_LIMIT:
            return this.getSoftLimit();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case ServicelevelObjectivePackage.LINEAR_FUZZY_THRESHOLD__SOFT_LIMIT:
            this.setSoftLimit((Measure<?, ?>) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
        case ServicelevelObjectivePackage.LINEAR_FUZZY_THRESHOLD__SOFT_LIMIT:
            this.setSoftLimit((Measure<?, ?>) null);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
        case ServicelevelObjectivePackage.LINEAR_FUZZY_THRESHOLD__SOFT_LIMIT:
            return this.getSoftLimit() != null;
        }
        return super.eIsSet(featureID);
    }

} // LinearFuzzyThresholdImpl

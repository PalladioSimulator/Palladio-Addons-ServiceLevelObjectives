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
 * <ul>
 * <li>
 * {@link org.palladiosimulator.servicelevelobjective.impl.ServiceLevelObjectiveImpl#getDescription
 * <em>Description</em>}</li>
 * <li>
 * {@link org.palladiosimulator.servicelevelobjective.impl.ServiceLevelObjectiveImpl#getLowerThreshold
 * <em>Lower Threshold</em>}</li>
 * <li>
 * {@link org.palladiosimulator.servicelevelobjective.impl.ServiceLevelObjectiveImpl#getUpperThreshold
 * <em>Upper Threshold</em>}</li>
 * <li>
 * {@link org.palladiosimulator.servicelevelobjective.impl.ServiceLevelObjectiveImpl#getMeasurementSpecification
 * <em>Measurement Specification</em>}</li>
 * </ul>
 * </p>
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
     * 
     * @generated
     */
    protected ServiceLevelObjectiveImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getDescription() {
        return (String) this.eDynamicGet(ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__DESCRIPTION,
                ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__DESCRIPTION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setDescription(final String newDescription) {
        this.eDynamicSet(ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__DESCRIPTION,
                ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__DESCRIPTION, newDescription);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Threshold getLowerThreshold() {
        return (Threshold) this.eDynamicGet(ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__LOWER_THRESHOLD,
                ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__LOWER_THRESHOLD, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetLowerThreshold(final Threshold newLowerThreshold, NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newLowerThreshold,
                ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__LOWER_THRESHOLD, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setLowerThreshold(final Threshold newLowerThreshold) {
        this.eDynamicSet(ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__LOWER_THRESHOLD,
                ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__LOWER_THRESHOLD, newLowerThreshold);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Threshold getUpperThreshold() {
        return (Threshold) this.eDynamicGet(ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__UPPER_THRESHOLD,
                ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__UPPER_THRESHOLD, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetUpperThreshold(final Threshold newUpperThreshold, NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newUpperThreshold,
                ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__UPPER_THRESHOLD, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setUpperThreshold(final Threshold newUpperThreshold) {
        this.eDynamicSet(ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__UPPER_THRESHOLD,
                ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__UPPER_THRESHOLD, newUpperThreshold);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public MeasurementSpecification getMeasurementSpecification() {
        return (MeasurementSpecification) this.eDynamicGet(
                ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__MEASUREMENT_SPECIFICATION,
                ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__MEASUREMENT_SPECIFICATION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public MeasurementSpecification basicGetMeasurementSpecification() {
        return (MeasurementSpecification) this.eDynamicGet(
                ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__MEASUREMENT_SPECIFICATION,
                ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__MEASUREMENT_SPECIFICATION, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setMeasurementSpecification(final MeasurementSpecification newMeasurementSpecification) {
        this.eDynamicSet(ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__MEASUREMENT_SPECIFICATION,
                ServicelevelObjectivePackage.Literals.SERVICE_LEVEL_OBJECTIVE__MEASUREMENT_SPECIFICATION,
                newMeasurementSpecification);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID) {
        case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__LOWER_THRESHOLD:
            return this.basicSetLowerThreshold(null, msgs);
        case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__UPPER_THRESHOLD:
            return this.basicSetUpperThreshold(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__DESCRIPTION:
            return this.getDescription();
        case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__LOWER_THRESHOLD:
            return this.getLowerThreshold();
        case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__UPPER_THRESHOLD:
            return this.getUpperThreshold();
        case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__MEASUREMENT_SPECIFICATION:
            if (resolve) {
                return this.getMeasurementSpecification();
            }
            return this.basicGetMeasurementSpecification();
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
        case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__DESCRIPTION:
            this.setDescription((String) newValue);
            return;
        case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__LOWER_THRESHOLD:
            this.setLowerThreshold((Threshold) newValue);
            return;
        case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__UPPER_THRESHOLD:
            this.setUpperThreshold((Threshold) newValue);
            return;
        case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__MEASUREMENT_SPECIFICATION:
            this.setMeasurementSpecification((MeasurementSpecification) newValue);
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
        case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__DESCRIPTION:
            this.setDescription(DESCRIPTION_EDEFAULT);
            return;
        case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__LOWER_THRESHOLD:
            this.setLowerThreshold((Threshold) null);
            return;
        case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__UPPER_THRESHOLD:
            this.setUpperThreshold((Threshold) null);
            return;
        case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__MEASUREMENT_SPECIFICATION:
            this.setMeasurementSpecification((MeasurementSpecification) null);
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
        case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__DESCRIPTION:
            return DESCRIPTION_EDEFAULT == null ? this.getDescription() != null : !DESCRIPTION_EDEFAULT.equals(this
                    .getDescription());
        case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__LOWER_THRESHOLD:
            return this.getLowerThreshold() != null;
        case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__UPPER_THRESHOLD:
            return this.getUpperThreshold() != null;
        case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__MEASUREMENT_SPECIFICATION:
            return this.basicGetMeasurementSpecification() != null;
        }
        return super.eIsSet(featureID);
    }

} // ServiceLevelObjectiveImpl

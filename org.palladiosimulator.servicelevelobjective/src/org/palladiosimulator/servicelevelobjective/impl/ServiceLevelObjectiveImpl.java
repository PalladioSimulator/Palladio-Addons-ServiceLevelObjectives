/**
 */
package org.palladiosimulator.servicelevelobjective.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
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
     * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected String description = DESCRIPTION_EDEFAULT;

    /**
     * The cached value of the '{@link #getLowerThreshold() <em>Lower Threshold</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getLowerThreshold()
     * @generated
     * @ordered
     */
    protected Threshold lowerThreshold;

    /**
     * The cached value of the '{@link #getUpperThreshold() <em>Upper Threshold</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getUpperThreshold()
     * @generated
     * @ordered
     */
    protected Threshold upperThreshold;

    /**
     * The cached value of the '{@link #getMeasurementSpecification()
     * <em>Measurement Specification</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getMeasurementSpecification()
     * @generated
     * @ordered
     */
    protected MeasurementSpecification measurementSpecification;

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
        return this.description;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDescription(final String newDescription) {
        final String oldDescription = this.description;
        this.description = newDescription;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__DESCRIPTION, oldDescription, this.description));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Threshold getLowerThreshold() {
        return this.lowerThreshold;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetLowerThreshold(final Threshold newLowerThreshold, NotificationChain msgs) {
        final Threshold oldLowerThreshold = this.lowerThreshold;
        this.lowerThreshold = newLowerThreshold;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__LOWER_THRESHOLD, oldLowerThreshold,
                    newLowerThreshold);
            if (msgs == null) {
                msgs = notification;
            } else {
                msgs.add(notification);
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setLowerThreshold(final Threshold newLowerThreshold) {
        if (newLowerThreshold != this.lowerThreshold) {
            NotificationChain msgs = null;
            if (this.lowerThreshold != null) {
                msgs = ((InternalEObject) this.lowerThreshold).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__LOWER_THRESHOLD, null, msgs);
            }
            if (newLowerThreshold != null) {
                msgs = ((InternalEObject) newLowerThreshold).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__LOWER_THRESHOLD, null, msgs);
            }
            msgs = this.basicSetLowerThreshold(newLowerThreshold, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__LOWER_THRESHOLD, newLowerThreshold,
                    newLowerThreshold));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Threshold getUpperThreshold() {
        return this.upperThreshold;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetUpperThreshold(final Threshold newUpperThreshold, NotificationChain msgs) {
        final Threshold oldUpperThreshold = this.upperThreshold;
        this.upperThreshold = newUpperThreshold;
        if (this.eNotificationRequired()) {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__UPPER_THRESHOLD, oldUpperThreshold,
                    newUpperThreshold);
            if (msgs == null) {
                msgs = notification;
            } else {
                msgs.add(notification);
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setUpperThreshold(final Threshold newUpperThreshold) {
        if (newUpperThreshold != this.upperThreshold) {
            NotificationChain msgs = null;
            if (this.upperThreshold != null) {
                msgs = ((InternalEObject) this.upperThreshold).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__UPPER_THRESHOLD, null, msgs);
            }
            if (newUpperThreshold != null) {
                msgs = ((InternalEObject) newUpperThreshold).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__UPPER_THRESHOLD, null, msgs);
            }
            msgs = this.basicSetUpperThreshold(newUpperThreshold, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__UPPER_THRESHOLD, newUpperThreshold,
                    newUpperThreshold));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MeasurementSpecification getMeasurementSpecification() {
        if (this.measurementSpecification != null && this.measurementSpecification.eIsProxy()) {
            final InternalEObject oldMeasurementSpecification = (InternalEObject) this.measurementSpecification;
            this.measurementSpecification = (MeasurementSpecification) this.eResolveProxy(oldMeasurementSpecification);
            if (this.measurementSpecification != oldMeasurementSpecification) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__MEASUREMENT_SPECIFICATION,
                            oldMeasurementSpecification, this.measurementSpecification));
                }
            }
        }
        return this.measurementSpecification;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public MeasurementSpecification basicGetMeasurementSpecification() {
        return this.measurementSpecification;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMeasurementSpecification(final MeasurementSpecification newMeasurementSpecification) {
        final MeasurementSpecification oldMeasurementSpecification = this.measurementSpecification;
        this.measurementSpecification = newMeasurementSpecification;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__MEASUREMENT_SPECIFICATION,
                    oldMeasurementSpecification, this.measurementSpecification));
        }
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
            return DESCRIPTION_EDEFAULT == null ? this.description != null : !DESCRIPTION_EDEFAULT
            .equals(this.description);
        case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__LOWER_THRESHOLD:
            return this.lowerThreshold != null;
        case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__UPPER_THRESHOLD:
            return this.upperThreshold != null;
        case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE__MEASUREMENT_SPECIFICATION:
            return this.measurementSpecification != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String toString() {
        if (this.eIsProxy()) {
            return super.toString();
        }

        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (description: ");
        result.append(this.description);
        result.append(')');
        return result.toString();
    }

} // ServiceLevelObjectiveImpl

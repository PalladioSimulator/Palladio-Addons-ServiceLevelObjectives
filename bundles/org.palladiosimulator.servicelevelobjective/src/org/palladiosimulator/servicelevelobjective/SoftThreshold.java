/**
 */
package org.palladiosimulator.servicelevelobjective;

import javax.measure.Measure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Soft Threshold</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.servicelevelobjective.SoftThreshold#getSoftLimit <em>Soft Limit</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.servicelevelobjective.ServicelevelObjectivePackage#getSoftThreshold()
 * @model
 * @generated
 */
public interface SoftThreshold extends Threshold {
	/**
	 * Returns the value of the '<em><b>Soft Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Soft Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soft Limit</em>' attribute.
	 * @see #setSoftLimit(Measure)
	 * @see org.palladiosimulator.servicelevelobjective.ServicelevelObjectivePackage#getSoftThreshold_SoftLimit()
	 * @model dataType="org.palladiosimulator.edp2.models.ExperimentData.EJSMeasure"
	 * @generated
	 */
	Measure getSoftLimit();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.servicelevelobjective.SoftThreshold#getSoftLimit <em>Soft Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soft Limit</em>' attribute.
	 * @see #getSoftLimit()
	 * @generated
	 */
	void setSoftLimit(Measure value);

} // SoftThreshold

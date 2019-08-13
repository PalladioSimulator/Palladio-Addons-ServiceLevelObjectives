/**
 */
package org.palladiosimulator.servicelevelobjective;

import javax.measure.Measure;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Threshold</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.servicelevelobjective.Threshold#getThresholdLimit <em>Threshold Limit</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.servicelevelobjective.ServicelevelObjectivePackage#getThreshold()
 * @model abstract="true"
 * @generated
 */
public interface Threshold extends Identifier {

	/**
	 * Returns the value of the '<em><b>Threshold Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threshold Limit</em>' attribute isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold Limit</em>' attribute.
	 * @see #setThresholdLimit(Measure)
	 * @see org.palladiosimulator.servicelevelobjective.ServicelevelObjectivePackage#getThreshold_ThresholdLimit()
	 * @model dataType="org.palladiosimulator.edp2.models.ExperimentData.EJSMeasure&lt;?, ?&gt;"
	 * @generated
	 */
	Measure<?, ?> getThresholdLimit();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.servicelevelobjective.Threshold#getThresholdLimit <em>Threshold Limit</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold Limit</em>' attribute.
	 * @see #getThresholdLimit()
	 * @generated
	 */
	void setThresholdLimit(Measure<?, ?> value);

} // Threshold

/**
 */
package org.palladiosimulator.servicelevelobjective;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta
 * objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.servicelevelobjective.ServicelevelObjectiveFactory
 * @model kind="package"
 * @generated
 */
public interface ServicelevelObjectivePackage extends EPackage {

	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "servicelevelobjective";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://palladiosimulator.org/ServiceLevelObjective/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "slo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	ServicelevelObjectivePackage eINSTANCE = org.palladiosimulator.servicelevelobjective.impl.ServicelevelObjectivePackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.palladiosimulator.servicelevelobjective.impl.ServiceLevelObjectiveRepositoryImpl <em>Service Level Objective Repository</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.palladiosimulator.servicelevelobjective.impl.ServiceLevelObjectiveRepositoryImpl
	 * @see org.palladiosimulator.servicelevelobjective.impl.ServicelevelObjectivePackageImpl#getServiceLevelObjectiveRepository()
	 * @generated
	 */
	int SERVICE_LEVEL_OBJECTIVE_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Servicelevelobjectives</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVE_REPOSITORY__SERVICELEVELOBJECTIVES = 0;

	/**
	 * The number of structural features of the '<em>Service Level Objective Repository</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVE_REPOSITORY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.servicelevelobjective.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.servicelevelobjective.impl.NamedElementImpl
	 * @see org.palladiosimulator.servicelevelobjective.impl.ServicelevelObjectivePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.servicelevelobjective.impl.ServiceLevelObjectiveImpl <em>Service Level Objective</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.servicelevelobjective.impl.ServiceLevelObjectiveImpl
	 * @see org.palladiosimulator.servicelevelobjective.impl.ServicelevelObjectivePackageImpl#getServiceLevelObjective()
	 * @generated
	 */
	int SERVICE_LEVEL_OBJECTIVE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVE__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVE__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lower Threshold</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVE__LOWER_THRESHOLD = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Upper Threshold</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVE__UPPER_THRESHOLD = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Measurement Specification</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVE__MEASUREMENT_SPECIFICATION = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Service Level Objective</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.servicelevelobjective.impl.ThresholdImpl <em>Threshold</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.servicelevelobjective.impl.ThresholdImpl
	 * @see org.palladiosimulator.servicelevelobjective.impl.ServicelevelObjectivePackageImpl#getThreshold()
	 * @generated
	 */
	int THRESHOLD = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Threshold Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD__THRESHOLD_LIMIT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Threshold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.servicelevelobjective.impl.HardThresholdImpl <em>Hard Threshold</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.servicelevelobjective.impl.HardThresholdImpl
	 * @see org.palladiosimulator.servicelevelobjective.impl.ServicelevelObjectivePackageImpl#getHardThreshold()
	 * @generated
	 */
	int HARD_THRESHOLD = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARD_THRESHOLD__ID = THRESHOLD__ID;

	/**
	 * The feature id for the '<em><b>Threshold Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARD_THRESHOLD__THRESHOLD_LIMIT = THRESHOLD__THRESHOLD_LIMIT;

	/**
	 * The number of structural features of the '<em>Hard Threshold</em>' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARD_THRESHOLD_FEATURE_COUNT = THRESHOLD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.servicelevelobjective.impl.SoftThresholdImpl <em>Soft Threshold</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.servicelevelobjective.impl.SoftThresholdImpl
	 * @see org.palladiosimulator.servicelevelobjective.impl.ServicelevelObjectivePackageImpl#getSoftThreshold()
	 * @generated
	 */
	int SOFT_THRESHOLD = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_THRESHOLD__ID = THRESHOLD__ID;

	/**
	 * The feature id for the '<em><b>Threshold Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_THRESHOLD__THRESHOLD_LIMIT = THRESHOLD__THRESHOLD_LIMIT;

	/**
	 * The feature id for the '<em><b>Soft Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_THRESHOLD__SOFT_LIMIT = THRESHOLD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Soft Threshold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_THRESHOLD_FEATURE_COUNT = THRESHOLD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.servicelevelobjective.impl.LinearFuzzyThresholdImpl <em>Linear Fuzzy Threshold</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.palladiosimulator.servicelevelobjective.impl.LinearFuzzyThresholdImpl
	 * @see org.palladiosimulator.servicelevelobjective.impl.ServicelevelObjectivePackageImpl#getLinearFuzzyThreshold()
	 * @generated
	 */
	int LINEAR_FUZZY_THRESHOLD = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_FUZZY_THRESHOLD__ID = SOFT_THRESHOLD__ID;

	/**
	 * The feature id for the '<em><b>Threshold Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_FUZZY_THRESHOLD__THRESHOLD_LIMIT = SOFT_THRESHOLD__THRESHOLD_LIMIT;

	/**
	 * The feature id for the '<em><b>Soft Limit</b></em>' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_FUZZY_THRESHOLD__SOFT_LIMIT = SOFT_THRESHOLD__SOFT_LIMIT;

	/**
	 * The number of structural features of the '<em>Linear Fuzzy Threshold</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int LINEAR_FUZZY_THRESHOLD_FEATURE_COUNT = SOFT_THRESHOLD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.servicelevelobjective.impl.QuadraticFuzzyThresholdImpl <em>Quadratic Fuzzy Threshold</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.servicelevelobjective.impl.QuadraticFuzzyThresholdImpl
	 * @see org.palladiosimulator.servicelevelobjective.impl.ServicelevelObjectivePackageImpl#getQuadraticFuzzyThreshold()
	 * @generated
	 */
	int QUADRATIC_FUZZY_THRESHOLD = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUADRATIC_FUZZY_THRESHOLD__ID = SOFT_THRESHOLD__ID;

	/**
	 * The feature id for the '<em><b>Threshold Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUADRATIC_FUZZY_THRESHOLD__THRESHOLD_LIMIT = SOFT_THRESHOLD__THRESHOLD_LIMIT;

	/**
	 * The feature id for the '<em><b>Soft Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUADRATIC_FUZZY_THRESHOLD__SOFT_LIMIT = SOFT_THRESHOLD__SOFT_LIMIT;

	/**
	 * The number of structural features of the '<em>Quadratic Fuzzy Threshold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUADRATIC_FUZZY_THRESHOLD_FEATURE_COUNT = SOFT_THRESHOLD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.servicelevelobjective.impl.NegativeQuadraticFuzzyThresholdImpl <em>Negative Quadratic Fuzzy Threshold</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.servicelevelobjective.impl.NegativeQuadraticFuzzyThresholdImpl
	 * @see org.palladiosimulator.servicelevelobjective.impl.ServicelevelObjectivePackageImpl#getNegativeQuadraticFuzzyThreshold()
	 * @generated
	 */
	int NEGATIVE_QUADRATIC_FUZZY_THRESHOLD = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_QUADRATIC_FUZZY_THRESHOLD__ID = SOFT_THRESHOLD__ID;

	/**
	 * The feature id for the '<em><b>Threshold Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_QUADRATIC_FUZZY_THRESHOLD__THRESHOLD_LIMIT = SOFT_THRESHOLD__THRESHOLD_LIMIT;

	/**
	 * The feature id for the '<em><b>Soft Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_QUADRATIC_FUZZY_THRESHOLD__SOFT_LIMIT = SOFT_THRESHOLD__SOFT_LIMIT;

	/**
	 * The number of structural features of the '<em>Negative Quadratic Fuzzy Threshold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_QUADRATIC_FUZZY_THRESHOLD_FEATURE_COUNT = SOFT_THRESHOLD_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.servicelevelobjective.ServiceLevelObjectiveRepository <em>Service Level Objective Repository</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Level Objective Repository</em>'.
	 * @see org.palladiosimulator.servicelevelobjective.ServiceLevelObjectiveRepository
	 * @generated
	 */
	EClass getServiceLevelObjectiveRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.servicelevelobjective.ServiceLevelObjectiveRepository#getServicelevelobjectives <em>Servicelevelobjectives</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servicelevelobjectives</em>'.
	 * @see org.palladiosimulator.servicelevelobjective.ServiceLevelObjectiveRepository#getServicelevelobjectives()
	 * @see #getServiceLevelObjectiveRepository()
	 * @generated
	 */
	EReference getServiceLevelObjectiveRepository_Servicelevelobjectives();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.servicelevelobjective.ServiceLevelObjective <em>Service Level Objective</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Level Objective</em>'.
	 * @see org.palladiosimulator.servicelevelobjective.ServiceLevelObjective
	 * @generated
	 */
	EClass getServiceLevelObjective();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.servicelevelobjective.ServiceLevelObjective#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.palladiosimulator.servicelevelobjective.ServiceLevelObjective#getDescription()
	 * @see #getServiceLevelObjective()
	 * @generated
	 */
	EAttribute getServiceLevelObjective_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.servicelevelobjective.ServiceLevelObjective#getLowerThreshold <em>Lower Threshold</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Threshold</em>'.
	 * @see org.palladiosimulator.servicelevelobjective.ServiceLevelObjective#getLowerThreshold()
	 * @see #getServiceLevelObjective()
	 * @generated
	 */
	EReference getServiceLevelObjective_LowerThreshold();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.servicelevelobjective.ServiceLevelObjective#getUpperThreshold <em>Upper Threshold</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Threshold</em>'.
	 * @see org.palladiosimulator.servicelevelobjective.ServiceLevelObjective#getUpperThreshold()
	 * @see #getServiceLevelObjective()
	 * @generated
	 */
	EReference getServiceLevelObjective_UpperThreshold();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.servicelevelobjective.ServiceLevelObjective#getMeasurementSpecification <em>Measurement Specification</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Measurement Specification</em>'.
	 * @see org.palladiosimulator.servicelevelobjective.ServiceLevelObjective#getMeasurementSpecification()
	 * @see #getServiceLevelObjective()
	 * @generated
	 */
	EReference getServiceLevelObjective_MeasurementSpecification();

	/**
	 * Returns the meta object for class '
	 * {@link org.palladiosimulator.servicelevelobjective.Threshold <em>Threshold</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Threshold</em>'.
	 * @see org.palladiosimulator.servicelevelobjective.Threshold
	 * @generated
	 */
	EClass getThreshold();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.servicelevelobjective.Threshold#getThresholdLimit <em>Threshold Limit</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threshold Limit</em>'.
	 * @see org.palladiosimulator.servicelevelobjective.Threshold#getThresholdLimit()
	 * @see #getThreshold()
	 * @generated
	 */
	EAttribute getThreshold_ThresholdLimit();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.servicelevelobjective.HardThreshold <em>Hard Threshold</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hard Threshold</em>'.
	 * @see org.palladiosimulator.servicelevelobjective.HardThreshold
	 * @generated
	 */
	EClass getHardThreshold();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.servicelevelobjective.LinearFuzzyThreshold <em>Linear Fuzzy Threshold</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linear Fuzzy Threshold</em>'.
	 * @see org.palladiosimulator.servicelevelobjective.LinearFuzzyThreshold
	 * @generated
	 */
	EClass getLinearFuzzyThreshold();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.servicelevelobjective.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.palladiosimulator.servicelevelobjective.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.palladiosimulator.servicelevelobjective.NamedElement#getName <em>Name</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.palladiosimulator.servicelevelobjective.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.servicelevelobjective.SoftThreshold <em>Soft Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Soft Threshold</em>'.
	 * @see org.palladiosimulator.servicelevelobjective.SoftThreshold
	 * @generated
	 */
	EClass getSoftThreshold();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.servicelevelobjective.SoftThreshold#getSoftLimit <em>Soft Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Soft Limit</em>'.
	 * @see org.palladiosimulator.servicelevelobjective.SoftThreshold#getSoftLimit()
	 * @see #getSoftThreshold()
	 * @generated
	 */
	EAttribute getSoftThreshold_SoftLimit();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.servicelevelobjective.QuadraticFuzzyThreshold <em>Quadratic Fuzzy Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quadratic Fuzzy Threshold</em>'.
	 * @see org.palladiosimulator.servicelevelobjective.QuadraticFuzzyThreshold
	 * @generated
	 */
	EClass getQuadraticFuzzyThreshold();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.servicelevelobjective.NegativeQuadraticFuzzyThreshold <em>Negative Quadratic Fuzzy Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negative Quadratic Fuzzy Threshold</em>'.
	 * @see org.palladiosimulator.servicelevelobjective.NegativeQuadraticFuzzyThreshold
	 * @generated
	 */
	EClass getNegativeQuadraticFuzzyThreshold();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ServicelevelObjectiveFactory getServicelevelObjectiveFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.servicelevelobjective.impl.ServiceLevelObjectiveRepositoryImpl <em>Service Level Objective Repository</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.palladiosimulator.servicelevelobjective.impl.ServiceLevelObjectiveRepositoryImpl
		 * @see org.palladiosimulator.servicelevelobjective.impl.ServicelevelObjectivePackageImpl#getServiceLevelObjectiveRepository()
		 * @generated
		 */
		EClass SERVICE_LEVEL_OBJECTIVE_REPOSITORY = eINSTANCE.getServiceLevelObjectiveRepository();

		/**
		 * The meta object literal for the '<em><b>Servicelevelobjectives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LEVEL_OBJECTIVE_REPOSITORY__SERVICELEVELOBJECTIVES = eINSTANCE
				.getServiceLevelObjectiveRepository_Servicelevelobjectives();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.servicelevelobjective.impl.ServiceLevelObjectiveImpl <em>Service Level Objective</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.servicelevelobjective.impl.ServiceLevelObjectiveImpl
		 * @see org.palladiosimulator.servicelevelobjective.impl.ServicelevelObjectivePackageImpl#getServiceLevelObjective()
		 * @generated
		 */
		EClass SERVICE_LEVEL_OBJECTIVE = eINSTANCE.getServiceLevelObjective();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute SERVICE_LEVEL_OBJECTIVE__DESCRIPTION = eINSTANCE.getServiceLevelObjective_Description();

		/**
		 * The meta object literal for the '<em><b>Lower Threshold</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LEVEL_OBJECTIVE__LOWER_THRESHOLD = eINSTANCE.getServiceLevelObjective_LowerThreshold();

		/**
		 * The meta object literal for the '<em><b>Upper Threshold</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LEVEL_OBJECTIVE__UPPER_THRESHOLD = eINSTANCE.getServiceLevelObjective_UpperThreshold();

		/**
		 * The meta object literal for the '<em><b>Measurement Specification</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LEVEL_OBJECTIVE__MEASUREMENT_SPECIFICATION = eINSTANCE
				.getServiceLevelObjective_MeasurementSpecification();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.servicelevelobjective.impl.ThresholdImpl <em>Threshold</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.servicelevelobjective.impl.ThresholdImpl
		 * @see org.palladiosimulator.servicelevelobjective.impl.ServicelevelObjectivePackageImpl#getThreshold()
		 * @generated
		 */
		EClass THRESHOLD = eINSTANCE.getThreshold();

		/**
		 * The meta object literal for the '<em><b>Threshold Limit</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute THRESHOLD__THRESHOLD_LIMIT = eINSTANCE.getThreshold_ThresholdLimit();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.servicelevelobjective.impl.HardThresholdImpl <em>Hard Threshold</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.servicelevelobjective.impl.HardThresholdImpl
		 * @see org.palladiosimulator.servicelevelobjective.impl.ServicelevelObjectivePackageImpl#getHardThreshold()
		 * @generated
		 */
		EClass HARD_THRESHOLD = eINSTANCE.getHardThreshold();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.servicelevelobjective.impl.LinearFuzzyThresholdImpl <em>Linear Fuzzy Threshold</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.servicelevelobjective.impl.LinearFuzzyThresholdImpl
		 * @see org.palladiosimulator.servicelevelobjective.impl.ServicelevelObjectivePackageImpl#getLinearFuzzyThreshold()
		 * @generated
		 */
		EClass LINEAR_FUZZY_THRESHOLD = eINSTANCE.getLinearFuzzyThreshold();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.servicelevelobjective.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.palladiosimulator.servicelevelobjective.impl.NamedElementImpl
		 * @see org.palladiosimulator.servicelevelobjective.impl.ServicelevelObjectivePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.servicelevelobjective.impl.SoftThresholdImpl <em>Soft Threshold</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.servicelevelobjective.impl.SoftThresholdImpl
		 * @see org.palladiosimulator.servicelevelobjective.impl.ServicelevelObjectivePackageImpl#getSoftThreshold()
		 * @generated
		 */
		EClass SOFT_THRESHOLD = eINSTANCE.getSoftThreshold();

		/**
		 * The meta object literal for the '<em><b>Soft Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFT_THRESHOLD__SOFT_LIMIT = eINSTANCE.getSoftThreshold_SoftLimit();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.servicelevelobjective.impl.QuadraticFuzzyThresholdImpl <em>Quadratic Fuzzy Threshold</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.servicelevelobjective.impl.QuadraticFuzzyThresholdImpl
		 * @see org.palladiosimulator.servicelevelobjective.impl.ServicelevelObjectivePackageImpl#getQuadraticFuzzyThreshold()
		 * @generated
		 */
		EClass QUADRATIC_FUZZY_THRESHOLD = eINSTANCE.getQuadraticFuzzyThreshold();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.servicelevelobjective.impl.NegativeQuadraticFuzzyThresholdImpl <em>Negative Quadratic Fuzzy Threshold</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.servicelevelobjective.impl.NegativeQuadraticFuzzyThresholdImpl
		 * @see org.palladiosimulator.servicelevelobjective.impl.ServicelevelObjectivePackageImpl#getNegativeQuadraticFuzzyThreshold()
		 * @generated
		 */
		EClass NEGATIVE_QUADRATIC_FUZZY_THRESHOLD = eINSTANCE.getNegativeQuadraticFuzzyThreshold();

	}

} // ServicelevelObjectivePackage

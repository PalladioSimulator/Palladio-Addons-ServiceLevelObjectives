/**
 */
package org.palladiosimulator.servicelevelobjective.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.Repository.RepositoryPackage;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage;
import org.palladiosimulator.metricspec.MetricSpecPackage;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;
import org.palladiosimulator.pcm.PcmPackage;
import org.palladiosimulator.servicelevelobjective.HardThreshold;
import org.palladiosimulator.servicelevelobjective.LinearFuzzyThreshold;
import org.palladiosimulator.servicelevelobjective.NamedElement;
import org.palladiosimulator.servicelevelobjective.NegativeQuadraticFuzzyThreshold;
import org.palladiosimulator.servicelevelobjective.QuadraticFuzzyThreshold;
import org.palladiosimulator.servicelevelobjective.ServiceLevelObjective;
import org.palladiosimulator.servicelevelobjective.ServiceLevelObjectiveRepository;
import org.palladiosimulator.servicelevelobjective.ServicelevelObjectiveFactory;
import org.palladiosimulator.servicelevelobjective.ServicelevelObjectivePackage;
import org.palladiosimulator.servicelevelobjective.SoftThreshold;
import org.palladiosimulator.servicelevelobjective.Threshold;

import de.uka.ipd.sdq.identifier.IdentifierPackage;
import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.units.UnitsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * @generated
 */
public class ServicelevelObjectivePackageImpl extends EPackageImpl implements ServicelevelObjectivePackage {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceLevelObjectiveRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceLevelObjectiveEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thresholdEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardThresholdEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linearFuzzyThresholdEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softThresholdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quadraticFuzzyThresholdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negativeQuadraticFuzzyThresholdEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.palladiosimulator.servicelevelobjective.ServicelevelObjectivePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ServicelevelObjectivePackageImpl() {
		super(eNS_URI, ServicelevelObjectiveFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ServicelevelObjectivePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ServicelevelObjectivePackage init() {
		if (isInited)
			return (ServicelevelObjectivePackage) EPackage.Registry.INSTANCE
					.getEPackage(ServicelevelObjectivePackage.eNS_URI);

		// Obtain or create and register package
		ServicelevelObjectivePackageImpl theServicelevelObjectivePackage = (ServicelevelObjectivePackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ServicelevelObjectivePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new ServicelevelObjectivePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ExperimentDataPackage.eINSTANCE.eClass();
		RepositoryPackage.eINSTANCE.eClass();
		MeasuringpointPackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		MetricSpecPackage.eINSTANCE.eClass();
		MonitorRepositoryPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theServicelevelObjectivePackage.createPackageContents();

		// Initialize created meta-data
		theServicelevelObjectivePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theServicelevelObjectivePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ServicelevelObjectivePackage.eNS_URI, theServicelevelObjectivePackage);
		return theServicelevelObjectivePackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceLevelObjectiveRepository() {
		return serviceLevelObjectiveRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceLevelObjectiveRepository_Servicelevelobjectives() {
		return (EReference) serviceLevelObjectiveRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceLevelObjective() {
		return serviceLevelObjectiveEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceLevelObjective_Description() {
		return (EAttribute) serviceLevelObjectiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceLevelObjective_LowerThreshold() {
		return (EReference) serviceLevelObjectiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceLevelObjective_UpperThreshold() {
		return (EReference) serviceLevelObjectiveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceLevelObjective_MeasurementSpecification() {
		return (EReference) serviceLevelObjectiveEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThreshold() {
		return thresholdEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThreshold_ThresholdLimit() {
		return (EAttribute) thresholdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHardThreshold() {
		return hardThresholdEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLinearFuzzyThreshold() {
		return linearFuzzyThresholdEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSoftThreshold() {
		return softThresholdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSoftThreshold_SoftLimit() {
		return (EAttribute) softThresholdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuadraticFuzzyThreshold() {
		return quadraticFuzzyThresholdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNegativeQuadraticFuzzyThreshold() {
		return negativeQuadraticFuzzyThresholdEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServicelevelObjectiveFactory getServicelevelObjectiveFactory() {
		return (ServicelevelObjectiveFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		serviceLevelObjectiveRepositoryEClass = createEClass(SERVICE_LEVEL_OBJECTIVE_REPOSITORY);
		createEReference(serviceLevelObjectiveRepositoryEClass,
				SERVICE_LEVEL_OBJECTIVE_REPOSITORY__SERVICELEVELOBJECTIVES);

		serviceLevelObjectiveEClass = createEClass(SERVICE_LEVEL_OBJECTIVE);
		createEAttribute(serviceLevelObjectiveEClass, SERVICE_LEVEL_OBJECTIVE__DESCRIPTION);
		createEReference(serviceLevelObjectiveEClass, SERVICE_LEVEL_OBJECTIVE__LOWER_THRESHOLD);
		createEReference(serviceLevelObjectiveEClass, SERVICE_LEVEL_OBJECTIVE__UPPER_THRESHOLD);
		createEReference(serviceLevelObjectiveEClass, SERVICE_LEVEL_OBJECTIVE__MEASUREMENT_SPECIFICATION);

		thresholdEClass = createEClass(THRESHOLD);
		createEAttribute(thresholdEClass, THRESHOLD__THRESHOLD_LIMIT);

		hardThresholdEClass = createEClass(HARD_THRESHOLD);

		linearFuzzyThresholdEClass = createEClass(LINEAR_FUZZY_THRESHOLD);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		softThresholdEClass = createEClass(SOFT_THRESHOLD);
		createEAttribute(softThresholdEClass, SOFT_THRESHOLD__SOFT_LIMIT);

		quadraticFuzzyThresholdEClass = createEClass(QUADRATIC_FUZZY_THRESHOLD);

		negativeQuadraticFuzzyThresholdEClass = createEClass(NEGATIVE_QUADRATIC_FUZZY_THRESHOLD);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		MonitorRepositoryPackage theMonitorRepositoryPackage = (MonitorRepositoryPackage) EPackage.Registry.INSTANCE
				.getEPackage(MonitorRepositoryPackage.eNS_URI);
		IdentifierPackage theIdentifierPackage = (IdentifierPackage) EPackage.Registry.INSTANCE
				.getEPackage(IdentifierPackage.eNS_URI);
		ExperimentDataPackage theExperimentDataPackage = (ExperimentDataPackage) EPackage.Registry.INSTANCE
				.getEPackage(ExperimentDataPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		serviceLevelObjectiveEClass.getESuperTypes().add(this.getNamedElement());
		thresholdEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		hardThresholdEClass.getESuperTypes().add(this.getThreshold());
		linearFuzzyThresholdEClass.getESuperTypes().add(this.getSoftThreshold());
		namedElementEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		softThresholdEClass.getESuperTypes().add(this.getThreshold());
		quadraticFuzzyThresholdEClass.getESuperTypes().add(this.getSoftThreshold());
		negativeQuadraticFuzzyThresholdEClass.getESuperTypes().add(this.getSoftThreshold());

		// Initialize classes and features; add operations and parameters
		initEClass(serviceLevelObjectiveRepositoryEClass, ServiceLevelObjectiveRepository.class,
				"ServiceLevelObjectiveRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceLevelObjectiveRepository_Servicelevelobjectives(), this.getServiceLevelObjective(),
				null, "servicelevelobjectives", null, 0, -1, ServiceLevelObjectiveRepository.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(serviceLevelObjectiveEClass, ServiceLevelObjective.class, "ServiceLevelObjective", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceLevelObjective_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				ServiceLevelObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceLevelObjective_LowerThreshold(), this.getThreshold(), null, "lowerThreshold", null, 0,
				1, ServiceLevelObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceLevelObjective_UpperThreshold(), this.getThreshold(), null, "upperThreshold", null, 0,
				1, ServiceLevelObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceLevelObjective_MeasurementSpecification(),
				theMonitorRepositoryPackage.getMeasurementSpecification(), null, "measurementSpecification", null, 0, 1,
				ServiceLevelObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thresholdEClass, Threshold.class, "Threshold", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		EGenericType g1 = createEGenericType(theExperimentDataPackage.getEJSMeasure());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getThreshold_ThresholdLimit(), g1, "thresholdLimit", null, 0, 1, Threshold.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hardThresholdEClass, HardThreshold.class, "HardThreshold", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(linearFuzzyThresholdEClass, LinearFuzzyThreshold.class, "LinearFuzzyThreshold", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(softThresholdEClass, SoftThreshold.class, "SoftThreshold", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoftThreshold_SoftLimit(), theExperimentDataPackage.getEJSMeasure(), "softLimit", null, 0, 1,
				SoftThreshold.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(quadraticFuzzyThresholdEClass, QuadraticFuzzyThreshold.class, "QuadraticFuzzyThreshold",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(negativeQuadraticFuzzyThresholdEClass, NegativeQuadraticFuzzyThreshold.class,
				"NegativeQuadraticFuzzyThreshold", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} // ServicelevelObjectivePackageImpl

/**
 */
package org.palladiosimulator.servicelevelobjective.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.servicelevelobjective.*;
import org.palladiosimulator.servicelevelobjective.HardThreshold;
import org.palladiosimulator.servicelevelobjective.LinearFuzzyThreshold;
import org.palladiosimulator.servicelevelobjective.NamedElement;
import org.palladiosimulator.servicelevelobjective.ServiceLevelObjective;
import org.palladiosimulator.servicelevelobjective.ServiceLevelObjectiveRepository;
import org.palladiosimulator.servicelevelobjective.ServicelevelObjectiveFactory;
import org.palladiosimulator.servicelevelobjective.ServicelevelObjectivePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class ServicelevelObjectiveFactoryImpl extends EFactoryImpl implements ServicelevelObjectiveFactory {

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static ServicelevelObjectiveFactory init() {
		try {
			ServicelevelObjectiveFactory theServicelevelObjectiveFactory = (ServicelevelObjectiveFactory) EPackage.Registry.INSTANCE
					.getEFactory(ServicelevelObjectivePackage.eNS_URI);
			if (theServicelevelObjectiveFactory != null) {
				return theServicelevelObjectiveFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ServicelevelObjectiveFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ServicelevelObjectiveFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE_REPOSITORY:
			return createServiceLevelObjectiveRepository();
		case ServicelevelObjectivePackage.SERVICE_LEVEL_OBJECTIVE:
			return createServiceLevelObjective();
		case ServicelevelObjectivePackage.HARD_THRESHOLD:
			return createHardThreshold();
		case ServicelevelObjectivePackage.LINEAR_FUZZY_THRESHOLD:
			return createLinearFuzzyThreshold();
		case ServicelevelObjectivePackage.NAMED_ELEMENT:
			return createNamedElement();
		case ServicelevelObjectivePackage.SOFT_THRESHOLD:
			return createSoftThreshold();
		case ServicelevelObjectivePackage.QUADRATIC_FUZZY_THRESHOLD:
			return createQuadraticFuzzyThreshold();
		case ServicelevelObjectivePackage.NEGATIVE_QUADRATIC_FUZZY_THRESHOLD:
			return createNegativeQuadraticFuzzyThreshold();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceLevelObjectiveRepository createServiceLevelObjectiveRepository() {
		ServiceLevelObjectiveRepositoryImpl serviceLevelObjectiveRepository = new ServiceLevelObjectiveRepositoryImpl();
		return serviceLevelObjectiveRepository;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceLevelObjective createServiceLevelObjective() {
		ServiceLevelObjectiveImpl serviceLevelObjective = new ServiceLevelObjectiveImpl();
		return serviceLevelObjective;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HardThreshold createHardThreshold() {
		HardThresholdImpl hardThreshold = new HardThresholdImpl();
		return hardThreshold;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinearFuzzyThreshold createLinearFuzzyThreshold() {
		LinearFuzzyThresholdImpl linearFuzzyThreshold = new LinearFuzzyThresholdImpl();
		return linearFuzzyThreshold;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SoftThreshold createSoftThreshold() {
		SoftThresholdImpl softThreshold = new SoftThresholdImpl();
		return softThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuadraticFuzzyThreshold createQuadraticFuzzyThreshold() {
		QuadraticFuzzyThresholdImpl quadraticFuzzyThreshold = new QuadraticFuzzyThresholdImpl();
		return quadraticFuzzyThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NegativeQuadraticFuzzyThreshold createNegativeQuadraticFuzzyThreshold() {
		NegativeQuadraticFuzzyThresholdImpl negativeQuadraticFuzzyThreshold = new NegativeQuadraticFuzzyThresholdImpl();
		return negativeQuadraticFuzzyThreshold;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServicelevelObjectivePackage getServicelevelObjectivePackage() {
		return (ServicelevelObjectivePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ServicelevelObjectivePackage getPackage() {
		return ServicelevelObjectivePackage.eINSTANCE;
	}

} // ServicelevelObjectiveFactoryImpl

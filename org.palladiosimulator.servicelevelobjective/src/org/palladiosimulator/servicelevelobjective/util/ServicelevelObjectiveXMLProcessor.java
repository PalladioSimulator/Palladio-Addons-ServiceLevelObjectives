/**
 */
package org.palladiosimulator.servicelevelobjective.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.palladiosimulator.servicelevelobjective.ServicelevelObjectivePackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 *
 * @generated
 */
public class ServicelevelObjectiveXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ServicelevelObjectiveXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        ServicelevelObjectivePackage.eINSTANCE.eClass();
    }

    /**
     * Register for "*" and "xml" file extensions the ServicelevelObjectiveResourceFactoryImpl
     * factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (this.registrations == null) {
            super.getRegistrations();
            this.registrations.put(XML_EXTENSION, new ServicelevelObjectiveResourceFactoryImpl());
            this.registrations.put(STAR_EXTENSION, new ServicelevelObjectiveResourceFactoryImpl());
        }
        return this.registrations;
    }

} // ServicelevelObjectiveXMLProcessor

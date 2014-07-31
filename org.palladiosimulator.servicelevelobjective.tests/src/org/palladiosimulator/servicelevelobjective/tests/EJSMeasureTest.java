package org.palladiosimulator.servicelevelobjective.tests;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Collections;

import javax.measure.DecimalMeasure;
import javax.measure.Measure;
import javax.measure.quantity.Duration;
import javax.measure.unit.SI;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Test;
import org.palladiosimulator.servicelevelobjective.HardThreshold;
import org.palladiosimulator.servicelevelobjective.ServicelevelObjectiveFactory;
import org.palladiosimulator.servicelevelobjective.ServicelevelObjectivePackage;

public class EJSMeasureTest {

    private static final double DURATION_THRESHOLD = 3.0d;

    @Test
    public void test() {
        final Measure<Double, Duration> durationThreshold = DecimalMeasure.valueOf(DURATION_THRESHOLD, SI.SECOND);
        final double doubleValue = durationThreshold.getValue();
        assertTrue(doubleValue == DURATION_THRESHOLD);

        ServicelevelObjectivePackage.eINSTANCE.eClass(); // initialize model
        final ServicelevelObjectiveFactory sloFactory = ServicelevelObjectiveFactory.eINSTANCE;

        final HardThreshold hardThresold = sloFactory.createHardThreshold();
        hardThresold.setThresholdLimit(durationThreshold);

        final ResourceSet resourceSet = new ResourceSetImpl();
        final URI uri = URI.createURI("test.slo");
        final Resource resource = resourceSet.createResource(uri);
        resource.getContents().add(hardThresold);        

        try {
            resource.save(Collections.EMPTY_MAP);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
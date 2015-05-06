package org.palladiosimulator.servicelevelobjective.filters;

import org.eclipse.ui.IMemento;
import org.palladiosimulator.edp2.datastream.configurable.DataSinkElementFactory;
import org.palladiosimulator.edp2.datastream.configurable.IPropertyConfigurable;

public class SLOViolationEDP2DatasourceFilterFactory extends DataSinkElementFactory {

    public static final String FACTORY_ID = SLOViolationEDP2DatasourceFilterFactory.class
            .getCanonicalName();

    @Override
    protected IPropertyConfigurable createElementInternal(final IMemento memento) {
        return new SLOViolationEDP2DatasourceFilter();
    }

}

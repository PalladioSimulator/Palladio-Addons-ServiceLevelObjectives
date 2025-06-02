package org.palladiosimulator.servicelevelobjective.edp2.mappers;

import org.eclipse.ui.IMemento;
import org.palladiosimulator.edp2.datastream.configurable.IPropertyConfigurable;
import org.palladiosimulator.edp2.datastream.ui.configurable.DataSinkElementFactory;

public class SLOViolationEDP2DatasourceMapperFactory  extends DataSinkElementFactory {

    public static final String FACTORY_ID = SLOViolationEDP2DatasourceMapperFactory.class
            .getCanonicalName();

    @Override
    protected IPropertyConfigurable createElementInternal(final IMemento memento) {
        return new SLOViolationEDP2DatasourceMapper();
    }

}

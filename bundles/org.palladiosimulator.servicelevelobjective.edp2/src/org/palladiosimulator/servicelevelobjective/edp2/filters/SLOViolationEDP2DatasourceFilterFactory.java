package org.palladiosimulator.servicelevelobjective.edp2.filters;

import org.eclipse.ui.IMemento;
import org.palladiosimulator.edp2.datastream.configurable.IPropertyConfigurable;
import org.palladiosimulator.edp2.datastream.ui.configurable.DataSinkElementFactory;
import org.palladiosimulator.servicelevelobjective.edp2.core.filters.SLOViolationEDP2DatasourceFilter;

public class SLOViolationEDP2DatasourceFilterFactory extends DataSinkElementFactory {

    public static final String FACTORY_ID = SLOViolationEDP2DatasourceFilterFactory.class
            .getCanonicalName();

    @Override
    protected IPropertyConfigurable createElementInternal(final IMemento memento) {
        return new SLOViolationEDP2DatasourceFilter();
    }

}

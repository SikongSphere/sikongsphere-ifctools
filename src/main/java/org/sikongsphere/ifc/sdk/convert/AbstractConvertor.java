package org.sikongsphere.ifc.sdk.convert;

import org.sikongsphere.ifc.model.fileelement.IfcFileModel;

public abstract class AbstractConvertor<T> implements Convertor<T> {
    public AbstractConvertor<?> convert(Class<T> clazz) {
        if (clazz == IfcFileModel.class) {
            return new IfcModelConvertor();
        }
        return null;
    }
}

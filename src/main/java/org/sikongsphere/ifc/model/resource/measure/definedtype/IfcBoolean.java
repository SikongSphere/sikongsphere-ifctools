package org.sikongsphere.ifc.model.resource.measure.definedtype;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.basic.BOOLEAN;
import org.sikongsphere.ifc.model.basic.STRING;
import org.sikongsphere.ifc.model.resource.measure.selecttypes.IfcValue;

/**
 * @author Wang Bohong
 * @date 2022/11/12 20:13
 */
@IfcClass(type = IfcType.DEFINED_TYPE, layer = IfcLayer.RESOURCE)
public class IfcBoolean extends BOOLEAN implements IfcValue {
    public IfcBoolean() {
    }

    public IfcBoolean(boolean value) {
        super(value);
    }

    @IfcParserConstructor
    public IfcBoolean(STRING value) {
        String str = value.value;
        if (str != null) {
            if(str.indexOf("T") != -1) {
                super.setValue(true);
            }
        }
    }
}

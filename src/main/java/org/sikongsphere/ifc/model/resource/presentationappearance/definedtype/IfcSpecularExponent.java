package org.sikongsphere.ifc.model.resource.presentationappearance.definedtype;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.basic.DOUBLE;
import org.sikongsphere.ifc.model.basic.STRING;
import org.sikongsphere.ifc.model.resource.presentationappearance.selecttype.IfcSpecularHighlightSelect;

/**
 * @author Wang Bohong
 * @date 2022/11/12 14:27
 */
@IfcClass(type = IfcType.DEFINED_TYPE, layer = IfcLayer.RESOURCE)
public class IfcSpecularExponent extends DOUBLE implements IfcSpecularHighlightSelect {

    public IfcSpecularExponent() {
    }

    public IfcSpecularExponent(double value) {
        super(value);
    }

    @IfcParserConstructor
    public IfcSpecularExponent(STRING value) {
        super(value);
    }
}

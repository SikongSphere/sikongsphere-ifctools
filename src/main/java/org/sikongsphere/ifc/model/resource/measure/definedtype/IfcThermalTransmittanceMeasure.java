package org.sikongsphere.ifc.model.resource.measure.definedtype;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.basic.DOUBLE;
import org.sikongsphere.ifc.model.basic.STRING;
import org.sikongsphere.ifc.model.resource.measure.selecttypes.IfcValue;

/**
 * @author Wang Bohong
 * @date 2022/11/13 11:30
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcThermalTransmittanceMeasure extends DOUBLE implements IfcValue {

    public IfcThermalTransmittanceMeasure() {
    }

    public IfcThermalTransmittanceMeasure(double value) {
        super(value);
    }

    @IfcParserConstructor
    public IfcThermalTransmittanceMeasure(STRING value) {
        super(value);
    }
}

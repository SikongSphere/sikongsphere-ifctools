
package org.sikongsphere.ifc.model.resource.measure.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.resource.measure.selecttypes.IfcUnit;
import org.sikongsphere.ifc.model.resource.measure.selecttypes.IfcValue;

/**
 * @author Wang Bohong
 * @date 2022/10/11 21:09
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcMeasureWithUnit {
    private IfcValue valueComponent;
    private IfcUnit unitComponent;

    public IfcMeasureWithUnit() {}

    @IfcParserConstructor
    public IfcMeasureWithUnit(IfcValue valueComponent, IfcUnit unitComponent) {
        this.valueComponent = valueComponent;
        this.unitComponent = unitComponent;
    }

    public IfcValue getValueComponent() {
        return valueComponent;
    }

    public void setValueComponent(IfcValue valueComponent) {
        this.valueComponent = valueComponent;
    }

    public IfcUnit getUnitComponent() {
        return unitComponent;
    }

    public void setUnitComponent(IfcUnit unitComponent) {
        this.unitComponent = unitComponent;
    }
}

/*
 * Copyright 2022 SikongSphere
 *
 * This program is free software; you can redistribute it and/or modify it under the terms of the
 * GNU General Public License version 2 as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
*/
package org.sikongsphere.ifc.model.schema.resource.structuralload.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcForceMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLengthMeasure;

/**
 * Instances of the entity IfcSlippageConnectionCondition shall be used to describe connection properties needed to specify slippage.
 *
 * @author yiwei
 * @date 2022-08-28 18:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcSlippageConnectionCondition extends IfcStructuralConnectionCondition {
    @IfcOptionField
    private IfcLengthMeasure slippageX;
    @IfcOptionField
    private IfcLengthMeasure slippageY;
    @IfcOptionField
    private IfcLengthMeasure slippageZ;

    public IfcSlippageConnectionCondition(
        IfcLabel name,
        IfcLengthMeasure slippageX,
        IfcLengthMeasure slippageY,
        IfcLengthMeasure slippageZ
    ) {
        super(name);
        this.slippageX = slippageX;
        this.slippageY = slippageY;
        this.slippageZ = slippageZ;
    }

    public IfcLengthMeasure getSlippageX() {
        return slippageX;
    }

    public void setSlippageX(IfcLengthMeasure slippageX) {
        this.slippageX = slippageX;
    }

    public IfcLengthMeasure getSlippageY() {
        return slippageY;
    }

    public void setSlippageY(IfcLengthMeasure slippageY) {
        this.slippageY = slippageY;
    }

    public IfcLengthMeasure getSlippageZ() {
        return slippageZ;
    }

    public void setSlippageZ(IfcLengthMeasure slippageZ) {
        this.slippageZ = slippageZ;
    }

}

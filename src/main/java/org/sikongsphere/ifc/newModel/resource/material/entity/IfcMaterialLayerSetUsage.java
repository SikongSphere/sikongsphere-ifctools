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
package org.sikongsphere.ifc.newModel.resource.material.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.body.IfcBodyTemplate;
import org.sikongsphere.ifc.newModel.resource.material.enumeration.IfcDirectionSenseEnum;
import org.sikongsphere.ifc.newModel.resource.material.enumeration.IfcLayerSetDirectionEnum;
import org.sikongsphere.ifc.newModel.resource.material.select_type.IfcMaterialSelect;
import org.sikongsphere.ifc.newModel.resource.measure.definedtype.IfcLengthMeasure;

/**
 * @author Wang Bohong
 * @date 2022/10/17 15:42
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcMaterialLayerSetUsage extends IfcBodyTemplate implements IfcMaterialSelect {
    private IfcMaterialLayerSet forLayerSet;
    private IfcLayerSetDirectionEnum layerSetDirection;
    private IfcDirectionSenseEnum directionSense;
    private IfcLengthMeasure offsetFromReferenceLine;

    public IfcMaterialLayerSetUsage() {}

    @IfcParserConstructor
    public IfcMaterialLayerSetUsage(
        IfcMaterialLayerSet forLayerSet,
        IfcLayerSetDirectionEnum layerSetDirection,
        IfcDirectionSenseEnum directionSense,
        IfcLengthMeasure offsetFromReferenceLine
    ) {
        this.forLayerSet = forLayerSet;
        this.layerSetDirection = layerSetDirection;
        this.directionSense = directionSense;
        this.offsetFromReferenceLine = offsetFromReferenceLine;
    }

    public IfcMaterialLayerSet getForLayerSet() {
        return forLayerSet;
    }

    public void setForLayerSet(IfcMaterialLayerSet forLayerSet) {
        this.forLayerSet = forLayerSet;
    }

    public IfcLayerSetDirectionEnum getLayerSetDirection() {
        return layerSetDirection;
    }

    public void setLayerSetDirection(IfcLayerSetDirectionEnum layerSetDirection) {
        this.layerSetDirection = layerSetDirection;
    }

    public IfcDirectionSenseEnum getDirectionSense() {
        return directionSense;
    }

    public void setDirectionSense(IfcDirectionSenseEnum directionSense) {
        this.directionSense = directionSense;
    }

    public IfcLengthMeasure getOffsetFromReferenceLine() {
        return offsetFromReferenceLine;
    }

    public void setOffsetFromReferenceLine(IfcLengthMeasure offsetFromReferenceLine) {
        this.offsetFromReferenceLine = offsetFromReferenceLine;
    }
}

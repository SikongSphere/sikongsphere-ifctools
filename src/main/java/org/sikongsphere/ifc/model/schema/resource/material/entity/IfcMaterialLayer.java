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
package org.sikongsphere.ifc.model.schema.resource.material.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.material.selectType.IfcMaterialSelect;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLogical;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPositiveLengthMeasure;
import org.sikongsphere.ifc.model.schema.resource.property.selectType.IfcObjectReferenceSelect;

/**
 * IfcMaterialLayer
 *
 * @author GaoSu
 * @date 2022/10/16 16:09
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcMaterialLayer extends IfcAbstractClass
    implements
        IfcMaterialSelect,
        IfcObjectReferenceSelect {
    private IfcMaterial material;
    private IfcPositiveLengthMeasure layerThickness;
    private IfcLogical isVentilated;

    public IfcMaterialLayer() {}

    @IfcParserConstructor

    public IfcMaterialLayer(
        IfcMaterial material,
        IfcPositiveLengthMeasure layerThickness,
        IfcLogical isVentilated
    ) {
        this.material = material;
        this.layerThickness = layerThickness;
        this.isVentilated = isVentilated;
    }

    public IfcMaterial getMaterial() {
        return material;
    }

    public void setMaterial(IfcMaterial material) {
        this.material = material;
    }

    public IfcPositiveLengthMeasure getLayerThickness() {
        return layerThickness;
    }

    public void setLayerThickness(IfcPositiveLengthMeasure layerThickness) {
        this.layerThickness = layerThickness;
    }

    public IfcLogical getIsVentilated() {
        return isVentilated;
    }

    public void setIsVentilated(IfcLogical isVentilated) {
        this.isVentilated = isVentilated;
    }
}

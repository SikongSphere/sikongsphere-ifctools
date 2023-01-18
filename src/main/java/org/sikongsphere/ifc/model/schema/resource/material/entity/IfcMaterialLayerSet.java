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
import org.sikongsphere.ifc.common.annotation.IfcDeriveParameter;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.material.selectType.IfcMaterialSelect;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLengthMeasure;

/**
 * A designation by which materials of an element constructed of a number of material layers is known and through
 * which the relative positioning of individual layers can be expressed.
 *
 * @author GaoSu
 * @date 2022/10/16 16:11
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcMaterialLayerSet extends IfcAbstractClass implements IfcMaterialSelect {
    private LIST<IfcMaterialLayer> materialLayers;
    @IfcOptionField
    private IfcLabel layerSetName;
    @IfcDeriveParameter
    private IfcLengthMeasure totalThickness;

    public IfcMaterialLayerSet() {}

    @IfcParserConstructor
    public IfcMaterialLayerSet(LIST<IfcMaterialLayer> materialLayers, IfcLabel layerSetName) {
        this.materialLayers = materialLayers;
        this.layerSetName = layerSetName;
    }

    public LIST<IfcMaterialLayer> getMaterialLayers() {
        return materialLayers;
    }

    public void setMaterialLayers(LIST<IfcMaterialLayer> materialLayers) {
        this.materialLayers = materialLayers;
    }

    public IfcLabel getLayerSetName() {
        return layerSetName;
    }

    public void setLayerSetName(IfcLabel layerSetName) {
        this.layerSetName = layerSetName;
    }

    public IfcLengthMeasure getTotalThickness() {
        return totalThickness;
    }

    public void setTotalThickness(IfcLengthMeasure totalThickness) {
        this.totalThickness = totalThickness;
    }
}

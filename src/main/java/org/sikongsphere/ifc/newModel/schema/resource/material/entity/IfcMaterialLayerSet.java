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
package org.sikongsphere.ifc.newModel.schema.resource.material.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.datatype.LIST;
import org.sikongsphere.ifc.newModel.IfcAbstractClass;
import org.sikongsphere.ifc.newModel.schema.resource.material.selectType.IfcMaterialSelect;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedType.IfcLabel;

/**
 * IfcMaterialLayerSet
 *
 * @author GaoSu
 * @date 2022/10/16 16:11
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcMaterialLayerSet extends IfcAbstractClass implements IfcMaterialSelect {
    private LIST<IfcMaterialLayer> materialLayers;
    private IfcLabel layerSetName;

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
}

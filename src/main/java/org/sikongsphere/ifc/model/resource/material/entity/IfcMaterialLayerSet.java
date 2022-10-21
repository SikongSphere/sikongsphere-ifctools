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
package org.sikongsphere.ifc.model.resource.material.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.body.IfcBodyTemplate;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcLabel;

import java.util.List;

/**
 * IfcMaterialLayerSet
 *
 * @author GaoSu
 * @date 2022/10/16 16:11
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcMaterialLayerSet extends IfcBodyTemplate {
    private List<IfcMaterialLayer> materialLayers;
    private IfcLabel layerSetName;

    public IfcMaterialLayerSet() {}

    @IfcParserConstructor

    public IfcMaterialLayerSet(List<IfcMaterialLayer> materialLayers, IfcLabel layerSetName) {
        this.materialLayers = materialLayers;
        this.layerSetName = layerSetName;
    }

    public List<IfcMaterialLayer> getMaterialLayers() {
        return materialLayers;
    }

    public void setMaterialLayers(List<IfcMaterialLayer> materialLayers) {
        this.materialLayers = materialLayers;
    }

    public IfcLabel getLayerSetName() {
        return layerSetName;
    }

    public void setLayerSetName(IfcLabel layerSetName) {
        this.layerSetName = layerSetName;
    }
}
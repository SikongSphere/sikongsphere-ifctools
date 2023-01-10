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
package org.sikongsphere.ifc.model.schema.resource.geometricmodel.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcAxis2Placement3D;
import org.sikongsphere.ifc.model.schema.resource.geometry.selectType.IfcAxis2Placement;
import org.sikongsphere.ifc.model.schema.resource.profile.entity.IfcProfileDef;

/**
 * The swept area solid entity collects the entities which are defined procedurally by sweeping action on planar bounded surfaces.
 * @author Wang Bohong
 * @date 2022/10/28 10:32
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcSweptAreaSolid extends IfcSolidModel {
    private IfcProfileDef sweptArea;
    private IfcAxis2Placement3D position;

    public IfcSweptAreaSolid() {}

    @IfcParserConstructor
    public IfcSweptAreaSolid(IfcProfileDef sweptArea, IfcAxis2Placement3D position) {
        this.sweptArea = sweptArea;
        this.position = position;
    }

    public IfcProfileDef getSweptArea() {
        return sweptArea;
    }

    public void setSweptArea(IfcProfileDef sweptArea) {
        this.sweptArea = sweptArea;
    }

    public IfcAxis2Placement getPosition() {
        return position;
    }

    public void setPosition(IfcAxis2Placement3D position) {
        this.position = position;
    }
}

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
package org.sikongsphere.ifc.newModel.schema.resource.geometry.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * @author zhongqi
 * @date 2022/11/1
 */

@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcMappedItem extends IfcRepresentationItem {
    private IfcRepresentationMap mappingSource;
    private IfcCartesianTransformationOperator mappingTarget;

    public IfcMappedItem() {}

    @IfcParserConstructor
    public IfcMappedItem(
        IfcRepresentationMap mappingSource,
        IfcCartesianTransformationOperator mappingTarget
    ) {
        this.mappingSource = mappingSource;
        this.mappingTarget = mappingTarget;
    }

    public IfcRepresentationMap getMappingSource() {
        return mappingSource;
    }

    public void setMappingSource(IfcRepresentationMap mappingSource) {
        this.mappingSource = mappingSource;
    }

    public IfcCartesianTransformationOperator getMappingTarget() {
        return mappingTarget;
    }

    public void setMappingTarget(IfcCartesianTransformationOperator mappingTarget) {
        this.mappingTarget = mappingTarget;
    }
}

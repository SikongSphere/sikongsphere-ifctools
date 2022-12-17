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
package org.sikongsphere.ifc.model.schema.resource.presentationdefinition.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcCartesianTransformationOperator2D;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcGeometricRepresentationItem;
import org.sikongsphere.ifc.model.schema.resource.presentationdefinition.selectType.IfcDefinedSymbolSelect;

/**
 * @author zaiyuan
 * @date 2022/12/17 21:03
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcDefinedSymbol extends IfcGeometricRepresentationItem {
    private IfcDefinedSymbolSelect definition;
    private IfcCartesianTransformationOperator2D target;

    @IfcParserConstructor
    public IfcDefinedSymbol(
        IfcDefinedSymbolSelect definition,
        IfcCartesianTransformationOperator2D target
    ) {
        this.definition = definition;
        this.target = target;
    }

    public IfcDefinedSymbolSelect getDefinition() {
        return definition;
    }

    public void setDefinition(IfcDefinedSymbolSelect definition) {
        this.definition = definition;
    }

    public IfcCartesianTransformationOperator2D getTarget() {
        return target;
    }

    public void setTarget(IfcCartesianTransformationOperator2D target) {
        this.target = target;
    }
}

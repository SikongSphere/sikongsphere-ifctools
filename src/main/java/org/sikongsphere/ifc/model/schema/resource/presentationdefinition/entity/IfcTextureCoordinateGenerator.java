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
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcSimpleValue;

/**
 * The IfcTextureCoordinateGenerator describes a procedurally defined mapping function with input parameter to
 * map 2D texture coordinates to 3D geometry vertices.
 *
 * @author zaiyuan
 * @date 2022/12/17 21:03
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcTextureCoordinateGenerator extends IfcAnnotationOccurrence {
    private IfcLabel mode;
    private LIST<IfcSimpleValue> parameter;

    @IfcParserConstructor
    public IfcTextureCoordinateGenerator(IfcLabel mode, LIST<IfcSimpleValue> parameter) {
        this.mode = mode;
        this.parameter = parameter;
    }

    public IfcLabel getMode() {
        return mode;
    }

    public void setMode(IfcLabel mode) {
        this.mode = mode;
    }

    public LIST<IfcSimpleValue> getParameter() {
        return parameter;
    }

    public void setParameter(LIST<IfcSimpleValue> parameter) {
        this.parameter = parameter;
    }
}

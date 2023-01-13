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
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcParameterValue;

/**
 * An IfcTextureVertex is a list of 2 (S, T) texture coordinates.
 *
 * @author zaiyuan
 * @date 2022/12/17 21:03
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcTextureVertex extends IfcAbstractClass {
    private LIST<IfcParameterValue> coordinates;

    @IfcParserConstructor
    public IfcTextureVertex(LIST<IfcParameterValue> coordinates) {
        this.coordinates = coordinates;
    }

    public LIST<IfcParameterValue> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(LIST<IfcParameterValue> coordinates) {
        this.coordinates = coordinates;
    }
}

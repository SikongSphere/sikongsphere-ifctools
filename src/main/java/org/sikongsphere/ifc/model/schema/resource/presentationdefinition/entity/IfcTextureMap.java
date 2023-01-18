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
import org.sikongsphere.ifc.model.datatype.SET;

/**
 * An IfcTextureMap provides the mapping of the 2-dimensional texture coordinates to the surface onto which it is mapped.
 *
 * @author zaiyuan
 * @date 2022/12/17 21:03
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcTextureMap extends IfcTextureCoordinate {
    private SET<IfcVertexBasedTextureMap> textureMaps;

    @IfcParserConstructor
    public IfcTextureMap(SET<IfcVertexBasedTextureMap> textureMaps) {
        this.textureMaps = textureMaps;
    }

    public SET<IfcVertexBasedTextureMap> getTextureMaps() {
        return textureMaps;
    }

    public void setTextureMaps(SET<IfcVertexBasedTextureMap> textureMaps) {
        this.textureMaps = textureMaps;
    }
}

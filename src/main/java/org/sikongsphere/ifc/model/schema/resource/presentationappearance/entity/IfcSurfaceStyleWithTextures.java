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
package org.sikongsphere.ifc.model.schema.resource.presentationappearance.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.presentationappearance.selecttype.IfcSurfaceStyleElementSelect;

/**
 * The entity IfcSurfaceStyleWithTextures allows for the assignment of image textures to surface styles.
 * These image textures can be applied repeating across the surface or mapped with a particular scale upon the surface.
 *
 * @author stan
 * @date 2022/09/02 13:21
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcSurfaceStyleWithTextures implements IfcSurfaceStyleElementSelect {
    private SET<IfcSurfaceTexture> textures;

    public IfcSurfaceStyleWithTextures() {}

    public IfcSurfaceStyleWithTextures(SET<IfcSurfaceTexture> textures) {
        this.textures = textures;
    }

    public SET<IfcSurfaceTexture> getTextures() {
        return textures;
    }

    public void setTextures(SET<IfcSurfaceTexture> textures) {
        this.textures = textures;
    }
}

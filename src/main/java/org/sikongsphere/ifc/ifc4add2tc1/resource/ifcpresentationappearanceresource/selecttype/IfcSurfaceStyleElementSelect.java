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
package org.sikongsphere.ifc.ifc4add2tc1.resource.ifcpresentationappearanceresource.selecttype;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * The IfcSurfaceStyleElementSelect provides a selection between different surface styles, including IfcSurfaceStyleRendering for rendering properties, IfcSurfaceStyleLighting, which holds the exact physically based lighting properties for lighting based calculation algorithms (as the opposite to the rendering based calculation), the IfcSurfaceStyleRefraction (for more advanced refraction indices) and IfcSurfaceStyleWithTextures to allow for image textures applied to surfaces. In addition an IfcExternallyDefinedSurfaceStyle can be selected that points into an external rendering material library.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(
    layer = IfcLayer.RESOURCE,
    type = IfcType.SELECT_TYPE,
    version = IfcVersion.IFC_4_ADD2_TC1
)
public interface IfcSurfaceStyleElementSelect {

}

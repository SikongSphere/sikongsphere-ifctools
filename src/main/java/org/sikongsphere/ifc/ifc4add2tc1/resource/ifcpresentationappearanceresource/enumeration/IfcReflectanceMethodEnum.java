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
package org.sikongsphere.ifc.ifc4add2tc1.resource.ifcpresentationappearanceresource.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * The IfcReflectanceMethodEnum defines the range of different reflectance methods available.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(
    layer = IfcLayer.RESOURCE,
    type = IfcType.ENUMERATION,
    version = IfcVersion.IFC_4_ADD2_TC1
)
public enum IfcReflectanceMethodEnum {
    /**
      * A reflectance model providing a smooth, slightly shiny appearance.
      */
    BLINN,

    /**
      * A reflectance model providing a constant colour. This model ignores the effect of all light sources.
      */
    FLAT,

    /**
      * A reflectance model that supports an approximation of glass-like materials that have both reflective and transmissive properties.
      */
    GLASS,

    /**
      * A reflectance model providing a dull matte appearance.
      */
    MATT,

    /**
      * A reflectance model providing a specular metallic appearance.
      */
    METAL,

    /**
      * A reflectance model that supports secondary mirrored views through ray tracing.
      */
    MIRROR,

    /**
      * A reflectance model conforming with the Phong model in which reflections are greatest in the `mirror' direction of a surface opposite the viewing direction with respect to the surface normal.
      */
    PHONG,

    /**
      * A reflectance model providing a specular effect which is similar to the Phong model.
      */
    PLASTIC,

    /**
      * A reflectance model for metallic and non-metallic appearance based on a limited set of control parameter.
      */
    STRAUSS,

    NOTDEFINED

}

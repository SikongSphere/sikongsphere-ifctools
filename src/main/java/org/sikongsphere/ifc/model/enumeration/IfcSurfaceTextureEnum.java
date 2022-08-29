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
package org.sikongsphere.ifc.model.enumeration;

/**
 * The IfcSurfaceTextureEnum defines the range of different types of image or pixel maps available.
 *
 * @author Wang Bohong
 * @date 2022/8/29 15:23
 */
public enum IfcSurfaceTextureEnum {
    /**
     * 	Shows the amplitude of the microstructure of a surface.
     * @author Wang Bohong
     */
    BUMP,
    /**
     * Shows where a transparent surface is less transparent.
     * @author Wang Bohong
     */
    OPACITY,
    /**
     * Shows the extent of reflection on a reflecting surface.
     * @author Wang Bohong
     */
    REFLECTION,
    /**
     * Shows the map with self illumination, white parts have maximum illumination, black part none.
     * @author Wang Bohong
     */
    SELFILLUMINATION,
    /**
     * Shows where a surface is more or less 'shiny'.
     * @author Wang Bohong
     */
    SHININESS,
    /**
     * Shows the specular highlights are on a surface.
     * @author Wang Bohong
     */
    SPECULAR,
    /**
     * Shows for each pixel an own color value.
     * @author Wang Bohong
     */
    TEXTURE,
    /**
     * Shows where a transparent surface is more transparent. The opposite of opacity map.
     * @author Wang Bohong
     */
    TRANSPARENCYMAP,
    /**
     * Not Defined
     * @author Wang Bohong
     */
    NOTDEFINED
}

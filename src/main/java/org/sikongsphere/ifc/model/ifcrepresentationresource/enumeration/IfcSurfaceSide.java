package org.sikongsphere.ifc.model.ifcrepresentationresource.enumeration;

/**
 * An enumeration of the international abbreviations of surface side.
 *
 * @author zaiyuan
 * @date 2022/8/31 21:24
 */
public enum IfcSurfaceSide {
    /**
     * The side of a surface which is in the same direction as the surface normal derived
     * from the mathematical definition
     */
    POSITIVE,
    /**
     * The side of a surface which is in the opposite direction than the surface normal
     * derived from the mathematical definition
     */
    NEGATIVE,
    /**
     * Both, positive and negative side
     */
    BOTH
}

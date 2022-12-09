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
package org.sikongsphere.ifc.model.schema.resource.measure.functions;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.resource.measure.entity.IfcDimensionalExponents;
import org.sikongsphere.ifc.model.schema.resource.measure.enumeration.IfcSIUnitName;

/**
 * This class is used to encapsulate dimension for si unit information
 *
 * @author zaiyuan
 * @date 2022-08-31 18:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.FUNCTIONS)
public class IfcDimensionsForSiUnit {

    /**
     * The function returns the dimensional exponents of the given SI-unit.
     *
     * @param n IfcSIUnitName
     * @return IfcDimensionalExponents
     */
    public IfcDimensionalExponents IfcDimensionalExponents(IfcSIUnitName n) {
        switch (n) {
            case METRE:
                return new IfcDimensionalExponents(1, 0, 0, 0, 0, 0, 0);
            case SQUARE_METRE:
                return new IfcDimensionalExponents(2, 0, 0, 0, 0, 0, 0);
            case CUBIC_METRE:
                return new IfcDimensionalExponents(3, 0, 0, 0, 0, 0, 0);
            case GRAM:
                return new IfcDimensionalExponents(0, 1, 0, 0, 0, 0, 0);
            case SECOND:
                return new IfcDimensionalExponents(0, 0, 1, 0, 0, 0, 0);
            case AMPERE:
                return new IfcDimensionalExponents(0, 0, 0, 1, 0, 0, 0);
            case KELVIN:
                return new IfcDimensionalExponents(0, 0, 0, 0, 1, 0, 0);
            case MOLE:
                return new IfcDimensionalExponents(0, 0, 0, 0, 0, 1, 0);
            case CANDELA:
                return new IfcDimensionalExponents(0, 0, 0, 0, 0, 0, 1);
            case RADIAN:
                return new IfcDimensionalExponents(0, 0, 0, 0, 0, 0, 0);
            case STERADIAN:
                return new IfcDimensionalExponents(0, 0, 0, 0, 0, 0, 0);
            case HERTZ:
                return new IfcDimensionalExponents(0, 0, -1, 0, 0, 0, 0);
            case NEWTON:
                return new IfcDimensionalExponents(1, 1, -2, 0, 0, 0, 0);
            case PASCAL:
                return new IfcDimensionalExponents(-1, 1, -2, 0, 0, 0, 0);
            case JOULE:
                return new IfcDimensionalExponents(2, 1, -2, 0, 0, 0, 0);
            case WATT:
                return new IfcDimensionalExponents(2, 1, -3, 0, 0, 0, 0);
            case COULOMB:
                return new IfcDimensionalExponents(0, 0, 1, 1, 0, 0, 0);
            case VOLT:
                return new IfcDimensionalExponents(2, 1, -3, -1, 0, 0, 0);
            case FARAD:
                return new IfcDimensionalExponents(-2, -1, 4, 1, 0, 0, 0);
            case OHM:
                return new IfcDimensionalExponents(2, 1, -3, -2, 0, 0, 0);
            case SIEMENS:
                return new IfcDimensionalExponents(-2, -1, 3, 2, 0, 0, 0);
            case WEBER:
                return new IfcDimensionalExponents(2, 1, -2, -1, 0, 0, 0);
            case TESLA:
                return new IfcDimensionalExponents(0, 1, -2, -1, 0, 0, 0);
            case HENRY:
                return new IfcDimensionalExponents(2, 1, -2, -2, 0, 0, 0);
            case DEGREE_CELSIUS:
                return new IfcDimensionalExponents(0, 0, 0, 0, 1, 0, 0);
            case LUMEN:
                return new IfcDimensionalExponents(0, 0, 0, 0, 0, 0, 1);
            case LUX:
                return new IfcDimensionalExponents(-2, 0, 0, 0, 0, 0, 1);
            case BECQUEREL:
                return new IfcDimensionalExponents(0, 0, -1, 0, 0, 0, 0);
            case GRAY:
                return new IfcDimensionalExponents(2, 0, -2, 0, 0, 0, 0);
            case SIEVERT:
                return new IfcDimensionalExponents(2, 0, -2, 0, 0, 0, 0);
            default:
                return new IfcDimensionalExponents(0, 0, 0, 0, 0, 0, 0);
        }
    }
}

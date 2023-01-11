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
package org.sikongsphere.ifc.model.schema.resource.geometry.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcDeriveParameter;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.schema.resource.geometry.definedtypes.IfcDimensionCount;
import org.sikongsphere.ifc.model.schema.resource.geometry.selectType.IfcTrimmingSelect;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLengthMeasure;

/**
 * A point defined by its coordinates in a two or
 * three dimensional rectangular Cartesian coordinate system, or in a two dimensional
 * parameter space.
 *
 * @author Wang Bohong
 * @date 2022/9/1 15:52
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcCartesianPoint extends IfcPoint implements IfcTrimmingSelect {
    private LIST<IfcLengthMeasure> coordinates;
    @IfcDeriveParameter
    private IfcDimensionCount dim;

    public IfcCartesianPoint() {}

    @IfcParserConstructor
    public IfcCartesianPoint(LIST<IfcLengthMeasure> coordinates) throws Exception {
        this.coordinates = coordinates;
        if (coordinates.size() > 3) {
            throw new Exception("The amount of coordinates is between 1 and 3");
        }
    }

    public IfcCartesianPoint(Double x, Double y, Double z) {
        coordinates = new LIST<>();
        coordinates.add(new IfcLengthMeasure(x));
        coordinates.add(new IfcLengthMeasure(y));
        coordinates.add(new IfcLengthMeasure(z));
    }

    public LIST<IfcLengthMeasure> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(LIST<IfcLengthMeasure> coordinates) throws Exception {
        this.coordinates = coordinates;
        if (coordinates.size() > 3) {
            throw new Exception("The amount of coordinates is between 1 and 3");
        }
    }

    public IfcDimensionCount getDim() {
        return dim;
    }

    public void setDim(IfcDimensionCount dim) {
        this.dim = dim;
    }
}

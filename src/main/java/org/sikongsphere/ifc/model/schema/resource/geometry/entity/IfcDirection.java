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
import org.sikongsphere.ifc.model.schema.domain.structuralanalysis.selectType.IfcOrientationSelect;
import org.sikongsphere.ifc.model.schema.resource.geometry.definedtypes.IfcDimensionCount;
import org.sikongsphere.ifc.model.schema.resource.geometry.selectType.IfcVectorOrDirection;

/**
 * his entity defines a general direction vector in two or three dimensional space.
 * The actual magnitudes of the components have no effect upon the direction being defined,
 * only the ratios X:Y:Z or X:Y are significant.
 *
 * @author stan
 * @date 2022/09/01 23:59
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcDirection extends IfcGeometricRepresentationItem
    implements
        IfcVectorOrDirection,
        IfcOrientationSelect {
    private LIST<Double> directionRatios;// todo -> REAL
    @IfcDeriveParameter
    private IfcDimensionCount dim;

    public IfcDirection() {}

    @IfcParserConstructor
    public IfcDirection(LIST<Double> directionRatios) {
        this.directionRatios = directionRatios;
    }

    public IfcDirection(Double x, Double y, Double z) {
        directionRatios = new LIST<>();
        directionRatios.add(x);
        directionRatios.add(y);
        directionRatios.add(z);
    }

    public LIST<Double> getDirectionRatios() {
        return directionRatios;
    }

    public void setDirectionRatios(LIST<Double> directionRatios) {
        this.directionRatios = directionRatios;
    }

    public IfcDimensionCount getDim() {
        return dim;
    }

    public void setDim(IfcDimensionCount dim) {
        this.dim = dim;
    }

    @Override
    public boolean isDefault() {
        return directionRatios.getObjects().stream().allMatch(i -> i == 0.0);
    }

}

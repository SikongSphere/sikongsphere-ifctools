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
package org.sikongsphere.ifc.model.schema.resource.representation.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.DOUBLE;
import org.sikongsphere.ifc.model.datatype.SCIENTIFICNOTATION;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.geometry.definedtypes.IfcDimensionCount;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcDirection;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcAxis2Placement;

import java.util.Optional;

/**
 * A geometric representation context is a representation context
 * in which the geometric representation items are geometrically founded.
 *
 * @author stan
 * @date 2022/09/01 22:10
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcGeometricRepresentationContext extends IfcRepresentationContext {
    private IfcDimensionCount coordinateSpaceDimension;
    @IfcOptionField
    private DOUBLE precision;
    private IfcAxis2Placement worldCoordinateSystem;
    @IfcOptionField
    private IfcDirection trueNorth;

    @IfcInverseParameter
    private SET<IfcGeometricRepresentationSubContext> hasSubContexts;

    public IfcGeometricRepresentationContext() {}

    public IfcGeometricRepresentationContext(
        IfcDimensionCount coordinateSpaceDimension,
        DOUBLE precision,
        IfcAxis2Placement worldCoordinateSystem,
        IfcDirection trueNorth
    ) {
        this.coordinateSpaceDimension = coordinateSpaceDimension;
        this.precision = precision;
        this.worldCoordinateSystem = worldCoordinateSystem;
        this.trueNorth = trueNorth;
    }

    @IfcParserConstructor
    public IfcGeometricRepresentationContext(
        IfcLabel contextIdentifier,
        IfcLabel contextType,
        IfcDimensionCount coordinateSpaceDimension,
        DOUBLE precision,
        IfcAxis2Placement worldCoordinateSystem,
        IfcDirection trueNorth
    ) {
        super(contextIdentifier, contextType);
        this.coordinateSpaceDimension = coordinateSpaceDimension;
        this.precision = precision;
        this.worldCoordinateSystem = worldCoordinateSystem;
        this.trueNorth = trueNorth;
    }

    public String getCoordinateSpaceDimension() {
        String s = Optional.ofNullable(coordinateSpaceDimension.getDimensionCount())
            .map(x -> coordinateSpaceDimension.getDimensionCount().toString())
            .orElse(StringConstant.ASTERISK);

        return s;
    }

    public void setCoordinateSpaceDimension(IfcDimensionCount coordinateSpaceDimension) {
        this.coordinateSpaceDimension = coordinateSpaceDimension;
    }

    public String getPrecision() {
        if (SCIENTIFICNOTATION.class.isAssignableFrom(precision.getClass())) {
            return precision.toString();
        } else if (precision.value == 0.0) {
            return StringConstant.ASTERISK;
        } else {
            return String.valueOf(precision);
        }
    }

    public void setPrecision(DOUBLE precision) {
        this.precision = precision;
    }

    public IfcAxis2Placement getWorldCoordinateSystem() {
        return worldCoordinateSystem;
    }

    public void setWorldCoordinateSystem(IfcAxis2Placement worldCoordinateSystem) {
        this.worldCoordinateSystem = worldCoordinateSystem;
    }

    public IfcDirection getTrueNorth() {
        return trueNorth;
    }

    public void setTrueNorth(IfcDirection trueNorth) {
        this.trueNorth = trueNorth;
    }

    public SET<IfcGeometricRepresentationSubContext> getHasSubContexts() {
        return hasSubContexts;
    }

    public void setHasSubContexts(SET<IfcGeometricRepresentationSubContext> hasSubContexts) {
        this.hasSubContexts = hasSubContexts;
    }
}

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
package org.sikongsphere.ifc.newModel.schema.resource.representation.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.IfcAbstractClass;
import org.sikongsphere.ifc.newModel.datatype.DOUBLE;
import org.sikongsphere.ifc.newModel.datatype.SET;
import org.sikongsphere.ifc.newModel.schema.resource.geometry.definedtypes.IfcDimensionCount;
import org.sikongsphere.ifc.newModel.schema.resource.geometry.entity.IfcDirection;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.newModel.schema.resource.measure.selectTypes.IfcAxis2Placement;

import java.util.Locale;
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
    private DOUBLE precision;
    private IfcAxis2Placement worldCoordinateSystem;
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

    public IfcDimensionCount getCoordinateSpaceDimension() {
        return coordinateSpaceDimension;
    }

    public void setCoordinateSpaceDimension(IfcDimensionCount coordinateSpaceDimension) {
        this.coordinateSpaceDimension = coordinateSpaceDimension;
    }

    public DOUBLE getPrecision() {
        return precision;
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

    @Override
    public String toIfc() {
        IfcAbstractClass worldCoordinateSystem = (IfcAbstractClass) getWorldCoordinateSystem();

        String format = String.format(
            "#%s=%s(%s,%s,%s,%s,#%s,%s);",
            this.stepNumber,
            this.getClass().getSimpleName().toUpperCase(Locale.ROOT),
            Optional.ofNullable(getContextIdentifier())
                .map(x -> getContextIdentifier().toString())
                .orElse(StringConstant.DOLLAR),
            getContextType(),
            Optional.ofNullable(this.coordinateSpaceDimension)
                .map(x -> this.coordinateSpaceDimension.getDimensionCount().toString())
                .orElse(StringConstant.DOLLAR),
            getPrecision(),
            worldCoordinateSystem.getStepNumber(),
            Optional.ofNullable(this.trueNorth)
                .map(x -> StringConstant.WELL + getTrueNorth().getStepNumber())
                .orElse(StringConstant.DOLLAR)
        );

        return format;
    }

}

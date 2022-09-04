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
package org.sikongsphere.ifc.model.resource.representation.entity;

import org.sikongsphere.ifc.model.basic.SET;
import org.sikongsphere.ifc.model.resource.geometry.definedtypes.IfcDimensionCount;
import org.sikongsphere.ifc.model.resource.geometry.entity.IfcDirection;
import org.sikongsphere.ifc.model.resource.measure.selecttypes.IfcAxis2Placement;

/**
 * A geometric representation context is a representation context
 * in which the geometric representation items are geometrically founded.
 *
 * @author stan
 * @date 2022/09/01 22:10
 */
public class IfcGeometricRepresentationContext extends IfcRepresentationContext {
    private IfcDimensionCount coordinateSpaceDimension;
    private Boolean precision;// todo -> REAL
    private IfcAxis2Placement worldCoordinateSystem;
    private IfcDirection trueNorth;

    private SET<IfcGeometricRepresentationSubContext> hasSubContexts;

    public IfcGeometricRepresentationContext() {}

    public IfcGeometricRepresentationContext(
        IfcDimensionCount coordinateSpaceDimension,
        Boolean precision,
        IfcAxis2Placement worldCoordinateSystem,
        IfcDirection trueNorth,
        SET<IfcGeometricRepresentationSubContext> hasSubContexts
    ) {
        this.coordinateSpaceDimension = coordinateSpaceDimension;
        this.precision = precision;
        this.worldCoordinateSystem = worldCoordinateSystem;
        this.trueNorth = trueNorth;
        this.hasSubContexts = hasSubContexts;
    }

    public IfcDimensionCount getCoordinateSpaceDimension() {
        return coordinateSpaceDimension;
    }

    public void setCoordinateSpaceDimension(IfcDimensionCount coordinateSpaceDimension) {
        this.coordinateSpaceDimension = coordinateSpaceDimension;
    }

    public Boolean getPrecision() {
        return precision;
    }

    public void setPrecision(Boolean precision) {
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

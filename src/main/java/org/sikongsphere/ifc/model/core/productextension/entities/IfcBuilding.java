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
package org.sikongsphere.ifc.model.core.productextension.entities;

import org.sikongsphere.ifc.model.resource.actor.entity.IfcPostalAddress;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcLengthMeasure;

/**
 * Construction work that has the provision of shelter for its occupants or contents
 * as one of its main purpose and is normally designed to stand permanently in one place.
 *
 * @author stan
 * @date 2022/09/01 23:15
 */
public class IfcBuilding extends IfcSpatialStructureElement {
    private IfcLengthMeasure elevationOfRefHeight;
    private IfcLengthMeasure elevationOfRefTerrain;
    private IfcPostalAddress buildingAddress;

    public IfcBuilding() {
    }

    public IfcBuilding(IfcLengthMeasure elevationOfRefHeight, IfcLengthMeasure elevationOfRefTerrain, IfcPostalAddress buildingAddress) {
        this.elevationOfRefHeight = elevationOfRefHeight;
        this.elevationOfRefTerrain = elevationOfRefTerrain;
        this.buildingAddress = buildingAddress;
    }

    public IfcLengthMeasure getElevationOfRefHeight() {
        return elevationOfRefHeight;
    }

    public void setElevationOfRefHeight(IfcLengthMeasure elevationOfRefHeight) {
        this.elevationOfRefHeight = elevationOfRefHeight;
    }

    public IfcLengthMeasure getElevationOfRefTerrain() {
        return elevationOfRefTerrain;
    }

    public void setElevationOfRefTerrain(IfcLengthMeasure elevationOfRefTerrain) {
        this.elevationOfRefTerrain = elevationOfRefTerrain;
    }

    public IfcPostalAddress getBuildingAddress() {
        return buildingAddress;
    }

    public void setBuildingAddress(IfcPostalAddress buildingAddress) {
        this.buildingAddress = buildingAddress;
    }
}

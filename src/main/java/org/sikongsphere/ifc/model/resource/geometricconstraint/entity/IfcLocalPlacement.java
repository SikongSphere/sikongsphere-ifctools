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
package org.sikongsphere.ifc.model.resource.geometricconstraint.entity;

import org.sikongsphere.ifc.model.resource.measure.selecttypes.IfcAxis2Placement;

/**
 * The IfcLocalPlacement defines the relative placement of a product
 * in relation to the placement of another product or the absolute placement
 * of a product within the geometric representation context of the project.
 *
 * @author stan
 * @date 2022/09/01 22:55
 */
public class IfcLocalPlacement extends IfcObjectPlacement {
    private IfcObjectPlacement placementRelTo;
    private IfcAxis2Placement relativePlacement;

    public IfcLocalPlacement() {
    }

    public IfcLocalPlacement(IfcObjectPlacement placementRelTo, IfcAxis2Placement relativePlacement) {
        this.placementRelTo = placementRelTo;
        this.relativePlacement = relativePlacement;
    }

    public IfcObjectPlacement getPlacementRelTo() {
        return placementRelTo;
    }

    public void setPlacementRelTo(IfcObjectPlacement placementRelTo) {
        this.placementRelTo = placementRelTo;
    }

    public IfcAxis2Placement getRelativePlacement() {
        return relativePlacement;
    }

    public void setRelativePlacement(IfcAxis2Placement relativePlacement) {
        this.relativePlacement = relativePlacement;
    }
}

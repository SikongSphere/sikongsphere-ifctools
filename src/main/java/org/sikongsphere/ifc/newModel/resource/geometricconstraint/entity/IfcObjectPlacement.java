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
package org.sikongsphere.ifc.newModel.resource.geometricconstraint.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.body.IfcBodyTemplate;

/**
 * Abstract supertype for the special types defining the object coordinate system.
 * The IfcObjectPlacement has to be provided for each product that has a shape representation.
 *
 * @author stan
 * @date 2022/09/01 22:18
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public abstract class IfcObjectPlacement extends IfcBodyTemplate {
    // private SET<IfcProduct> placesObject;
    // private SET<IfcLocalPlacement> referencedByPlacements;

    public IfcObjectPlacement() {}

    // public IfcObjectPlacement(
    // SET<IfcProduct> placesObject,
    // SET<IfcLocalPlacement> referencedByPlacements
    // ) {
    // this.placesObject = placesObject;
    // this.referencedByPlacements = referencedByPlacements;
    // }
    //
    // public SET<IfcProduct> getPlacesObject() {
    // return placesObject;
    // }
    //
    // public void setPlacesObject(SET<IfcProduct> placesObject) {
    // this.placesObject = placesObject;
    // }
    //
    // public SET<IfcLocalPlacement> getReferencedByPlacements() {
    // return referencedByPlacements;
    // }
    //
    // public void setReferencedByPlacements(SET<IfcLocalPlacement> referencedByPlacements) {
    // this.referencedByPlacements = referencedByPlacements;
    // }
}

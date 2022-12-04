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
package org.sikongsphere.ifc.newModel.schema.core.productextension.entities;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.schema.core.productextension.enumeration.IfcElementCompositionEnum;
import org.sikongsphere.ifc.newModel.schema.resource.actor.entity.IfcPostalAddress;
import org.sikongsphere.ifc.newModel.schema.resource.geometricconstraint.entity.IfcLocalPlacement;
import org.sikongsphere.ifc.newModel.schema.resource.geometricconstraint.entity.IfcObjectPlacement;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedtype.IfcCompoundPlaneAngleMeasure;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedtype.IfcLengthMeasure;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedtype.IfcText;
import org.sikongsphere.ifc.newModel.schema.resource.representation.entity.IfcProductRepresentation;
import org.sikongsphere.ifc.newModel.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.newModel.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author Wang Bohong
 * @date 2022/10/16 12:15
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.CORE)
public class IfcSite extends IfcSpatialStructureElement {
    private IfcCompoundPlaneAngleMeasure refLatitude;
    private IfcCompoundPlaneAngleMeasure refLongitude;
    private IfcLengthMeasure refElevation;
    private IfcLabel landTitleNumber;
    private IfcPostalAddress siteAddress;

    public IfcSite() {}

    @IfcParserConstructor
    public IfcSite(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcLocalPlacement objectPlacement,
        IfcProductRepresentation representation,
        IfcLabel longName,
        IfcElementCompositionEnum compositionType,
        IfcCompoundPlaneAngleMeasure refLatitude,
        IfcCompoundPlaneAngleMeasure refLongitude,
        IfcLengthMeasure refElevation,
        IfcLabel landTitleNumber,
        IfcPostalAddress siteAddress
    ) {
        super(
            globalId,
            ownerHistory,
            name,
            description,
            objectType,
            objectPlacement,
            representation,
            longName,
            compositionType
        );
        this.refLatitude = refLatitude;
        this.refLongitude = refLongitude;
        this.refElevation = refElevation;
        this.landTitleNumber = landTitleNumber;
        this.siteAddress = siteAddress;
    }

    public IfcSite(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcObjectPlacement objectPlacement,
        IfcProductRepresentation representation,
        IfcLabel longName,
        IfcElementCompositionEnum compositionType,
        IfcCompoundPlaneAngleMeasure refLatitude,
        IfcCompoundPlaneAngleMeasure refLongitude,
        IfcLengthMeasure refElevation,
        IfcLabel landTitleNumber,
        IfcPostalAddress siteAddress
    ) {
        super(
            globalId,
            ownerHistory,
            name,
            description,
            objectType,
            objectPlacement,
            representation,
            longName,
            compositionType
        );
        this.refLatitude = refLatitude;
        this.refLongitude = refLongitude;
        this.refElevation = refElevation;
        this.landTitleNumber = landTitleNumber;
        this.siteAddress = siteAddress;
    }

    public IfcCompoundPlaneAngleMeasure getRefLatitude() {
        return refLatitude;
    }

    public void setRefLatitude(IfcCompoundPlaneAngleMeasure refLatitude) {
        this.refLatitude = refLatitude;
    }

    public IfcCompoundPlaneAngleMeasure getRefLongitude() {
        return refLongitude;
    }

    public void setRefLongitude(IfcCompoundPlaneAngleMeasure refLongitude) {
        this.refLongitude = refLongitude;
    }

    public IfcLengthMeasure getRefElevation() {
        return refElevation;
    }

    public void setRefElevation(IfcLengthMeasure refElevation) {
        this.refElevation = refElevation;
    }

    public IfcLabel getLandTitleNumber() {
        return landTitleNumber;
    }

    public void setLandTitleNumber(IfcLabel landTitleNumber) {
        this.landTitleNumber = landTitleNumber;
    }

    public IfcPostalAddress getSiteAddress() {
        return siteAddress;
    }

    public void setSiteAddress(IfcPostalAddress siteAddress) {
        this.siteAddress = siteAddress;
    }
}

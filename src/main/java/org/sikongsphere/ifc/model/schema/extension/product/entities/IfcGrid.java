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
package org.sikongsphere.ifc.model.schema.extension.product.entities;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcProduct;
import org.sikongsphere.ifc.model.schema.resource.geometricconstraint.entity.IfcGridAxis;
import org.sikongsphere.ifc.model.schema.resource.geometricconstraint.entity.IfcObjectPlacement;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.representation.entity.IfcProductRepresentation;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author zaiyuan
 * @date 2022/12/10 12:13
 */
@IfcClass(layer = IfcLayer.CORE, type = IfcType.ENTITY)
public abstract class IfcGrid extends IfcProduct {
    private LIST<IfcGridAxis> uAxes;
    private LIST<IfcGridAxis> vAxes;
    @IfcOptionField
    private LIST<IfcGridAxis> wAxes;
    @IfcInverseParameter
    private SET<IfcRelContainedInSpatialStructure> containedInStructure;

    @IfcParserConstructor
    public IfcGrid(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcObjectPlacement objectPlacement,
        IfcProductRepresentation representation,
        LIST<IfcGridAxis> uAxes,
        LIST<IfcGridAxis> vAxes,
        LIST<IfcGridAxis> wAxes
    ) {
        super(
            globalId,
            ownerHistory,
            name,
            description,
            objectType,
            objectPlacement,
            representation
        );
        this.uAxes = uAxes;
        this.vAxes = vAxes;
        this.wAxes = wAxes;
    }

    public LIST<IfcGridAxis> getuAxes() {
        return uAxes;
    }

    public void setuAxes(LIST<IfcGridAxis> uAxes) {
        this.uAxes = uAxes;
    }

    public LIST<IfcGridAxis> getvAxes() {
        return vAxes;
    }

    public void setvAxes(LIST<IfcGridAxis> vAxes) {
        this.vAxes = vAxes;
    }

    public LIST<IfcGridAxis> getwAxes() {
        return wAxes;
    }

    public void setwAxes(LIST<IfcGridAxis> wAxes) {
        this.wAxes = wAxes;
    }

    public SET<IfcRelContainedInSpatialStructure> getContainedInStructure() {
        return containedInStructure;
    }

    public void setContainedInStructure(
        SET<IfcRelContainedInSpatialStructure> containedInStructure
    ) {
        this.containedInStructure = containedInStructure;
    }

    @Override
    public boolean illegal() {
        // TODO
        return super.illegal();
    }
}

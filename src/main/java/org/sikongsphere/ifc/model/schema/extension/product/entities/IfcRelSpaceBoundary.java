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
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.extension.product.enumeration.IfcElementCompositionEnum;
import org.sikongsphere.ifc.model.schema.extension.product.enumeration.IfcInternalOrExternalEnum;
import org.sikongsphere.ifc.model.schema.extension.product.enumeration.IfcPhysicalOrVirtualEnum;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcRelConnects;
import org.sikongsphere.ifc.model.schema.resource.geometricconstraint.entity.IfcConnectionGeometry;
import org.sikongsphere.ifc.model.schema.resource.geometricconstraint.entity.IfcObjectPlacement;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLengthMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.representation.entity.IfcProductRepresentation;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author zaiyuan
 * @date 2022/12/10 12:58
 */
@IfcClass(layer = IfcLayer.CORE, type = IfcType.ENTITY)
public class IfcRelSpaceBoundary extends IfcRelConnects {
    private IfcSpace relatingSpace;
    @IfcOptionField
    private IfcElement relatedBuildingElement;
    @IfcOptionField
    private IfcConnectionGeometry connectionGeometry;
    private IfcPhysicalOrVirtualEnum physicalOrVirtualBoundary;
    private IfcInternalOrExternalEnum internalOrExternalBoundary;

    @IfcParserConstructor
    public IfcRelSpaceBoundary(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcSpace relatingSpace,
        IfcElement relatedBuildingElement,
        IfcConnectionGeometry connectionGeometry,
        IfcPhysicalOrVirtualEnum physicalOrVirtualBoundary,
        IfcInternalOrExternalEnum internalOrExternalBoundary
    ) {
        super(globalId, ownerHistory, name, description);
        this.relatingSpace = relatingSpace;
        this.relatedBuildingElement = relatedBuildingElement;
        this.connectionGeometry = connectionGeometry;
        this.physicalOrVirtualBoundary = physicalOrVirtualBoundary;
        this.internalOrExternalBoundary = internalOrExternalBoundary;
    }

    public IfcSpace getRelatingSpace() {
        return relatingSpace;
    }

    public void setRelatingSpace(IfcSpace relatingSpace) {
        this.relatingSpace = relatingSpace;
    }

    public IfcElement getRelatedBuildingElement() {
        return relatedBuildingElement;
    }

    public void setRelatedBuildingElement(IfcElement relatedBuildingElement) {
        this.relatedBuildingElement = relatedBuildingElement;
    }

    public IfcConnectionGeometry getConnectionGeometry() {
        return connectionGeometry;
    }

    public void setConnectionGeometry(IfcConnectionGeometry connectionGeometry) {
        this.connectionGeometry = connectionGeometry;
    }

    public IfcPhysicalOrVirtualEnum getPhysicalOrVirtualBoundary() {
        return physicalOrVirtualBoundary;
    }

    public void setPhysicalOrVirtualBoundary(IfcPhysicalOrVirtualEnum physicalOrVirtualBoundary) {
        this.physicalOrVirtualBoundary = physicalOrVirtualBoundary;
    }

    public IfcInternalOrExternalEnum getInternalOrExternalBoundary() {
        return internalOrExternalBoundary;
    }

    public void setInternalOrExternalBoundary(
        IfcInternalOrExternalEnum internalOrExternalBoundary
    ) {
        this.internalOrExternalBoundary = internalOrExternalBoundary;
    }

    @Override
    public boolean illegal() {
        // TODO
        return super.illegal();
    }
}

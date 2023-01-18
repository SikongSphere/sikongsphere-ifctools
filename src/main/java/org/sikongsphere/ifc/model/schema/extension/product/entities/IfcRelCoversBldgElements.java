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
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.extension.product.enumeration.IfcCoveringTypeEnum;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcRelConnects;
import org.sikongsphere.ifc.model.schema.resource.geometricconstraint.entity.IfcObjectPlacement;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcIdentifier;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.representation.entity.IfcProductRepresentation;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author zaiyuan
 * @date 2022/12/10 22:49
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.CORE)
public class IfcRelCoversBldgElements extends IfcRelConnects {
    private IfcElement relatingBuildingElement;
    private SET<IfcCovering> relatedCoverings;

    @IfcParserConstructor
    public IfcRelCoversBldgElements(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcElement relatingBuildingElement,
        SET<IfcCovering> relatedCoverings
    ) {
        super(globalId, ownerHistory, name, description);
        this.relatingBuildingElement = relatingBuildingElement;
        this.relatedCoverings = relatedCoverings;
    }

    public IfcElement getRelatingBuildingElement() {
        return relatingBuildingElement;
    }

    public void setRelatingBuildingElement(IfcElement relatingBuildingElement) {
        this.relatingBuildingElement = relatingBuildingElement;
    }

    public SET<IfcCovering> getRelatedCoverings() {
        return relatedCoverings;
    }

    public void setRelatedCoverings(SET<IfcCovering> relatedCoverings) {
        this.relatedCoverings = relatedCoverings;
    }
}

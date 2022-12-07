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
import org.sikongsphere.ifc.newModel.schema.core.kernel.entity.IfcRelConnects;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.newModel.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.newModel.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author Yiwei
 * @date 2022/10/28
 */
@IfcClass(layer = IfcLayer.CORE, type = IfcType.ENTITY)
public class IfcRelVoidsElement extends IfcRelConnects {
    private IfcElement relatingBuildingElement;
    private IfcFeatureElementSubtraction relatedOpeningElement;

    public IfcRelVoidsElement() {}

    @IfcParserConstructor
    public IfcRelVoidsElement(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcElement relatingBuildingElement,
        IfcFeatureElementSubtraction relatedOpeningElement
    ) {
        super(globalId, ownerHistory, name, description);
        this.relatingBuildingElement = relatingBuildingElement;
        this.relatedOpeningElement = relatedOpeningElement;
    }

    public IfcElement getRelatingBuildingElement() {
        return relatingBuildingElement;
    }

    public void setRelatingBuildingElement(IfcElement relatingBuildingElement) {
        this.relatingBuildingElement = relatingBuildingElement;
    }

    public IfcFeatureElementSubtraction getRelatedOpeningElement() {
        return relatedOpeningElement;
    }

    public void setRelatedOpeningElement(IfcFeatureElementSubtraction relatedOpeningElement) {
        this.relatedOpeningElement = relatedOpeningElement;
    }
}

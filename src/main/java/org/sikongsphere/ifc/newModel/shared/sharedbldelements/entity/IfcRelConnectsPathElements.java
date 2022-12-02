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
package org.sikongsphere.ifc.newModel.shared.sharedbldelements.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.basic.INTEGER;
import org.sikongsphere.ifc.newModel.basic.LIST;
import org.sikongsphere.ifc.newModel.core.productextension.entities.IfcElement;
import org.sikongsphere.ifc.newModel.core.productextension.entities.IfcRelConnectsElements;
import org.sikongsphere.ifc.newModel.resource.geometricconstraint.entity.IfcConnectionGeometry;
import org.sikongsphere.ifc.newModel.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.newModel.resource.measure.definedtype.IfcText;
import org.sikongsphere.ifc.newModel.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.newModel.resource.utility.entity.IfcOwnerHistory;
import org.sikongsphere.ifc.newModel.shared.sharedbldelements.enumeration.IfcConnectionTypeEnum;

/**
 * IfcRelConnectsPathElements
 *
 * @author GaoSu
 * @date 2022/10/18 15:08
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.SHARED)
public class IfcRelConnectsPathElements extends IfcRelConnectsElements {
    LIST<INTEGER> relatingPriorities;
    LIST<INTEGER> relatedPriorities;
    IfcConnectionTypeEnum relatedConnectionType;
    IfcConnectionTypeEnum relatingConnectionType;

    public IfcRelConnectsPathElements() {}

    @IfcParserConstructor
    public IfcRelConnectsPathElements(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcConnectionGeometry connectionGeometry,
        IfcElement relatingElement,
        IfcElement relatedElement,
        LIST<INTEGER> relatingPriorities,
        LIST<INTEGER> relatedPriorities,
        IfcConnectionTypeEnum relatedConnectionType,
        IfcConnectionTypeEnum relatingConnectionType
    ) {
        super(
            globalId,
            ownerHistory,
            name,
            description,
            connectionGeometry,
            relatingElement,
            relatedElement
        );
        this.relatingPriorities = relatingPriorities;
        this.relatedPriorities = relatedPriorities;
        this.relatedConnectionType = relatedConnectionType;
        this.relatingConnectionType = relatingConnectionType;
    }

    public LIST<INTEGER> getRelatingPriorities() {
        return relatingPriorities;
    }

    public void setRelatingPriorities(LIST<INTEGER> relatingPriorities) {
        this.relatingPriorities = relatingPriorities;
    }

    public LIST<INTEGER> getRelatedPriorities() {
        return relatedPriorities;
    }

    public void setRelatedPriorities(LIST<INTEGER> relatedPriorities) {
        this.relatedPriorities = relatedPriorities;
    }

    public IfcConnectionTypeEnum getRelatedConnectionType() {
        return relatedConnectionType;
    }

    public void setRelatedConnectionType(IfcConnectionTypeEnum relatedConnectionType) {
        this.relatedConnectionType = relatedConnectionType;
    }

    public IfcConnectionTypeEnum getRelatingConnectionType() {
        return relatingConnectionType;
    }

    public void setRelatingConnectionType(IfcConnectionTypeEnum relatingConnectionType) {
        this.relatingConnectionType = relatingConnectionType;
    }
}

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
package org.sikongsphere.ifc.model.shared.sharedbldelements.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.basic.INTEGER;
import org.sikongsphere.ifc.model.basic.LIST;
import org.sikongsphere.ifc.model.core.productextension.entities.IfcElement;
import org.sikongsphere.ifc.model.core.productextension.entities.IfcRelConnectsElements;
import org.sikongsphere.ifc.model.resource.geometricconstraint.entity.IfcConnectionGeometry;
import org.sikongsphere.ifc.model.shared.sharedbldelements.enumeration.IfcConnectionTypeEnum;


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
        LIST<INTEGER> relatingPriorities,
        LIST<INTEGER> relatedPriorities,
        IfcConnectionTypeEnum relatedConnectionType,
        IfcConnectionTypeEnum relatingConnectionType
    ) {
        this.relatingPriorities = relatingPriorities;
        this.relatedPriorities = relatedPriorities;
        this.relatedConnectionType = relatedConnectionType;
        this.relatingConnectionType = relatingConnectionType;
    }

    public IfcRelConnectsPathElements(
        IfcConnectionGeometry connectionGeometry,
        IfcElement relatingElement,
        IfcElement relatedElement,
        LIST<INTEGER> relatingPriorities,
        LIST<INTEGER> relatedPriorities,
        IfcConnectionTypeEnum relatedConnectionType,
        IfcConnectionTypeEnum relatingConnectionType
    ) {
        super(connectionGeometry, relatingElement, relatedElement);
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

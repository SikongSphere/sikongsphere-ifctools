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
package org.sikongsphere.ifc.model.schema.resource.externalreference.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;

/**
 * @author zaiyuan
 * @date 2022/10/26
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcClassificationItem extends IfcAbstractClass {
    private IfcClassificationNotationFacet notation;
    @IfcOptionField
    private IfcClassification itemOf;
    private IfcLabel title;

    @IfcInverseParameter
    private SET<IfcClassificationItemRelationship> isClassifiedItemIn;
    @IfcInverseParameter
    private SET<IfcClassificationItemRelationship> isClassifyingItemIn;

    @IfcParserConstructor
    public IfcClassificationItem(
        IfcClassificationNotationFacet notation,
        IfcClassification itemOf,
        IfcLabel title
    ) {
        this.notation = notation;
        this.itemOf = itemOf;
        this.title = title;
    }

    public IfcClassificationNotationFacet getNotation() {
        return notation;
    }

    public void setNotation(IfcClassificationNotationFacet notation) {
        this.notation = notation;
    }

    public IfcClassification getItemOf() {
        return itemOf;
    }

    public void setItemOf(IfcClassification itemOf) {
        this.itemOf = itemOf;
    }

    public IfcLabel getTitle() {
        return title;
    }

    public void setTitle(IfcLabel title) {
        this.title = title;
    }

    public SET<IfcClassificationItemRelationship> getIsClassifiedItemIn() {
        return isClassifiedItemIn;
    }

    public void setIsClassifiedItemIn(SET<IfcClassificationItemRelationship> isClassifiedItemIn) {
        this.isClassifiedItemIn = isClassifiedItemIn;
    }

    public SET<IfcClassificationItemRelationship> getIsClassifyingItemIn() {
        return isClassifyingItemIn;
    }

    public void setIsClassifyingItemIn(SET<IfcClassificationItemRelationship> isClassifyingItemIn) {
        this.isClassifyingItemIn = isClassifyingItemIn;
    }
}

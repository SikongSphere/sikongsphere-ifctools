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
package org.sikongsphere.ifc.model.schema.resource.presentationdefinition.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcPoint;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcRepresentationItem;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.presentationappearance.entity.IfcPresentationStyleAssignment;
import org.sikongsphere.ifc.model.schema.resource.representation.enumeration.IfcGlobalOrLocalEnum;

/**
 * An annotation fill area occurrence is a fill area with a style assignment.
 *
 * @author zaiyuan
 * @date 2022/12/17 21:03
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcAnnotationFillAreaOccurrence extends IfcAnnotationOccurrence {
    @IfcOptionField
    private IfcPoint fillStyleTarget;
    @IfcOptionField
    private IfcGlobalOrLocalEnum globalOrLocal;

    public IfcAnnotationFillAreaOccurrence(
        IfcPoint fillStyleTarget,
        IfcGlobalOrLocalEnum globalOrLocal
    ) {
        this.fillStyleTarget = fillStyleTarget;
        this.globalOrLocal = globalOrLocal;
    }

    @IfcParserConstructor
    public IfcAnnotationFillAreaOccurrence(
        IfcRepresentationItem item,
        SET<IfcPresentationStyleAssignment> styles,
        IfcLabel name,
        IfcPoint fillStyleTarget,
        IfcGlobalOrLocalEnum globalOrLocal
    ) {
        super(item, styles, name);
        this.fillStyleTarget = fillStyleTarget;
        this.globalOrLocal = globalOrLocal;
    }

    public IfcPoint getFillStyleTarget() {
        return fillStyleTarget;
    }

    public void setFillStyleTarget(IfcPoint fillStyleTarget) {
        this.fillStyleTarget = fillStyleTarget;
    }

    public IfcGlobalOrLocalEnum getGlobalOrLocal() {
        return globalOrLocal;
    }

    public void setGlobalOrLocal(IfcGlobalOrLocalEnum globalOrLocal) {
        this.globalOrLocal = globalOrLocal;
    }
}

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
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcRepresentationItem;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.presentationappearance.entity.IfcPresentationStyleAssignment;
import org.sikongsphere.ifc.model.schema.resource.presentationdimension.selecttype.IfcDraughtingCalloutElement;
import org.sikongsphere.ifc.model.schema.resource.presentationappearance.entity.IfcStyledItem;

/**
 * An annotation curve occurrence is a curve with a style assignment.
 *
 * @author GaoSu
 * @date 2022/12/11 21:03
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcAnnotationCurveOccurrence extends IfcAnnotationOccurrence
    implements
        IfcDraughtingCalloutElement {
    public IfcAnnotationCurveOccurrence() {}

    @IfcParserConstructor
    public IfcAnnotationCurveOccurrence(
        IfcRepresentationItem item,
        SET<IfcPresentationStyleAssignment> styles,
        IfcLabel name
    ) {
        super(item, styles, name);
    }
}

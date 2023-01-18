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
package org.sikongsphere.ifc.model.schema.resource.presentationdimension.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcRepresentationItem;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.presentationappearance.entity.IfcPresentationStyleAssignment;
import org.sikongsphere.ifc.model.schema.resource.presentationdefinition.entity.IfcAnnotationCurveOccurrence;
import org.sikongsphere.ifc.model.schema.resource.presentationdefinition.entity.IfcPreDefinedSymbol;

/**
 * A projection curve is an annotated curve within a dimension that points to a point of the product shape that is measured.
 *
 * @author GaoSu
 * @date 2022/12/11 21:51
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcProjectionCurve extends IfcAnnotationCurveOccurrence {
    public IfcProjectionCurve() {}

    @IfcParserConstructor
    public IfcProjectionCurve(
        IfcRepresentationItem item,
        SET<IfcPresentationStyleAssignment> styles,
        IfcLabel name
    ) {
        super(item, styles, name);
    }
}

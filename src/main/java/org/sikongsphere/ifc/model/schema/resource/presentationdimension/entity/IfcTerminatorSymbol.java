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
import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcRepresentationItem;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.presentationappearance.entity.IfcPresentationStyleAssignment;
import org.sikongsphere.ifc.model.schema.resource.presentationdefinition.entity.IfcAnnotationCurveOccurrence;
import org.sikongsphere.ifc.model.schema.resource.presentationdefinition.entity.IfcAnnotationSymbolOccurrence;

/**
 *
 *
 * @author GaoSu
 * @date 2022/12/11 19:53
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcTerminatorSymbol extends IfcAnnotationSymbolOccurrence {
    private IfcAnnotationCurveOccurrence annotatedCurve;

    public IfcTerminatorSymbol(IfcAnnotationCurveOccurrence annotatedCurve) {
        this.annotatedCurve = annotatedCurve;
    }

    @IfcParserConstructor
    public IfcTerminatorSymbol(
        IfcRepresentationItem item,
        SET<IfcPresentationStyleAssignment> styles,
        IfcLabel name,
        IfcAnnotationCurveOccurrence annotatedCurve
    ) {
        super(item, styles, name);
        this.annotatedCurve = annotatedCurve;
    }

    public IfcAnnotationCurveOccurrence getAnnotatedCurve() {
        return annotatedCurve;
    }

    public void setAnnotatedCurve(IfcAnnotationCurveOccurrence annotatedCurve) {
        this.annotatedCurve = annotatedCurve;
    }
}

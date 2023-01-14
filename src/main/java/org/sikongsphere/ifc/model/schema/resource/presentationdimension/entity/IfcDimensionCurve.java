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
import org.sikongsphere.ifc.model.schema.resource.presentationdimension.selecttype.IfcDraughtingCalloutElement;

/**
 * A dimension curve is an annotated curve within a dimension that has the dimension text and may have
 * terminator symbols assigned.
 *
 * @author GaoSu
 * @date 2022/12/11 19:53
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcDimensionCurve extends IfcAnnotationCurveOccurrence {
    @IfcInverseParameter
    private SET<IfcTerminatorSymbol> annotatedBySymbols;

    public IfcDimensionCurve(SET<IfcTerminatorSymbol> annotatedBySymbols) {
        this.annotatedBySymbols = annotatedBySymbols;
    }

    @IfcParserConstructor
    public IfcDimensionCurve(
        IfcRepresentationItem item,
        SET<IfcPresentationStyleAssignment> styles,
        IfcLabel name,
        SET<IfcTerminatorSymbol> annotatedBySymbols
    ) {
        super(item, styles, name);
        this.annotatedBySymbols = annotatedBySymbols;
    }

    public SET<IfcTerminatorSymbol> getAnnotatedBySymbols() {
        return annotatedBySymbols;
    }

    public void setAnnotatedBySymbols(SET<IfcTerminatorSymbol> annotatedBySymbols) {
        this.annotatedBySymbols = annotatedBySymbols;
    }
}

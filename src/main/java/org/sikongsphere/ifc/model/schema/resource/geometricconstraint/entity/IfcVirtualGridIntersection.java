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
package org.sikongsphere.ifc.model.schema.resource.geometricconstraint.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.schema.extension.product.entities.IfcElement;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLengthMeasure;

/**
 * The IfcVirtualGridIntersection defines the derived location of the intersection between two grid axes. Offset values
 * may be given to set an offset distance to the grid axis for the calculation of the virtual grid intersection.
 *
 * @author zaiyuan
 * @date 2022/12/10 12:13
 */
@IfcClass(layer = IfcLayer.CORE, type = IfcType.ENTITY)
public class IfcVirtualGridIntersection extends IfcAbstractClass {
    private LIST<IfcGridAxis> intersectingAxes;
    private LIST<IfcLengthMeasure> offsetDistances;

    @IfcParserConstructor
    public IfcVirtualGridIntersection(
        LIST<IfcGridAxis> intersectingAxes,
        LIST<IfcLengthMeasure> offsetDistances
    ) {
        this.intersectingAxes = intersectingAxes;
        this.offsetDistances = offsetDistances;
    }

    public LIST<IfcGridAxis> getIntersectingAxes() {
        return intersectingAxes;
    }

    public void setIntersectingAxes(LIST<IfcGridAxis> intersectingAxes) {
        this.intersectingAxes = intersectingAxes;
    }

    public LIST<IfcLengthMeasure> getOffsetDistances() {
        return offsetDistances;
    }

    public void setOffsetDistances(LIST<IfcLengthMeasure> offsetDistances) {
        this.offsetDistances = offsetDistances;
    }
}

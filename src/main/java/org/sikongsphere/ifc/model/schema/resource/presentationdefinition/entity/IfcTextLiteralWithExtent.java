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
import org.sikongsphere.ifc.model.schema.resource.geometry.selectType.IfcAxis2Placement;
import org.sikongsphere.ifc.model.schema.resource.presentation.definedType.IfcPresentableText;
import org.sikongsphere.ifc.model.schema.resource.presentation.entity.IfcPlanarExtent;
import org.sikongsphere.ifc.model.schema.resource.presentationdefinition.definedType.IfcBoxAlignment;
import org.sikongsphere.ifc.model.schema.resource.presentationdefinition.enumeration.IfcTextPath;

/**
 * @author zaiyuan
 * @date 2022/12/17 21:03
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcTextLiteralWithExtent extends IfcTextLiteral {
    private IfcPlanarExtent extent;
    private IfcBoxAlignment boxAlignment;

    @IfcParserConstructor
    public IfcTextLiteralWithExtent(
        IfcPresentableText literal,
        IfcAxis2Placement placement,
        IfcTextPath path,
        IfcPlanarExtent extent,
        IfcBoxAlignment boxAlignment
    ) {
        super(literal, placement, path);
        this.extent = extent;
        this.boxAlignment = boxAlignment;
    }

    public IfcPlanarExtent getExtent() {
        return extent;
    }

    public void setExtent(IfcPlanarExtent extent) {
        this.extent = extent;
    }

    public IfcBoxAlignment getBoxAlignment() {
        return boxAlignment;
    }

    public void setBoxAlignment(IfcBoxAlignment boxAlignment) {
        this.boxAlignment = boxAlignment;
    }
}

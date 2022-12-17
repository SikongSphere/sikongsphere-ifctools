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
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcGeometricRepresentationItem;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcAxis2Placement;
import org.sikongsphere.ifc.model.schema.resource.presentation.definedType.IfcPresentableText;
import org.sikongsphere.ifc.model.schema.resource.presentationdefinition.enumeration.IfcTextPath;

/**
 * @author zaiyuan
 * @date 2022/12/17 21:03
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcTextLiteral extends IfcGeometricRepresentationItem {
    private IfcPresentableText literal;
    private IfcAxis2Placement placement;
    private IfcTextPath path;

    @IfcParserConstructor
    public IfcTextLiteral(
        IfcPresentableText literal,
        IfcAxis2Placement placement,
        IfcTextPath path
    ) {
        this.literal = literal;
        this.placement = placement;
        this.path = path;
    }

    public IfcPresentableText getLiteral() {
        return literal;
    }

    public void setLiteral(IfcPresentableText literal) {
        this.literal = literal;
    }

    public IfcAxis2Placement getPlacement() {
        return placement;
    }

    public void setPlacement(IfcAxis2Placement placement) {
        this.placement = placement;
    }

    public IfcTextPath getPath() {
        return path;
    }

    public void setPath(IfcTextPath path) {
        this.path = path;
    }
}

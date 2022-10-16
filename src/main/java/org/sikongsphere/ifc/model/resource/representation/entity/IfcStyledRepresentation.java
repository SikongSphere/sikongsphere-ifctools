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
package org.sikongsphere.ifc.model.resource.representation.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.basic.SET;
import org.sikongsphere.ifc.model.core.kernel.entity.IfcObjectDefinition;
import org.sikongsphere.ifc.model.resource.geometry.entity.IfcRepresentationItem;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcLabel;

/**
 * IfcStyledRepresentation
 *
 * @author GaoSu
 * @date 2022/10/16 14:08
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public abstract class IfcStyledRepresentation extends IfcStyleModel {
    public IfcStyledRepresentation() {}

    @IfcParserConstructor
    public IfcStyledRepresentation(
        IfcRepresentation contextContextOfItems,
        IfcLabel representationIdentifier,
        IfcLabel representationType,
        SET<IfcRepresentationItem> items
    ) {
        super(contextContextOfItems, representationIdentifier, representationType, items);
    }

}

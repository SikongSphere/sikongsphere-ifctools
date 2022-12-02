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
package org.sikongsphere.ifc.newModel.resource.presentationappearance.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.resource.externalreference.entity.IfcExternalReference;
import org.sikongsphere.ifc.newModel.resource.measure.definedtype.IfcIdentifier;
import org.sikongsphere.ifc.newModel.resource.measure.definedtype.IfcLabel;

/**
 * The externally defined hatch style is an entity which makes an external reference to a hatching style.
 *
 * @author Wang Bohong
 * @date 2022/9/2 11:42
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcExternallyDefinedHatchStyle extends IfcExternalReference {

    public IfcExternallyDefinedHatchStyle() {}

    public IfcExternallyDefinedHatchStyle(
        IfcLabel location,
        IfcIdentifier itemReference,
        IfcLabel name
    ) {
        super(location, itemReference, name);
    }
}

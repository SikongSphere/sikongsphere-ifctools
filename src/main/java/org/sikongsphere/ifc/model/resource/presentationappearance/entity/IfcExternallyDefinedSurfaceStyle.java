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
package org.sikongsphere.ifc.model.resource.presentationappearance.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.resource.externalreference.entity.IfcExternalReference;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcIdentifier;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcLabel;

/**
 * Definition of a surface style through referencing an external source.
 *
 * @author Wang Bohong
 * @date 2022/9/1 16:46
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcExternallyDefinedSurfaceStyle extends IfcExternalReference {

    public IfcExternallyDefinedSurfaceStyle(
        IfcLabel location,
        IfcIdentifier itemReference,
        IfcLabel name
    ) {
        super(location, itemReference, name);
    }

}

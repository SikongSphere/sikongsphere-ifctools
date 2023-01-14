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
import org.sikongsphere.ifc.model.schema.resource.presentationdefinition.entity.IfcAnnotationCurveOccurrence;
import org.sikongsphere.ifc.model.schema.resource.presentationdefinition.entity.IfcAnnotationSymbolOccurrence;
import org.sikongsphere.ifc.model.schema.resource.presentationdimension.selecttype.IfcDraughtingCalloutElement;

/**
 * The structured dimension callout represents a special type of a draughting callout, which identifies the various components of the dimension text.
 *
 * @author zaiyuan
 * @date 2022/12/17 19:53
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcStructuredDimensionCallout extends IfcDraughtingCallout {
    @IfcParserConstructor
    public IfcStructuredDimensionCallout(SET<IfcDraughtingCalloutElement> contents) {
        super(contents);
    }
}

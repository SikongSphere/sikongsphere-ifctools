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
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcGeometricRepresentationItem;
import org.sikongsphere.ifc.model.schema.resource.presentationdimension.selecttype.IfcDraughtingCalloutElement;

/**
 * A draughing callout is a collection of annotated curves, symbols and text that presents some product shape or
 * definition properties within a drawing.
 *
 * @author GaoSu
 * @date 2022/12/11 19:53
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcDraughtingCallout extends IfcGeometricRepresentationItem {
    private SET<IfcDraughtingCalloutElement> contents;
    @IfcInverseParameter
    private SET<IfcDraughtingCalloutRelationship> isRelatedFromCallout;
    @IfcInverseParameter
    private SET<IfcDraughtingCalloutRelationship> isRelatedToCallout;

    @IfcParserConstructor
    public IfcDraughtingCallout(SET<IfcDraughtingCalloutElement> contents) {
        this.contents = contents;
    }

    public SET<IfcDraughtingCalloutElement> getContents() {
        return contents;
    }

    public void setContents(SET<IfcDraughtingCalloutElement> contents) {
        this.contents = contents;
    }

    public SET<IfcDraughtingCalloutRelationship> getIsRelatedFromCallout() {
        return isRelatedFromCallout;
    }

    public void setIsRelatedFromCallout(
        SET<IfcDraughtingCalloutRelationship> isRelatedFromCallout
    ) {
        this.isRelatedFromCallout = isRelatedFromCallout;
    }

    public SET<IfcDraughtingCalloutRelationship> getIsRelatedToCallout() {
        return isRelatedToCallout;
    }

    public void setIsRelatedToCallout(SET<IfcDraughtingCalloutRelationship> isRelatedToCallout) {
        this.isRelatedToCallout = isRelatedToCallout;
    }
}

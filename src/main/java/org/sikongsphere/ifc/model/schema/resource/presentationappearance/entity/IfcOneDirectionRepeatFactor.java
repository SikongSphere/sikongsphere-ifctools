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
package org.sikongsphere.ifc.model.schema.resource.presentationappearance.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcGeometricRepresentationItem;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcVector;
import org.sikongsphere.ifc.model.schema.resource.presentationappearance.selecttype.IfcHatchLineDistanceSelect;

/**
 * A one time repeat factor is a vector used in the fill area style hatching
 * and fill area style tiles entities for determining the origin of the repeated hatch line relative to the origin of the previous hatch line,
 *
 * @author stan
 * @date 2022/09/01 23:55
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcOneDirectionRepeatFactor extends IfcGeometricRepresentationItem
    implements
        IfcHatchLineDistanceSelect {
    private IfcVector repeatFactor;

    public IfcOneDirectionRepeatFactor() {}

    @IfcParserConstructor
    public IfcOneDirectionRepeatFactor(IfcVector repeatFactor) {
        this.repeatFactor = repeatFactor;
    }

    public IfcVector getRepeatFactor() {
        return repeatFactor;
    }

    public void setRepeatFactor(IfcVector repeatFactor) {
        this.repeatFactor = repeatFactor;
    }
}

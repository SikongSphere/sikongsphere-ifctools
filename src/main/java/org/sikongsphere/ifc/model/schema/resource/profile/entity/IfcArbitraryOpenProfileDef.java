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
package org.sikongsphere.ifc.model.schema.resource.profile.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcBoundedCurve;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.profile.enumeration.IfcProfileTypeEnum;

/**
 * The open profile IfcArbitraryOpenProfileDef defines an arbitrary two-dimensional open profile for the use within the
 * swept surface geometry. It is given by an open boundary from with the surface can be constructed.
 *
 * @author zaiyuan
 * @date 2022/12/08 20:33
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcArbitraryOpenProfileDef extends IfcProfileDef {
    private IfcBoundedCurve curve;

    @IfcParserConstructor
    public IfcArbitraryOpenProfileDef(
        IfcProfileTypeEnum profileType,
        IfcLabel profileName,
        IfcBoundedCurve curve
    ) {
        super(profileType, profileName);
        this.curve = curve;
    }

    public IfcBoundedCurve getCurve() {
        return curve;
    }

    public void setCurve(IfcBoundedCurve curve) {
        this.curve = curve;
    }

    @Override
    public boolean illegal() {
        // TODO
        return super.illegal();
    }
}

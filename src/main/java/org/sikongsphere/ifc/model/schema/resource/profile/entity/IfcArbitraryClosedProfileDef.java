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
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcCurve;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.profile.enumeration.IfcProfileTypeEnum;

/**
 *  The closed profile IfcArbitraryClosedProfileDef defines an arbitrary two-dimensional profile for the use
 *  within the swept surface geometry, the swept area solid or a sectioned spine.
 *
 * @author GaoSU
 * @date 2022/10/25 13:27
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcArbitraryClosedProfileDef extends IfcProfileDef {
    private IfcCurve outerCurve;

    public IfcArbitraryClosedProfileDef() {}

    @IfcParserConstructor
    public IfcArbitraryClosedProfileDef(
        IfcProfileTypeEnum profileType,
        IfcLabel profileName,
        IfcCurve outerCurve
    ) {
        super(profileType, profileName);
        this.outerCurve = outerCurve;
    }

    public IfcCurve getOuterCurve() {
        return outerCurve;
    }

    public void setOuterCurve(IfcCurve outerCurve) {
        this.outerCurve = outerCurve;
    }
}

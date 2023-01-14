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
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcCurve;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.profile.enumeration.IfcProfileTypeEnum;

/**
 * The IfcArbitraryProfileDefWithVoids defines an arbitrary closed two-dimensional profile with
 * holes defined for the use for the swept area solid or a sectioned spine.
 *
 * @author Yiwei
 * @date 2022/11/6
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcArbitraryProfileDefWithVoids extends IfcArbitraryClosedProfileDef {
    private SET<IfcCurve> InnerCurves;

    public IfcArbitraryProfileDefWithVoids() {}

    @IfcParserConstructor
    public IfcArbitraryProfileDefWithVoids(
        IfcProfileTypeEnum profileType,
        IfcLabel profileName,
        IfcCurve outerCurve,
        SET<IfcCurve> innerCurves
    ) {
        super(profileType, profileName, outerCurve);
        InnerCurves = innerCurves;
    }

    public SET<IfcCurve> getInnerCurves() {
        return InnerCurves;
    }

    public void setInnerCurves(SET<IfcCurve> innerCurves) {
        InnerCurves = innerCurves;
    }
}

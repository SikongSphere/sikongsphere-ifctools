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
package org.sikongsphere.ifc.model.schema.resource.profileproperty.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.*;
import org.sikongsphere.ifc.model.schema.resource.profile.entity.IfcProfileDef;
import org.sikongsphere.ifc.model.schema.resource.profileproperty.enumeration.IfcReinforcingBarSurfaceEnum;
import org.sikongsphere.ifc.model.schema.resource.profileproperty.enumeration.IfcRibPlateDirectionEnum;

/**
 * Instances of the entity IfcRibPlateProfileProperties shall be used for a parameterized definition of rib plates.
 *
 * @author GaoSu
 * @date 2022/12/18 13:29
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcRibPlateProfileProperties extends IfcProfileProperties {
    @IfcOptionField
    private IfcPositiveLengthMeasure thickness;
    @IfcOptionField
    private IfcPositiveLengthMeasure ribHeight;
    @IfcOptionField
    private IfcPositiveLengthMeasure ribWidth;
    @IfcOptionField
    private IfcPositiveLengthMeasure ribSpacing;
    private IfcRibPlateDirectionEnum direction;

    @IfcParserConstructor
    public IfcRibPlateProfileProperties(
        IfcLabel profileName,
        IfcProfileDef profileDefinition,
        IfcPositiveLengthMeasure thickness,
        IfcPositiveLengthMeasure ribHeight,
        IfcPositiveLengthMeasure ribWidth,
        IfcPositiveLengthMeasure ribSpacing,
        IfcRibPlateDirectionEnum direction
    ) {
        super(profileName, profileDefinition);
        this.thickness = thickness;
        this.ribHeight = ribHeight;
        this.ribWidth = ribWidth;
        this.ribSpacing = ribSpacing;
        this.direction = direction;
    }

    public IfcPositiveLengthMeasure getThickness() {
        return thickness;
    }

    public void setThickness(IfcPositiveLengthMeasure thickness) {
        this.thickness = thickness;
    }

    public IfcPositiveLengthMeasure getRibHeight() {
        return ribHeight;
    }

    public void setRibHeight(IfcPositiveLengthMeasure ribHeight) {
        this.ribHeight = ribHeight;
    }

    public IfcPositiveLengthMeasure getRibWidth() {
        return ribWidth;
    }

    public void setRibWidth(IfcPositiveLengthMeasure ribWidth) {
        this.ribWidth = ribWidth;
    }

    public IfcPositiveLengthMeasure getRibSpacing() {
        return ribSpacing;
    }

    public void setRibSpacing(IfcPositiveLengthMeasure ribSpacing) {
        this.ribSpacing = ribSpacing;
    }

    public IfcRibPlateDirectionEnum getDirection() {
        return direction;
    }

    public void setDirection(IfcRibPlateDirectionEnum direction) {
        this.direction = direction;
    }
}

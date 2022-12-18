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
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcAreaMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcMassPerLengthMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPositiveLengthMeasure;
import org.sikongsphere.ifc.model.schema.resource.profile.entity.IfcProfileDef;

/**
 *
 *
 * @author GaoSu
 * @date 2022/12/18 13:29
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcGeneralProfileProperties extends IfcProfileProperties {
    @IfcOptionField
    private IfcMassPerLengthMeasure physicalWeight;
    @IfcOptionField
    private IfcPositiveLengthMeasure perimeter;
    @IfcOptionField
    private IfcPositiveLengthMeasure minimumPlateThickness;
    @IfcOptionField
    private IfcPositiveLengthMeasure maximumPlateThickness;
    @IfcOptionField
    private IfcAreaMeasure crossSectionArea;

    @IfcParserConstructor
    public IfcGeneralProfileProperties(
        IfcLabel profileName,
        IfcProfileDef profileDefinition,
        IfcMassPerLengthMeasure physicalWeight,
        IfcPositiveLengthMeasure perimeter,
        IfcPositiveLengthMeasure minimumPlateThickness,
        IfcPositiveLengthMeasure maximumPlateThickness,
        IfcAreaMeasure crossSectionArea
    ) {
        super(profileName, profileDefinition);
        this.physicalWeight = physicalWeight;
        this.perimeter = perimeter;
        this.minimumPlateThickness = minimumPlateThickness;
        this.maximumPlateThickness = maximumPlateThickness;
        this.crossSectionArea = crossSectionArea;
    }

    public IfcMassPerLengthMeasure getPhysicalWeight() {
        return physicalWeight;
    }

    public void setPhysicalWeight(IfcMassPerLengthMeasure physicalWeight) {
        this.physicalWeight = physicalWeight;
    }

    public IfcPositiveLengthMeasure getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(IfcPositiveLengthMeasure perimeter) {
        this.perimeter = perimeter;
    }

    public IfcPositiveLengthMeasure getMinimumPlateThickness() {
        return minimumPlateThickness;
    }

    public void setMinimumPlateThickness(IfcPositiveLengthMeasure minimumPlateThickness) {
        this.minimumPlateThickness = minimumPlateThickness;
    }

    public IfcPositiveLengthMeasure getMaximumPlateThickness() {
        return maximumPlateThickness;
    }

    public void setMaximumPlateThickness(IfcPositiveLengthMeasure maximumPlateThickness) {
        this.maximumPlateThickness = maximumPlateThickness;
    }

    public IfcAreaMeasure getCrossSectionArea() {
        return crossSectionArea;
    }

    public void setCrossSectionArea(IfcAreaMeasure crossSectionArea) {
        this.crossSectionArea = crossSectionArea;
    }
}

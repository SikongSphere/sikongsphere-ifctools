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
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLengthMeasure;
import org.sikongsphere.ifc.model.schema.resource.profile.entity.IfcProfileDef;
import org.sikongsphere.ifc.model.schema.resource.profileproperty.enumeration.IfcReinforcingBarRoleEnum;
import org.sikongsphere.ifc.model.schema.resource.profileproperty.enumeration.IfcSectionTypeEnum;

/**
 *
 *
 * @author GaoSu
 * @date 2022/12/18 14:51
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcSectionReinforcementProperties extends IfcAbstractClass {
    private IfcLengthMeasure longitudinalStartPosition;
    private IfcLengthMeasure longitudinalEndPosition;
    @IfcOptionField
    private IfcLengthMeasure transversePosition;
    private IfcReinforcingBarRoleEnum reinforcementRole;
    private IfcSectionProperties sectionDefinition;
    private SET<IfcReinforcementBarProperties> crossSectionReinforcementDefinitions;

    @IfcParserConstructor
    public IfcSectionReinforcementProperties(
        IfcLengthMeasure longitudinalStartPosition,
        IfcLengthMeasure longitudinalEndPosition,
        IfcLengthMeasure transversePosition,
        IfcReinforcingBarRoleEnum reinforcementRole,
        IfcSectionProperties sectionDefinition,
        SET<IfcReinforcementBarProperties> crossSectionReinforcementDefinitions
    ) {
        this.longitudinalStartPosition = longitudinalStartPosition;
        this.longitudinalEndPosition = longitudinalEndPosition;
        this.transversePosition = transversePosition;
        this.reinforcementRole = reinforcementRole;
        this.sectionDefinition = sectionDefinition;
        this.crossSectionReinforcementDefinitions = crossSectionReinforcementDefinitions;
    }

    public IfcLengthMeasure getLongitudinalStartPosition() {
        return longitudinalStartPosition;
    }

    public void setLongitudinalStartPosition(IfcLengthMeasure longitudinalStartPosition) {
        this.longitudinalStartPosition = longitudinalStartPosition;
    }

    public IfcLengthMeasure getLongitudinalEndPosition() {
        return longitudinalEndPosition;
    }

    public void setLongitudinalEndPosition(IfcLengthMeasure longitudinalEndPosition) {
        this.longitudinalEndPosition = longitudinalEndPosition;
    }

    public IfcLengthMeasure getTransversePosition() {
        return transversePosition;
    }

    public void setTransversePosition(IfcLengthMeasure transversePosition) {
        this.transversePosition = transversePosition;
    }

    public IfcReinforcingBarRoleEnum getReinforcementRole() {
        return reinforcementRole;
    }

    public void setReinforcementRole(IfcReinforcingBarRoleEnum reinforcementRole) {
        this.reinforcementRole = reinforcementRole;
    }

    public IfcSectionProperties getSectionDefinition() {
        return sectionDefinition;
    }

    public void setSectionDefinition(IfcSectionProperties sectionDefinition) {
        this.sectionDefinition = sectionDefinition;
    }

    public SET<IfcReinforcementBarProperties> getCrossSectionReinforcementDefinitions() {
        return crossSectionReinforcementDefinitions;
    }

    public void setCrossSectionReinforcementDefinitions(
        SET<IfcReinforcementBarProperties> crossSectionReinforcementDefinitions
    ) {
        this.crossSectionReinforcementDefinitions = crossSectionReinforcementDefinitions;
    }
}

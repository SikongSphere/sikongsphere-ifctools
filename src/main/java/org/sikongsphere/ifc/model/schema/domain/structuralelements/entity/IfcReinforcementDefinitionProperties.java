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
package org.sikongsphere.ifc.model.schema.domain.structuralelements.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.schema.domain.structuralelements.enumeration.IfcPileConstructionEnum;
import org.sikongsphere.ifc.model.schema.extension.product.entities.IfcBuildingElement;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcPropertySetDefinition;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.profileproperty.entity.IfcSectionReinforcementProperties;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author yiwei
 * @date 2022/12/19 21:40
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENTITY)
public class IfcReinforcementDefinitionProperties extends IfcPropertySetDefinition {
    @IfcOptionField
    private IfcLabel definitionType;
    private LIST<IfcSectionReinforcementProperties> reinforcementSectionDefinitions;

    public IfcReinforcementDefinitionProperties(
        IfcLabel definitionType,
        LIST<IfcSectionReinforcementProperties> reinforcementSectionDefinitions
    ) {
        this.definitionType = definitionType;
        this.reinforcementSectionDefinitions = reinforcementSectionDefinitions;
    }

    @IfcParserConstructor
    public IfcReinforcementDefinitionProperties(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel definitionType,
        LIST<IfcSectionReinforcementProperties> reinforcementSectionDefinitions
    ) {
        super(globalId, ownerHistory, name, description);
        this.definitionType = definitionType;
        this.reinforcementSectionDefinitions = reinforcementSectionDefinitions;
    }

    public IfcLabel getDefinitionType() {
        return definitionType;
    }

    public void setDefinitionType(IfcLabel definitionType) {
        this.definitionType = definitionType;
    }

    public LIST<IfcSectionReinforcementProperties> getReinforcementSectionDefinitions() {
        return reinforcementSectionDefinitions;
    }

    public void setReinforcementSectionDefinitions(
        LIST<IfcSectionReinforcementProperties> reinforcementSectionDefinitions
    ) {
        this.reinforcementSectionDefinitions = reinforcementSectionDefinitions;
    }
}

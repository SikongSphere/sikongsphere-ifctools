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
package org.sikongsphere.ifc.model.schema.domain.electrical.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.domain.electrical.enumeration.IfcElectricDistributionPointFunctionEnum;
import org.sikongsphere.ifc.model.schema.resource.geometricconstraint.entity.IfcObjectPlacement;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcIdentifier;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.representation.entity.IfcProductRepresentation;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;
import org.sikongsphere.ifc.model.schema.shared.bldgservices.entity.IfcFlowController;

/**
 * @author zaiyuan
 * @date 2022/12/19 21:40
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENTITY)
public class IfcElectricDistributionPoint extends IfcFlowController {
    private IfcElectricDistributionPointFunctionEnum distributionPointFunction;
    @IfcOptionField
    private IfcLabel userDefinedFunction;

    @IfcParserConstructor
    public IfcElectricDistributionPoint(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcObjectPlacement objectPlacement,
        IfcProductRepresentation representation,
        IfcIdentifier tag,
        IfcElectricDistributionPointFunctionEnum distributionPointFunction,
        IfcLabel userDefinedFunction
    ) {
        super(
            globalId,
            ownerHistory,
            name,
            description,
            objectType,
            objectPlacement,
            representation,
            tag
        );
        this.distributionPointFunction = distributionPointFunction;
        this.userDefinedFunction = userDefinedFunction;
    }

    public IfcElectricDistributionPointFunctionEnum getDistributionPointFunction() {
        return distributionPointFunction;
    }

    public void setDistributionPointFunction(
        IfcElectricDistributionPointFunctionEnum distributionPointFunction
    ) {
        this.distributionPointFunction = distributionPointFunction;
    }

    public IfcLabel getUserDefinedFunction() {
        return userDefinedFunction;
    }

    public void setUserDefinedFunction(IfcLabel userDefinedFunction) {
        this.userDefinedFunction = userDefinedFunction;
    }
}

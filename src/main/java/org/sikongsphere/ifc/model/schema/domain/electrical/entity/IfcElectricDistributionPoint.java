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
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.domain.electrical.enumeration.IfcElectricDistributionPointFunctionEnum;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.shared.sharedbldgservices.entity.IfcFlowController;

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
        IfcElectricDistributionPointFunctionEnum distributionPointFunction,
        IfcLabel userDefinedFunction
    ) {
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

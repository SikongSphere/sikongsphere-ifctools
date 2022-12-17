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
package org.sikongsphere.ifc.model.schema.extension.process.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.extension.process.enumeration.IfcProcedureTypeEnum;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcProcess;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcIdentifier;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.CORE, type = IfcType.ENTITY)
public class IfcProcedure extends IfcProcess {
    private IfcIdentifier procedureID;
    private IfcProcedureTypeEnum procedureType;
    @IfcOptionField
    private IfcLabel userDefinedProcedureType;

    @IfcParserConstructor
    public IfcProcedure(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcIdentifier procedureID,
        IfcProcedureTypeEnum procedureType,
        IfcLabel userDefinedProcedureType
    ) {
        super(globalId, ownerHistory, name, description, objectType);
        this.procedureID = procedureID;
        this.procedureType = procedureType;
        this.userDefinedProcedureType = userDefinedProcedureType;
    }

    public IfcIdentifier getProcedureID() {
        return procedureID;
    }

    public void setProcedureID(IfcIdentifier procedureID) {
        this.procedureID = procedureID;
    }

    public IfcProcedureTypeEnum getProcedureType() {
        return procedureType;
    }

    public void setProcedureType(IfcProcedureTypeEnum procedureType) {
        this.procedureType = procedureType;
    }

    public IfcLabel getUserDefinedProcedureType() {
        return userDefinedProcedureType;
    }

    public void setUserDefinedProcedureType(IfcLabel userDefinedProcedureType) {
        this.userDefinedProcedureType = userDefinedProcedureType;
    }
}

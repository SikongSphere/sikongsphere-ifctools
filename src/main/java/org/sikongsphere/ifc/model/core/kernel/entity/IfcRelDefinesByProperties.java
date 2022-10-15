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
package org.sikongsphere.ifc.model.core.kernel.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.CORE)
public abstract class IfcRelDefinesByProperties extends IfcRelDefines {
    private IfcPropertySetDefinition relatingPropertyDefinition;

    public IfcRelDefinesByProperties() {}

    @IfcParserConstructor
    public IfcRelDefinesByProperties(IfcPropertySetDefinition relatingPropertyDefinition) {
        this.relatingPropertyDefinition = relatingPropertyDefinition;
    }

    public IfcPropertySetDefinition getRelatingPropertyDefinition() {
        return relatingPropertyDefinition;
    }

    public void setRelatingPropertyDefinition(IfcPropertySetDefinition relatingPropertyDefinition) {
        this.relatingPropertyDefinition = relatingPropertyDefinition;
    }
}
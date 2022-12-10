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
package org.sikongsphere.ifc.model.schema.resource.property.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcIdentifier;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;

/**
 * This IfcComplexProperty is used to define complex properties to be handled completely within a property set. The
 * included list may be a mixed or consistent collection of IfcProperty subtypes. This enables the definition of a list
 * of properties to be included as a single 'property' entry in a property set. The definition of such a list can be
 * reused in many different property sets, but the instantiation of such a complex property shall only be used within a
 * single property set.
 *
 * @author zaiyuan
 * @date 2022/12/10 12:29
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcComplexProperty extends IfcProperty {

    private IfcIdentifier usageName;
    private SET<IfcProperty> hasProperties;

    @IfcParserConstructor
    public IfcComplexProperty(
        IfcIdentifier name,
        IfcText description,
        IfcIdentifier usageName,
        SET<IfcProperty> hasProperties
    ) {
        super(name, description);
        this.usageName = usageName;
        this.hasProperties = hasProperties;
    }

    public IfcIdentifier getUsageName() {
        return usageName;
    }

    public void setUsageName(IfcIdentifier usageName) {
        this.usageName = usageName;
    }

    public SET<IfcProperty> getHasProperties() {
        return hasProperties;
    }

    public void setHasProperties(SET<IfcProperty> hasProperties) {
        this.hasProperties = hasProperties;
    }

    @Override
    public boolean illegal() {
        // TODO
        return super.illegal();
    }
}

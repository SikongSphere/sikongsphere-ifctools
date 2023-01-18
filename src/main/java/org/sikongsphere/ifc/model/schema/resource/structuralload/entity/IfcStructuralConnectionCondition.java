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
package org.sikongsphere.ifc.model.schema.resource.structuralload.entity;

import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;

/**
 * Instances of the entity IfcStructuralConnectionCondition or its respective subclasses shall be used to describe
 * more rarely needed connection properties.
 *
 * @author Yiwei
 * @date 2022/12/13
 */
public class IfcStructuralConnectionCondition extends IfcAbstractClass {
    @IfcOptionField
    private IfcLabel name;

    @IfcParserConstructor
    public IfcStructuralConnectionCondition(IfcLabel name) {
        this.name = name;
    }

    public IfcLabel getName() {
        return name;
    }

    public void setName(IfcLabel name) {
        this.name = name;
    }
}

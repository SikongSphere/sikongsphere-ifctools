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
package org.sikongsphere.ifc.newModel.schema.resource.externalreference.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.IfcAbstractClass;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedtype.IfcLabel;

/**
 * An IfcClassificationNotationFacet is a group of alphanumeric characters used within a classification notation.
 * @author zaiyuan
 * @date 2022/12/06
 */

@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcClassificationNotationFacet extends IfcAbstractClass {
    private IfcLabel notationValue;

    @IfcParserConstructor
    public IfcClassificationNotationFacet(IfcLabel notationValue) {
        this.notationValue = notationValue;
    }

    public IfcLabel getNotationValue() {
        return notationValue;
    }

    public void setNotationValue(IfcLabel notationValue) {
        this.notationValue = notationValue;
    }
}

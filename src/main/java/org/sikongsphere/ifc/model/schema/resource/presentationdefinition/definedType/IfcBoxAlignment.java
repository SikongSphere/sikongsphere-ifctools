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
package org.sikongsphere.ifc.model.schema.resource.presentationdefinition.definedType;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.STRING;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;

/**
 * The box alignment specifies the alignment of the text box relative to its position.
 *
 * @author zaiyuan
 * @date 2022/12/17 21:03
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.DEFINED_TYPE)
public class IfcBoxAlignment extends IfcLabel {
    public IfcBoxAlignment(String value) {
        super(value);
    }

    public IfcBoxAlignment(STRING value) {
        super(value);
    }

    public IfcBoxAlignment(IfcLabel value) {
        super(value);
    }
}

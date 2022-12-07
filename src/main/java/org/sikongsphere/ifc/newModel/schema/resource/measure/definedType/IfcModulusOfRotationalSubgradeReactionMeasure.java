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
package org.sikongsphere.ifc.newModel.schema.resource.measure.definedType;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.datatype.REAL;
import org.sikongsphere.ifc.newModel.datatype.STRING;

/**
 * A measure for modulus of rotational subgrade reaction, which expresses the rotational elastic bedding of a linear
 * structural element per length, e.g. a beam. It is typically measured in Nm/(m*rad).
 * @author zaiyuan
 * @date 2022/12/07 21:38
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcModulusOfRotationalSubgradeReactionMeasure extends REAL {
    public IfcModulusOfRotationalSubgradeReactionMeasure() {}

    public IfcModulusOfRotationalSubgradeReactionMeasure(double value) {
        super(value);
    }

    @IfcParserConstructor
    public IfcModulusOfRotationalSubgradeReactionMeasure(STRING value) {
        super(value);
    }
}

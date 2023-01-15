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
package org.sikongsphere.ifc.model.schema.resource.measure.definedType;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.DOUBLE;
import org.sikongsphere.ifc.model.datatype.REAL;
import org.sikongsphere.ifc.model.datatype.STRING;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcDerivedMeasureValue;

/**
 * A measure for modulus of linear subgrade reaction, which expresses the elastic bedding of a linear structural element
 * per length, e.g. a beam. It is typically measured in N/m^2.
 * @author zaiyuan
 * @date 2022/12/07 21:38
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.DEFINED_TYPE, isStepElement = false)
public class IfcModulusOfLinearSubgradeReactionMeasure extends REAL
    implements
        IfcDerivedMeasureValue {
    public IfcModulusOfLinearSubgradeReactionMeasure() {}

    public IfcModulusOfLinearSubgradeReactionMeasure(double value) {
        super(value);
    }

    public IfcModulusOfLinearSubgradeReactionMeasure(DOUBLE value) {
        super(value);
    }

    @IfcParserConstructor
    public IfcModulusOfLinearSubgradeReactionMeasure(STRING value) {
        super(value);
    }
}

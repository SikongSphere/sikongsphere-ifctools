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
import org.sikongsphere.ifc.model.schema.resource.cost.selectType.IfcAppliedValueSelect;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcMeasureValue;
import org.sikongsphere.ifc.model.schema.resource.presentationappearance.selecttype.IfcSizeSelect;

import java.util.Locale;

/**
 * A ratio measure is the value of the relation between two physical quantities that are of the same kind.
 *
 * NOTE: Input given in percent is to be divided by 100% when stored as an IfcRatioMeasure. E.g. 25% becomes 0.25.
 * @author stan
 * @date 2022/09/01 23:45
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.DEFINED_TYPE, isStepElement = false)
public class IfcRatioMeasure extends REAL
    implements
        IfcMeasureValue,
        IfcAppliedValueSelect,
        IfcSizeSelect {
    public IfcRatioMeasure() {}

    public IfcRatioMeasure(double value) {
        super(value);
    }

    public IfcRatioMeasure(DOUBLE value) {
        super(value);
    }

    @IfcParserConstructor
    public IfcRatioMeasure(STRING value) {
        super(value);
    }
}

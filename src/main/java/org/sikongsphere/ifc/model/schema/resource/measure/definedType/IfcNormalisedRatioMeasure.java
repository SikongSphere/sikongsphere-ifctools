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
import org.sikongsphere.ifc.model.datatype.STRING;
import org.sikongsphere.ifc.model.schema.resource.presentationappearance.selecttype.IfcColourOrFactor;
import org.sikongsphere.ifc.model.schema.resource.presentationappearance.selecttype.IfcSizeSelect;

/**
 * Dimensionless measure to express ratio values ranging from 0.0 to 1.0
 *
 * @author stan
 * @date 2022/09/01 23:47
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.DEFINED_TYPE)
public class IfcNormalisedRatioMeasure extends IfcRatioMeasure
    implements
        IfcColourOrFactor,
        IfcSizeSelect {
    public IfcNormalisedRatioMeasure() {}

    public IfcNormalisedRatioMeasure(DOUBLE value) {
        super(value);
    }

    @IfcParserConstructor
    public IfcNormalisedRatioMeasure(STRING value) {
        super(value);
    }
}

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
 * The sectional area integral measure is typically used in torsional analysis. It is usually measured in m^5.
 * @author zaiyuan
 * @date 2022/12/07 21:38
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcSectionalAreaIntegralMeasure extends REAL {
    public IfcSectionalAreaIntegralMeasure() {}

    public IfcSectionalAreaIntegralMeasure(double value) {
        super(value);
    }

    @IfcParserConstructor
    public IfcSectionalAreaIntegralMeasure(STRING value) {
        super(value);
    }
}

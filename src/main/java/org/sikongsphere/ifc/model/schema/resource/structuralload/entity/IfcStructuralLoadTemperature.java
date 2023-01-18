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

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcThermodynamicTemperatureMeasure;

/**
 * An instance of the entity IfcStructuralLoadTemperature shall be used to define actions which are caused by a temperature change.
 *
 * @author yiwei
 * @date 2022-08-28 18:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcStructuralLoadTemperature extends IfcStructuralLoadStatic {
    @IfcOptionField
    private IfcThermodynamicTemperatureMeasure deltaT_Constant;
    @IfcOptionField
    private IfcThermodynamicTemperatureMeasure deltaT_Y;
    @IfcOptionField
    private IfcThermodynamicTemperatureMeasure deltaT_Z;

    @IfcParserConstructor
    public IfcStructuralLoadTemperature(
        IfcLabel name,
        IfcThermodynamicTemperatureMeasure deltaT_Constant,
        IfcThermodynamicTemperatureMeasure deltaT_Y,
        IfcThermodynamicTemperatureMeasure deltaT_Z
    ) {
        super(name);
        this.deltaT_Constant = deltaT_Constant;
        this.deltaT_Y = deltaT_Y;
        this.deltaT_Z = deltaT_Z;
    }

    public IfcThermodynamicTemperatureMeasure getDeltaT_Constant() {
        return deltaT_Constant;
    }

    public void setDeltaT_Constant(IfcThermodynamicTemperatureMeasure deltaT_Constant) {
        this.deltaT_Constant = deltaT_Constant;
    }

    public IfcThermodynamicTemperatureMeasure getDeltaT_Y() {
        return deltaT_Y;
    }

    public void setDeltaT_Y(IfcThermodynamicTemperatureMeasure deltaT_Y) {
        this.deltaT_Y = deltaT_Y;
    }

    public IfcThermodynamicTemperatureMeasure getDeltaT_Z() {
        return deltaT_Z;
    }

    public void setDeltaT_Z(IfcThermodynamicTemperatureMeasure deltaT_Z) {
        this.deltaT_Z = deltaT_Z;
    }
}

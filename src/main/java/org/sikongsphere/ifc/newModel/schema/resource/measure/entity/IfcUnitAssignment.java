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
package org.sikongsphere.ifc.newModel.schema.resource.measure.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.datatype.LIST;
import org.sikongsphere.ifc.newModel.datatype.SET;
import org.sikongsphere.ifc.newModel.IfcAbstractClass;
import org.sikongsphere.ifc.newModel.schema.resource.measure.selectTypes.IfcUnit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/**
 * This class contains a set of units which may be assigned.
 * @author Wang Bohong
 * @date 2022/9/1 13:10
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcUnitAssignment extends IfcAbstractClass {

    private SET<IfcUnit> units;

    public IfcUnitAssignment() {}

    @IfcParserConstructor
    public IfcUnitAssignment(SET<IfcUnit> units) {
        this.units = units;
    }

    public SET<IfcUnit> getUnits() {
        return units;
    }

    public void setUnits(SET<IfcUnit> units) {
        this.units = units;
    }

    @Override
    public String toIfc() {
        Iterator<IfcUnit> iterator = this.units.getObjects().iterator();
        ArrayList<Integer> list = new ArrayList<>();

        while (iterator.hasNext()) {
            IfcAbstractClass element = (IfcAbstractClass) iterator.next();
            list.add(element.getStepNumber());
        }

        list.sort(Comparator.comparingInt(x -> x));
        LIST<String> strings = new LIST<>();

        list.forEach(x -> strings.add(StringConstant.WELL + x));

        String format = String.format(
            "#%s=%s(%s);",
            this.stepNumber,
            this.getClass().getSimpleName().toUpperCase(Locale.ROOT),
            strings
        );

        return format;
    }
}

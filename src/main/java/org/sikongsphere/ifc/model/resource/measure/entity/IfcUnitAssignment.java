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
package org.sikongsphere.ifc.model.resource.measure.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.basic.LIST;
import org.sikongsphere.ifc.model.basic.SET;
import org.sikongsphere.ifc.model.body.IfcBodyTemplate;
import org.sikongsphere.ifc.model.resource.measure.selecttypes.IfcUnit;

import java.util.*;

/**
 * This class contains a set of units which may be assigned.
 * @author Wang Bohong
 * @date 2022/9/1 13:10
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcUnitAssignment extends IfcBodyTemplate {

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
    public String toString() {
        Iterator<IfcUnit> iterator = this.units.getObjects().iterator();
        ArrayList<Integer> list = new ArrayList<>();

        while (iterator.hasNext()){
            IfcBodyTemplate element = (IfcBodyTemplate) iterator.next();
            list.add(element.stepNumber);
        }

        list.sort(Comparator.comparingInt(x -> x));
        LIST<String> strings = new LIST<>();

        list.forEach(x -> strings.add(StringConstant.WELL + x));

        String format = String.format("#%s=%s(%s);",
                this.stepNumber,
                this.getClass().getSimpleName().toUpperCase(Locale.ROOT),
                strings
        );

        return format;
    }
}

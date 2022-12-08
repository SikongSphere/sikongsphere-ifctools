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
import org.sikongsphere.ifc.model.basic.LIST;
import org.sikongsphere.ifc.newModel.datatype.SET;
import org.sikongsphere.ifc.newModel.IfcAbstractClass;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.newModel.schema.resource.measure.enumeration.IfcDerivedUnitEnum;
import org.sikongsphere.ifc.newModel.schema.resource.measure.selectTypes.IfcUnit;

import java.util.*;

/**
 * This class is used to encapsulate derived unit information
 *
 * @author zaiyuan
 * @date 2022-08-31 18:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcDerivedUnit extends IfcAbstractClass implements IfcUnit {
    private SET<IfcDerivedUnitElement> elements;
    private IfcDerivedUnitEnum unitType;
    private IfcLabel userDefinedType;

    public IfcDerivedUnit(SET<IfcDerivedUnitElement> elements, IfcDerivedUnitEnum unitType) {
        this.elements = elements;
        this.unitType = unitType;
    }

    @IfcParserConstructor
    public IfcDerivedUnit(
        SET<IfcDerivedUnitElement> elements,
        IfcDerivedUnitEnum unitType,
        IfcLabel userDefinedType
    ) {
        this.elements = elements;
        this.unitType = unitType;
        this.userDefinedType = userDefinedType;
    }

    /** TODO
     * DERIVE
     * Dimensions	 : 	IfcDimensionalExponents :=  IfcDeriveDimensionalExponents(SELF);
     */

    public SET<IfcDerivedUnitElement> getElements() {
        return elements;
    }

    public void setElements(SET<IfcDerivedUnitElement> elements) {
        this.elements = elements;
    }

    public IfcDerivedUnitEnum getUnitType() {
        return unitType;
    }

    public void setUnitType(IfcDerivedUnitEnum unitType) {
        this.unitType = unitType;
    }

    public IfcLabel getUserDefinedType() {
        return userDefinedType;
    }

    public void setUserDefinedType(IfcLabel userDefinedType) {
        this.userDefinedType = userDefinedType;
    }

    @Override
    public String toIfc() {

        Iterator<IfcDerivedUnitElement> iterator = this.elements.getObjects().iterator();
        ArrayList<Integer> list = new ArrayList<>();

        while (iterator.hasNext()) {
            IfcDerivedUnitElement element = iterator.next();
            list.add(element.getStepNumber());
        }

        list.sort(Comparator.comparingInt(x -> x));
        LIST<String> strings = new LIST<>();

        list.forEach(x -> strings.add(StringConstant.WELL + x));

        String format = String.format(
            "#%s=%s(%s,%s,%s);",
            this.stepNumber,
            this.getClass().getSimpleName().toUpperCase(Locale.ROOT),
            strings,
            StringConstant.DOT + this.unitType + StringConstant.DOT,
            Optional.ofNullable(this.userDefinedType)
                .map(x -> this.userDefinedType.toString())
                .orElse(StringConstant.DOLLAR)
        );

        return format;
    }
}

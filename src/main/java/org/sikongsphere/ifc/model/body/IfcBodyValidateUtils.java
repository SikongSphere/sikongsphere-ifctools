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
package org.sikongsphere.ifc.model.body;

import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.model.basic.INTEGER;
import org.sikongsphere.ifc.model.basic.LIST;
import org.sikongsphere.ifc.model.basic.SET;
import org.sikongsphere.ifc.model.basic.STRING;
import org.sikongsphere.ifc.model.resource.geometry.definedtypes.IfcDimensionCount;
import org.sikongsphere.ifc.model.resource.geometry.entity.IfcCartesianPoint;
import org.sikongsphere.ifc.model.resource.geometry.entity.IfcDirection;
import org.sikongsphere.ifc.model.resource.material.entity.IfcMaterialLayer;
import org.sikongsphere.ifc.model.resource.material.entity.IfcMaterialLayerSet;
import org.sikongsphere.ifc.model.resource.measure.definedtype.*;
import org.sikongsphere.ifc.model.resource.measure.entity.IfcDimensionalExponents;
import org.sikongsphere.ifc.model.resource.measure.entity.IfcMeasureWithUnit;
import org.sikongsphere.ifc.model.resource.measure.selecttypes.IfcAxis2Placement;
import org.sikongsphere.ifc.model.resource.measure.selecttypes.IfcValue;
import org.sikongsphere.ifc.model.resource.utility.entity.IfcOwnerHistory;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/**
 * This util is used to help with make IfcDataBody
 *
 * @author stan
 * @date 2022/11/24 00:42
 */
public class IfcBodyValidateUtils {

    private ArrayList<Object> list = new ArrayList<>();
    private IfcBodyTemplate value;
    private Integer stepNumber;

    public ArrayList<Object> getList() {
        return this.list;
    }

    public IfcBodyValidateUtils(IfcBodyTemplate value, Integer stepNumber) {

        this.value = value;
        this.stepNumber = stepNumber;
    }

    public void validateTypeToString(Field[] typeFields) throws IllegalAccessException {

        for (int i = 0; i < typeFields.length; i++) {
            Field field = typeFields[i];
            field.setAccessible(true);

            if (!Modifier.isStatic(field.getModifiers())
                && !Modifier.isPublic(field.getModifiers())) {

                if (field.get(this.value) == null) {
                    dealWithNull(field);
                } else if (Boolean.class.equals(field.get(this.value).getClass())) {
                    continue;
                } else if (STRING.class.isAssignableFrom(field.get(this.value).getClass())) {
                    dealWithSTRING(field);
                } else if (Enum.class.isAssignableFrom(field.get(this.value).getClass())) {
                    dealWithENUM(field);
                } else if (IfcTimeStamp.class.equals(field.get(this.value).getClass())) {
                    dealWithIfcTimeStamp(field);
                } else if (LIST.class.isAssignableFrom(field.get(this.value).getClass())) {
                    dealWithLIST(field);
                } else if (IfcMaterialLayerSet.class.equals(this.value.getClass())) {
                    dealWithIfcMaterialLayerSet(field);
                } else if (SET.class.equals(field.get(this.value).getClass())) {
                    dealWithSET(field);
                } else if (IfcDimensionCount.class.equals(field.get(this.value).getClass())) {
                    dealWithIfcDimensionCount(field);
                } else if (IfcOwnerHistory.class.equals(field.get(this.value).getClass())) {
                    dealWithIfcOwnerHistory(field);
                } else if (IfcCompoundPlaneAngleMeasure.class.equals(
                    field.get(this.value).getClass()
                )) {
                    dealWithIfcCompoundPlaneAngleMeasure(field);
                } else if (IfcDimensionalExponents.class.equals(field.get(this.value).getClass())) {
                    dealWithIfcDimensionalExponents(field);
                } else if (INTEGER.class.equals(field.get(this.value).getClass())) {
                    dealWithINTEGER(field);
                } else if (IfcRatioMeasure.class.equals(field.get(this.value).getClass())) {
                    dealWithIfcRatioMeasure(field);
                } else if (IfcMeasureWithUnit.class.equals(field.get(this.value).getClass())) {
                    dealWithIfcMeasureWithUnit(field);
                } else if (IfcDirection.class.equals(field.get(this.value).getClass())) {
                    dealWithIfcDirection(field);
                } else if (IfcLengthMeasure.class.equals(field.get(this.value).getClass())) {
                    dealWithIfcLengthMeasure(field);
                } else if (IfcCartesianPoint.class.equals(field.get(this.value).getClass())) {
                    dealWithIfcCartesianPoint(field);
                } else if (IfcPositiveLengthMeasure.class.equals(
                    field.get(this.value).getClass()
                )) {
                    dealWithIfcPositiveLengthMeasure(field);
                } else if (IfcNormalisedRatioMeasure.class.equals(
                    field.get(this.value).getClass()
                )) {
                    dealWithIfcNormalisedRatioMeasure(field);
                } else if (IfcBoolean.class.equals(field.get(this.value).getClass())) {
                    dealWithIfcBoolean(field);
                } else {
                    dealWithRests(field);
                }
            }
        }
    }

    private void dealWithNull(Field field) {
        if (IfcAxis2Placement.class.equals(field.getType())) {
            this.list.add(StringConstant.ASTERISK);
        } else {
            this.list.add(StringConstant.DOLLAR);
        }
    }

    private void dealWithSTRING(Field field) throws IllegalAccessException {
        STRING element = (STRING) field.get(this.value);
        if (element.isDefault()) {
            this.list.add(StringConstant.ASTERISK);
        } else {
            this.list.add(element.value);
        }
    }

    private void dealWithENUM(Field field) throws IllegalAccessException {
        Enum element = (Enum) field.get(this.value);
        this.list.add(StringConstant.DOT + element.name() + StringConstant.DOT);
    }

    private void dealWithIfcTimeStamp(Field field) throws IllegalAccessException {
        IfcTimeStamp element = (IfcTimeStamp) field.get(this.value);
        this.list.add(element.getTimestamp());
    }

    private void dealWithLIST(Field field) throws IllegalAccessException {

        LIST elements = (LIST) field.get(this.value);

        ArrayList<String> tempList = new ArrayList<>();

        for (int j = 0; j < elements.size(); j++) {

            if (STRING.class.equals(elements.get(j).getClass())) {
                STRING element = (STRING) elements.get(j);
                tempList.add(element.value);
            } else if (IfcCartesianPoint.class.equals(elements.get(j).getClass())) {
                IfcCartesianPoint element = (IfcCartesianPoint) elements.get(j);
                if (!element.isDefault()) {
                    tempList.add(StringConstant.WELL + element.stepNumber);
                }
            } else if (IfcMaterialLayer.class.equals(elements.get(j).getClass())) {
                IfcMaterialLayer element = (IfcMaterialLayer) elements.get(j);
                if (!element.isDefault()) {
                    tempList.add(StringConstant.WELL + element.stepNumber);
                }
            }

        }
        String replacedTuple = String.valueOf(tempList)
            .replace(StringConstant.LEFT_SQUARE_BRACKETS, StringConstant.LEFT_BRACKETS)
            .replace(StringConstant.RIGHT_SQUARE_BRACKETS, StringConstant.RIGHT_BRACKETS);

        this.list.add(replacedTuple);
    }

    private void dealWithSET(Field field) throws IllegalAccessException {
        SET o = (SET) field.get(value);
        Iterator iterator = o.getObjects().iterator();

        if (iterator.hasNext()) {
            ArrayList<Integer> temp = new ArrayList<>();

            while (iterator.hasNext()) {
                IfcBodyTemplate next = (IfcBodyTemplate) iterator.next();
                temp.add(next.stepNumber);
            }

            temp.sort(Comparator.comparingInt(x -> x));

            ArrayList<String> strings = new ArrayList<>();
            temp.forEach(x -> strings.add(StringConstant.WELL + x));
            list.add(
                String.valueOf(strings)
                    .replace(StringConstant.LEFT_SQUARE_BRACKETS, StringConstant.LEFT_BRACKETS)
                    .replace(StringConstant.RIGHT_SQUARE_BRACKETS, StringConstant.RIGHT_BRACKETS)
            );
        }
    }

    private void dealWithIfcDimensionCount(Field field) throws IllegalAccessException {
        IfcDimensionCount element = (IfcDimensionCount) field.get(value);

        if (element.isDefault()) {
            this.list.add(StringConstant.ASTERISK);
        } else {
            this.list.add(element.getDimensionCount().value);
        }
    }

    private void dealWithIfcCompoundPlaneAngleMeasure(Field field) throws IllegalAccessException {
        IfcCompoundPlaneAngleMeasure element = (IfcCompoundPlaneAngleMeasure) field.get(this.value);
        LIST<INTEGER> elementValue = element.getValue();

        StringBuilder builder = new StringBuilder();
        builder.append(StringConstant.LEFT_BRACKETS);

        for (int i = 0; i < elementValue.size(); i++) {
            builder.append(elementValue.get(i).value);
            builder.append(StringConstant.COMMA);
        }
        builder.deleteCharAt(builder.length() - 1);
        builder.append(StringConstant.RIGHT_BRACKETS);

        this.list.add(builder.toString());
    }

    private void dealWithRests(Field field) throws IllegalAccessException {
        IfcBodyTemplate element = (IfcBodyTemplate) field.get(value);
        this.list.add(StringConstant.WELL + element.stepNumber);
    }

    private void dealWithIfcOwnerHistory(Field field) throws IllegalAccessException {
        IfcOwnerHistory element = (IfcOwnerHistory) field.get(this.value);
        if (element.stepNumber < this.stepNumber) {
            this.list.add(StringConstant.WELL + element.stepNumber);
        }
    }

    private void dealWithIfcMaterialLayerSet(Field field) throws IllegalAccessException {
        LIST element = (LIST) field.get(value);
        ArrayList<Object> arrayList = new ArrayList<>();

        for (int j = 0; j < element.size(); j++) {
            IfcMaterialLayer materialLayer = (IfcMaterialLayer) element.get(j);

            if (materialLayer.stepNumber < this.stepNumber) {
                arrayList.add(StringConstant.WELL + materialLayer.stepNumber);
            }
        }
        String replacedTuple = String.valueOf(arrayList)
            .replace(StringConstant.LEFT_SQUARE_BRACKETS, StringConstant.LEFT_BRACKETS)
            .replace(StringConstant.RIGHT_SQUARE_BRACKETS, StringConstant.RIGHT_BRACKETS);
        this.list.add(replacedTuple);
    }

    private void dealWithIfcDimensionalExponents(Field field) throws IllegalAccessException {
        IfcDimensionalExponents element = (IfcDimensionalExponents) field.get(this.value);
        if (element.isDefault()) {
            this.list.add(StringConstant.ASTERISK);
        } else {
            this.list.add(StringConstant.WELL + element.stepNumber);
        }
    }

    private void dealWithINTEGER(Field field) throws IllegalAccessException {
        INTEGER element = (INTEGER) field.get(this.value);
        this.list.add(element.value);
    }

    private void dealWithIfcRatioMeasure(Field field) throws IllegalAccessException {
        IfcRatioMeasure element = (IfcRatioMeasure) field.get(this.value);
        this.list.add(
            StringConstant.IFCRATIOMEASURE + StringConstant.LEFT_BRACKETS + element.value
                + StringConstant.RIGHT_BRACKETS
        );
    }

    private void dealWithIfcMeasureWithUnit(Field field) throws IllegalAccessException {
        IfcMeasureWithUnit element = (IfcMeasureWithUnit) field.get(this.value);
        IfcRatioMeasure valueComponent = (IfcRatioMeasure) element.getValueComponent();
        if (valueComponent.isDefault()) {
            this.list.add(StringConstant.ASTERISK);
        } else {
            this.list.add(StringConstant.WELL + valueComponent.stepNumber);
        }
    }

    private void dealWithIfcDirection(Field field) throws IllegalAccessException {
        IfcDirection element = (IfcDirection) field.get(this.value);
        if (element.isDefault()) {
            this.list.add(StringConstant.ASTERISK);
        } else {
            this.list.add(StringConstant.WELL + element.stepNumber);
        }
    }

    private void dealWithIfcLengthMeasure(Field field) throws IllegalAccessException {
        IfcLengthMeasure element = (IfcLengthMeasure) field.get(this.value);
        this.list.add(element.value);
    }

    private void dealWithIfcCartesianPoint(Field field) throws IllegalAccessException {
        IfcCartesianPoint element = (IfcCartesianPoint) field.get(this.value);
        if (!element.isDefault()) {
            this.list.add(StringConstant.WELL + element.stepNumber);
        }
    }

    private void dealWithIfcPositiveLengthMeasure(Field field) throws IllegalAccessException {
        IfcPositiveLengthMeasure element = (IfcPositiveLengthMeasure) field.get(value);
        if (element.isDefault()) {
            this.list.add(StringConstant.ASTERISK);
        } else {
            this.list.add(element.value);
        }
    }

    private void dealWithIfcNormalisedRatioMeasure(Field field) throws IllegalAccessException {
        IfcNormalisedRatioMeasure element = (IfcNormalisedRatioMeasure) field.get(this.value);
        if (element.isDefault()) {
            this.list.add(StringConstant.ASTERISK);
        } else {
            this.list.add(element.value);
        }
    }

    private void dealWithIfcBoolean(Field field) throws IllegalAccessException {
        IfcBoolean element = (IfcBoolean) field.get(value);
        String flag;

        if (element.isValue()) {
            flag = StringConstant.TRUE;
        } else {
            flag = StringConstant.FALSE;
        }

        this.list.add(
            StringConstant.IFCBOOLEAN + StringConstant.LEFT_BRACKETS + StringConstant.DOT + flag
                + StringConstant.DOT + StringConstant.RIGHT_BRACKETS
        );
    }
}

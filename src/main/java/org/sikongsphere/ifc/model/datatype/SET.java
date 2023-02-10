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
package org.sikongsphere.ifc.model.datatype;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.IfcDataType;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcParameterValue;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcValue;

import java.util.*;

/**
 * This class is used to encapsulate set information
 *
 * @author zaiyuan
 * @date 2022-08-11 18:30:00
 */
public class SET<E> extends IfcDataType {

    private Set<E> objects = new HashSet<>();

    public SET() {}

    public SET(Set<E> objects) {
        this.objects = objects;
    }

    public void add(E object) {
        objects.add(object);
    }

    public void addAll(LIST<E> list) {
        objects.addAll(list.getObjects());
    }

    public Integer size() {
        return objects.size();
    }

    public Set<E> getObjects() {
        return objects;
    }

    @Override
    public String toString() {

        Iterator<Object> iterator = (Iterator<Object>) this.objects.iterator();
        Object element = StringConstant.NONE;

        while (iterator.hasNext()) {
            element = iterator.next();
            break;
        }
        if (element.equals(StringConstant.NONE)) {
            return StringConstant.LEFT_BRACKETS + StringConstant.RIGHT_BRACKETS;
        }
        String result = StringConstant.NOTHING;

        // 当SET内为stepNumer编号
        if (IfcAbstractClass.class.isAssignableFrom(element.getClass())) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            IfcAbstractClass startNode = (IfcAbstractClass) element;
            list.add(startNode.getStepNumber());

            while (iterator.hasNext()) {
                IfcAbstractClass nodeLeft = (IfcAbstractClass) iterator.next();
                list.add(nodeLeft.getStepNumber());
            }

            list.sort(Comparator.comparingInt(x -> x));
            LIST<Object> strings = new LIST<>();

            list.forEach(x -> strings.add(StringConstant.WELL + x));

            result = strings.toString().replace(StringConstant.WHITE_SPACE, StringConstant.NOTHING);
        }
        // 当为接口
        else if (REAL.class.isAssignableFrom(element.getClass())) {
            LIST<String> stringArrayList = new LIST<>();
            REAL startNode = (REAL) element;
            stringArrayList.add(
                String.format(
                    "%s(%s)",
                    startNode.getClass().getSimpleName().toUpperCase(Locale.ROOT),
                    startNode.getValue()
                )
            );

            while (iterator.hasNext()) {
                REAL nodeLeft = (REAL) iterator.next();
                String format = String.format(
                    "%s(%s)",
                    nodeLeft.getClass().getSimpleName().toUpperCase(Locale.ROOT),
                    nodeLeft.getValue()
                );
                stringArrayList.add(format);
            }

            result = stringArrayList.toString();
        }

        return result;
    }
}

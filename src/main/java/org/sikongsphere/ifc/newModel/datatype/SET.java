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
package org.sikongsphere.ifc.newModel.datatype;

import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.newModel.IfcAbstractClass;
import org.sikongsphere.ifc.newModel.IfcDataType;

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

        Iterator<IfcAbstractClass> iterator = (Iterator<IfcAbstractClass>) this.objects.iterator();
        ArrayList<Integer> list = new ArrayList<>();

        while (iterator.hasNext()) {
            IfcAbstractClass element = iterator.next();
            list.add(element.getStepNumber());
        }

        list.sort(Comparator.comparingInt(x -> x));
        LIST<Object> strings = new LIST<>();

        list.forEach(x -> strings.add(StringConstant.WELL + x));

        return strings.toString();
    }
}

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

import org.sikongsphere.ifc.newModel.IfcDataType;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used to encapsulate list information
 *
 * @author zaiyuan
 * @date 2022-08-11 18:30:00
 */
public class LIST<E> extends IfcDataType {
    private List<E> objects = new ArrayList<>();

    public LIST(List<E> objects) {
        this.objects = objects;
    }

    public LIST() {}

    public void add(E object) {
        objects.add(object);
    }

    public E get(Integer idx) {
        return objects.get(idx);
    }

    public void addAll(SET<E> set) {
        objects.addAll(set.getObjects());
    }

    public Integer size() {
        return objects.size();
    }

    public List<E> getObjects() {
        return objects;
    }

    public void setObjects(List<E> objects) {
        this.objects = objects;
    }
}
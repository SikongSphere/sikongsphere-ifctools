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
package org.sikongsphere.ifc.model.basic;

import java.util.HashSet;
import java.util.Set;

/**
 * This class is used to encapsulate set information
 *
 * @author zaiyuan
 * @date 2022-08-11 18:30:00
 */
public class SET<E> extends IfcBasicType {
    private Set<E> objects = new HashSet<>();

    public SET() {}

    public SET(Set<E> objects) {
        this.objects = objects;
    }

    public void add(E object) {
        objects.add(object);
    }

    public Integer size() {
        return objects.size();
    }

    public Set<E> getObjects() {
        return objects;
    }
}

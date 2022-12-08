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

import org.sikongsphere.ifc.common.constant.StringConstant;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used to encapsulate list information
 *
 * @author zaiyuan
 * @date 2022-08-11 18:30:00
 */
public class LIST<E> extends IfcBasicType {
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

    public Integer size() {
        return objects.size();
    }

    @Override
    public String toString() {
        String format = String.format("%s", objects.toString());

        return format.replace(StringConstant.LEFT_SQUARE_BRACKETS, StringConstant.LEFT_BRACKETS)
            .replace(StringConstant.RIGHT_SQUARE_BRACKETS, StringConstant.RIGHT_BRACKETS);
    }
}

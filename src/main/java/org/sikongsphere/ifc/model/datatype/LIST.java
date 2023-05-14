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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.io.serializer.LISTSerializer;
import org.sikongsphere.ifc.model.IfcDataType;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used to encapsulate list information
 *
 * @author zaiyuan
 * @date 2022-08-11 18:30:00
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonSerialize(using = LISTSerializer.class)
public class LIST<E> extends IfcDataType {

    private List<E> objects = new ArrayList<>();

    public LIST(List<E> objects) {
        this.objects = objects;
    }

    public LIST(E... objects){
        for(E object : objects) {
            add(object);
        }
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

    @Override
    public String toString() {
        String str = objects.toString();
        String substring = str.substring(1, str.length() - 1);

        return StringConstant.LEFT_BRACKETS + substring + StringConstant.RIGHT_BRACKETS;
    }
}

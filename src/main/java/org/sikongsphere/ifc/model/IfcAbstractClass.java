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
package org.sikongsphere.ifc.model;

import org.sikongsphere.ifc.common.annotation.IfcDeriveParameter;
import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.common.exception.SikongSphereException;
import org.sikongsphere.ifc.model.datatype.LIST;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * This abstract class is mainly used to encapsulate class
 *
 * @author zaiyuan
 * @date 2022-08-11 18:30:00
 */
public abstract class IfcAbstractClass implements IfcInterface {
    protected int stepNumber;

    public IfcAbstractClass() {}

    protected IfcAbstractClass(int stepNumber) {
        this.stepNumber = stepNumber;
    }

    public int getStepNumber() {
        return stepNumber;
    }

    public void setStepNumber(int stepNumber) {
        this.stepNumber = stepNumber;
    }

    public boolean isDefault() {
        return false;
    }

    protected String getFileItem(IfcAbstractClass object) throws NoSuchMethodException,
        InvocationTargetException, IllegalAccessException {
        List<List<Field>> objects = new ArrayList<>();
        Class<?> superClass = object.getClass();
        while (superClass != null) {
            List<Field> fields1 = Arrays.stream(superClass.getDeclaredFields())
                .filter(i -> !i.isAnnotationPresent(IfcInverseParameter.class))
                .filter(i -> !i.isAnnotationPresent(IfcDeriveParameter.class))
                .filter(i -> !"stepNumber".equals(i.getName()))
                .collect(Collectors.toList());
            objects.add(fields1);
            superClass = superClass.getSuperclass();
        }

        List<String> strings = new ArrayList<>();
        for (int i = objects.size() - 1; i >= 0; i--) {
            List<Field> fields1 = objects.get(i);
            for (Field field : fields1) {
                String name = field.getName();
                String getFunction = String.format(
                    "get%s%s",
                    name.substring(0, 1).toUpperCase(),
                    name.substring(1)
                );
                Object o = null;
                try {
                    o = object.getClass().getMethod(getFunction).invoke(object);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                strings.add(getParamString(o));
            }
        }

        // assert object.getClass() != null;
        return String.format(
            "%s(%s);",
            object.getClass().getSimpleName().toUpperCase(),
            String.join(",", strings)
        );
    }

    /**
     * used to get params of each line of IFC element.
     * Actually, the toString method has already been overwritten to fit the right format.
     */
    protected String getParamString(Object o) {
        // if null
        if (o == null) {
            return "$";
        }
        // if IfcDataType. Such as STRING, LIST, SET.
        else if (IfcDataType.class.isAssignableFrom(o.getClass())) {
            if (o instanceof LIST) {
                List<Object> objects = ((LIST<Object>) o).getObjects();
                List<String> strings = new ArrayList<>();
                for (Object object : objects) {
                    strings.add(getParamString(object));
                }
                return String.format("(%s)", String.join(",", strings));
            } else {
                return o.toString();
            }
        }
        /*
        if IfcAbstractClass, like IfcPerson. It should be judged whether it's false,
        which results in the decision of *.
         */
        else if (IfcAbstractClass.class.isAssignableFrom(o.getClass())) {
            if (((IfcAbstractClass) o).getStepNumber() == 0) {
                return StringConstant.ASTERISK;
            } else {
                return String.format("#%s", ((IfcAbstractClass) o).getStepNumber());
            }
        }
        // if Enum, like .ADDED., should be wrapped with DOT.
        else if (Enum.class.isAssignableFrom(o.getClass())) {
            return String.format(".%s.", o);
        } else if (String.class.isAssignableFrom(o.getClass())) {
            return o.toString();
        } else {
            throw new SikongSphereException("Unsupported Type");
        }
    }

    @Override
    public void check() {
        if (!illegal()) {
            throw new SikongSphereException("Value is illegal");
        }
    }

    @Override
    public boolean illegal() {
        return true;
    }

    /**
     * used to output str
     */
    public String toIfc() throws InvocationTargetException, NoSuchMethodException,
        IllegalAccessException {
        String format = String.format("#%s=%s", this.stepNumber, getFileItem(this));

        return format;
    }
}

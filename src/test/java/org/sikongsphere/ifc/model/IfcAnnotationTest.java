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

import org.sikongsphere.ifc.common.annotation.IfcClass;

import java.lang.reflect.Method;

public class IfcAnnotationTest {

    @IfcClass(value = "test1")
    public void test1() {
        System.out.println("test1()方法");
    }

    @IfcClass("test2")
    public void test2() {
        System.out.println("test2()方法");
    }

    public static void main(String[] args) {
        Class clazz = IfcAnnotationTest.class;
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            boolean flag = method.isAnnotationPresent(IfcClass.class);
            if (flag) {
                IfcClass c = method.getAnnotation(IfcClass.class);
                System.out.println(c.value());
            }
        }
    }
}

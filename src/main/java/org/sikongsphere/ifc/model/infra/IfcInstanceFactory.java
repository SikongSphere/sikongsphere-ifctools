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
package org.sikongsphere.ifc.model.infra;

import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.model.IfcNode;
import org.sikongsphere.ifc.model.body.IfcEmptyNode;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;

/**
 * This class is used to encapsulate actor role information
 *
 * @author zaiyuan
 * @date 2022-08-28 18:30:00
 */
public class IfcInstanceFactory {

    public static IfcNode getIfcInstance(String stepName, Object... args) {
        IfcClassContainer instance = IfcClassContainer.getInstance();
        Constructor<?>[] constructors = instance.get(stepName.toUpperCase(Locale.ROOT))
            .getConstructors();
        Object o = new IfcEmptyNode();
        // ToDO 这个地方写发还有问题，需要思考下怎么处理
        if (args[0].getClass().isArray()) args = (Object[]) args[0];
        for (Constructor<?> constructor : constructors) {
            if (constructor.isAnnotationPresent(IfcParserConstructor.class)) {
                try {
                    validateType(constructor, args);
                    o = constructor.newInstance(args);
                } catch (Exception e) {
                    throw new RuntimeException(
                        String.format("Class for %s does not instantiated successfully.", stepName)
                    );
                }
            }
        }
        return (IfcNode) o;
    }

    public static void validateType(Constructor<?> constructor, Object... args)
        throws NoSuchMethodException, InvocationTargetException, InstantiationException,
        IllegalAccessException {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        for (int i = 0; i < length; i++) {
            if (args[i] == null) continue;
            if (parameterTypes[i] != args[i].getClass()) {
                Object instance = parameterTypes[i].getConstructor(args[i].getClass())
                    .newInstance(args[i]);
                args[i] = instance;
            }
        }
    }

}

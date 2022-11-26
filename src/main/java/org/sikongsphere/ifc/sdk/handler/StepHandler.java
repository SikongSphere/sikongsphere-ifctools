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
package org.sikongsphere.ifc.sdk.handler;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.model.IfcNode;
import org.sikongsphere.ifc.model.basic.SET;
import org.sikongsphere.ifc.model.body.IfcBodyTemplate;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * This is an Handler for Step File
 *
 * @Author: zaiyuan
 * @Date: 2022/11/25 11:47
 */
public class StepHandler {
    private static AtomicInteger stepNumIter = new AtomicInteger(0);

    /**
     * 0 means we have not visited
     * -1 means we have visited
     *
     * @param node
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    public void handle(IfcBodyTemplate node) throws NoSuchMethodException,
        InvocationTargetException, IllegalAccessException {
        node.stepNumber = -1;
        IfcClass ifcClassAnnotation = node.getClass().getAnnotation(IfcClass.class);
        if (null == ifcClassAnnotation) {
            return;
        }

        boolean hasParserConstructor = false;
        for (Constructor<?> constructor : node.getClass().getConstructors()) {
            if (constructor.isAnnotationPresent(IfcParserConstructor.class)) {
                hasParserConstructor = true;
                break;
            }
        }

        if (hasParserConstructor) {
            for (Field declaredField : node.getClass().getDeclaredFields()) {
                String name = declaredField.getName();
                String getFunction = String.format(
                    "get%s%s",
                    name.substring(0, 1).toUpperCase(),
                    name.substring(1)
                );
                Method method = node.getClass().getMethod(getFunction);
                Object result = method.invoke(node);

                if (result instanceof IfcBodyTemplate
                    && (null != result.getClass().getAnnotation(IfcClass.class))
                    && result.getClass().getAnnotation(IfcClass.class).isStepElement()
                    && (((IfcBodyTemplate) result).stepNumber == 0)) {
                    handle((IfcBodyTemplate) result);
                } else if (result instanceof SET) {
                    for (Object object : ((SET) result).getObjects()) {
                        if (IfcNode.class.isAssignableFrom(object.getClass())) {
                            handle((IfcBodyTemplate) object);
                        }
                    }
                }
            }

            if (ifcClassAnnotation.isStepElement() && node.stepNumber < 1) {
                node.stepNumber = stepNumIter.addAndGet(1);
            }
        }
    }
}

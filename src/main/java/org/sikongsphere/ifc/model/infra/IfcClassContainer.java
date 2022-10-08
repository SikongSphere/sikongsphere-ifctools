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

import org.reflections.Reflections;
import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcGenericType;
import org.sikongsphere.ifc.common.constant.ConfigParameter;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.environment.ConfigProvider;
import org.sikongsphere.ifc.common.exception.SikongSphereException;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/**
 * We use the singleton pattern to encapsulate types, and then maintain a system of class objects in memory.
 * There are two benefits to doing this:
 * 1> No need for multiple class loading.
 * 2> When you need to construct an instance, you only need to take out the class object and instantiate it,
 *    and the overhead is relatively low.
 *
 * @author zaiyuan
 * @date 2022-09-11 16:30:00
 */
public class IfcClassContainer {
    /**
     * Constructor, we cannot instantiate IfcContiner Object bias this constructor function
     */
    private IfcClassContainer() {
        String packageName = ConfigProvider.getProperty(ConfigParameter.IFC_MODEL_PATH_KEY);
        Reflections reflections = new Reflections(packageName);
        Set<Class<?>> typesAnnotatedWith = reflections.getTypesAnnotatedWith(IfcClass.class);
        typesAnnotatedWith.forEach(this::wrapTypeClass);
        typesAnnotatedWith.forEach(this::wrapGenerics);
    }

    private void wrapTypeClass(Class<?> clazz) {
        IfcClass annotation = clazz.getAnnotation(IfcClass.class);
        // if (annotation.type() == IfcType.ENUMERATION) {
        clazzMap.put(clazz.getSimpleName().toUpperCase(Locale.ROOT), clazz);
        // }
    }

    private void wrapGenerics(Class<?> clazz) {
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            if (declaredField.isAnnotationPresent(IfcGenericType.class)) {
                try {
                    genericMap.put(
                        clazz.getSimpleName().toUpperCase(Locale.ROOT),
                        (Object[]) declaredField.get(null)
                    );
                } catch (IllegalAccessException e) {
                    throw new SikongSphereException();
                }
                break;
            }
        }
    }

    /**
     * Map of Class which is annotated with IfcClass
     */
    private final Map<String, Class<?>> clazzMap = new HashMap<>();

    private final Map<String, Object[]> genericMap = new HashMap<>();

    /**
     * private static class to hold IfcClassContainer instance
     */
    private static class SingleTonHolder {
        private static final IfcClassContainer INSTANCE = new IfcClassContainer();
    }

    public static IfcClassContainer getInstance() {
        return SingleTonHolder.INSTANCE;
    }

    public void add(Class<?> clazz) {
        clazzMap.put(clazz.getName(), clazz);
    }

    public void remove(String clazzName) {
        clazzMap.remove(clazzName);
    }

    public void addGeneric(Class<?> clazz, Object[] generics) {
        genericMap.put(clazz.getName(), generics);
    }

    public void removeGeneric(String clazzName) {
        genericMap.remove(clazzName);
    }

    public Class<?> get(String clazzName) {
        return clazzMap.get(clazzName);
    }

    public Object[] getGeneric(String clazzName) {
        return genericMap.get(clazzName);
    }

    public boolean contains(String clazzName) {
        return clazzMap.containsKey(clazzName);
    }
}

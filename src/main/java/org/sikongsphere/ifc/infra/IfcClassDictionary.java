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
package org.sikongsphere.ifc.infra;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * IfcDictionary
 *
 * @author zaiyuan
 * @date 2023-01-04 21:30:00
 */
public class IfcClassDictionary {

    /**
     * dictionary for IfcClasses: key is index and value is name
     */
    private final Map<Integer, String> index2NameDictionary = new LinkedHashMap<>();

    /**
     * dictionary for IfcClasses:
     */
    private final Map<String, Integer> name2IndexDictionary = new HashMap<>();

    private IfcClassDictionary() {}

    public void init(Map<String, Class<?>> clazzMap) {
        Integer index = 0;
        Set<Map.Entry<String, Class<?>>> entries = clazzMap.entrySet();
        for (Map.Entry<String, Class<?>> entry : entries) {
            index++;
            String ifcClassName = entry.getKey();
            index2NameDictionary.put(index, ifcClassName);
            name2IndexDictionary.put(ifcClassName, index);
        }
    }

    /**
     * private static class to hold IfcClassContainer instance
     */
    private static class SingleTonHolder {
        private static final IfcClassDictionary INSTANCE = new IfcClassDictionary();
    }

    public static IfcClassDictionary getInstance() {
        return SingleTonHolder.INSTANCE;
    }

    public String getNameByIndex(Integer index) {
        return index2NameDictionary.get(index);
    }

    public Integer getIndexByName(String name) {
        return name2IndexDictionary.get(name);
    }

}

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
package org.sikongsphere.ifc.common.environment;

import org.sikongsphere.ifc.common.constant.ConfigParameter;

import java.io.IOException;
import java.util.Properties;

/**
 * Config Provider
 *
 * @author zaiyuan
 * @date 2022/09/15 19:52
 */
public class ConfigProvider {
    public static String getProperty(String key) {
        String f = "/sikongsphere.properties";
        Properties props = new Properties();
        try {
            props.load(ConfigProvider.class.getResourceAsStream(f));
        } catch (IOException e) {
            throw new RuntimeException(String.format("%s property is not found", key));
        }
        return props.getProperty(key);
    }
}

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
import org.sikongsphere.ifc.common.environment.entity.Application;
import org.sikongsphere.ifc.common.exception.SikongSphereConfigException;
import org.yaml.snakeyaml.Yaml;

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
        String s = System.getProperty(
            ConfigParameter.SIKONGSPHERE_CONFIG_PROPERTIES_PATH_KEY,
            ConfigParameter.SIKONGSPHERE_CONFIG_PROPERTIES_DEFAULT_PATH
        );
        Properties props = new Properties();
        try {
            props.load(ConfigProvider.class.getResourceAsStream(s));
        } catch (IOException e) {
            throw new SikongSphereConfigException(String.format("%s property is not found", key));
        }
        return props.getProperty(key);
    }

    public static Application getApplication() {
        String s = System.getProperty(
            ConfigParameter.SIKONGSPHERE_APPLICATION_CONFIG_PATH_KEY,
            ConfigParameter.SIKONGSPHERE_APPLICATION_CONFIG_DEFAULT_PATH
        );
        return new Yaml().loadAs(ConfigProvider.class.getResourceAsStream(s), Application.class);
    }

    public static String getVersion() {
        return getProperty(ConfigParameter.SIKONGSPHERE_VERSION);
    }

}

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
package org.sikongsphere.ifc.common.constant;

/**
 * Config Parameter Constant
 *
 * @author zaiyuan
 * @date 2022/09/15 19:52
 */
public class ConfigParameter {

    /**
     * Key
     */
    public final static String SIKONGSPHERE_CONFIG_PROPERTIES_PATH_KEY = "sikongsphere.config.path";
    public final static String SIKONGSPHERE_APPLICATION_CONFIG_PATH_KEY =
        "sikongsphere.application.config.path";
    public final static String IFC_MODEL_PATH_KEY = "sikongsphere.ifc.model.path";
    public final static String SIKONGSPHERE_VERSION = "sikongsphere.version";
    public final static String SIKONGSPHERE_ORGANIZATION = "sikongsphere.organization";
    public final static String SIKONGSPHERE_ARTIFACTID = "sikongsphere.artifactId";

    /**
     * Value
     */
    public final static String SIKONGSPHERE_CONFIG_PROPERTIES_DEFAULT_PATH =
        "/sikongsphere.properties";
    public final static String SIKONGSPHERE_APPLICATION_CONFIG_DEFAULT_PATH =
        "/sikongsphere-application.yml";
}

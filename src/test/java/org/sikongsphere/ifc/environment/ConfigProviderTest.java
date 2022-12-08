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
package org.sikongsphere.ifc.environment;

import org.junit.Test;
import org.sikongsphere.ifc.common.constant.ConfigParameter;
import org.sikongsphere.ifc.common.environment.ConfigProvider;
import org.sikongsphere.ifc.common.environment.entity.Application;
import org.yaml.snakeyaml.Yaml;

import java.io.FileReader;

public class ConfigProviderTest {

    @Test
    public void modelPathTest() {
        String property = ConfigProvider.getProperty(ConfigParameter.IFC_MODEL_PATH_KEY);
        assert property.equals("org.sikongsphere.ifc.newModel");
    }

    @Test
    public void applicationTest() {
        Application application = ConfigProvider.getApplication();
        assert application.getFullName().equals("sikongsphere-ifctools");
    }
}

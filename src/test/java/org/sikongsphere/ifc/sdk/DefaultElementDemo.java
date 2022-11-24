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
package org.sikongsphere.ifc.sdk;

import org.sikongsphere.ifc.model.core.kernel.entity.IfcProject;
import org.sikongsphere.ifc.sdk.factory.IfcProjectFactory;

public class DefaultElementDemo {
    public static void main(String[] args) {
        IfcProjectFactory projectFactory = new IfcProjectFactory();
        IfcProject project = projectFactory.createArchitectTemplateProject(
            "small building",
            "design"
        );
        System.out.println();
    }
}

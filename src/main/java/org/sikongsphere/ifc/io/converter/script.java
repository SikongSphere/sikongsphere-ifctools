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
package org.sikongsphere.ifc.io.converter;

import org.sikongsphere.ifc.infra.IfcClassContainer;
import org.sikongsphere.ifc.infra.IfcClassFactory;
import org.sikongsphere.ifc.model.IfcInterface;
import org.sikongsphere.ifc.model.datatype.STRING;
import org.sikongsphere.ifc.model.schema.resource.actor.entity.IfcPerson;

import java.util.ArrayList;

/**
 * @author:stan
 * @date:2023/3/18 14:23
 */
public class script {
    public static void main(String[] args) {
        IfcClassContainer instance = IfcClassContainer.getInstance();
        Class<?> ifcPerson = instance.get("IfcPerson".toUpperCase());
        System.out.println();
    }
}

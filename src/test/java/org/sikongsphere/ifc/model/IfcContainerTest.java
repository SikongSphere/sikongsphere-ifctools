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
package org.sikongsphere.ifc.model;

import org.junit.Test;
import org.sikongsphere.ifc.model.basic.STRING;
import org.sikongsphere.ifc.model.infra.IfcClassContainer;
import org.sikongsphere.ifc.model.infra.IfcInstanceFactory;
import org.sikongsphere.ifc.model.resource.actor.enumeration.IfcRoleEnum;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcText;

public class IfcContainerTest {

    @Test
    public void demo() {
        IfcClassContainer instance = IfcClassContainer.getInstance();
        assert instance != null;
    }

    @Test
    public void factoryTest() {
        IfcLabel a = new IfcLabel("a");
        IfcText b = new IfcText("b");
        Object[] o = { IfcRoleEnum.ARCHITECT, a, b };
        IfcNode instance = IfcInstanceFactory.getIfcInstance("IFCACTORROLE", o);
        assert instance != null;
    }

    @Test
    public void classCastTest() {
        STRING a = new STRING("a");
        STRING b = new STRING("b");
        Object[] o = { IfcRoleEnum.ARCHITECT, a, b };
        IfcNode instance = IfcInstanceFactory.getIfcInstance("IFCACTORROLE", o);
        assert instance != null;
    }

}

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
import org.sikongsphere.ifc.newModel.datatype.DOUBLE;
import org.sikongsphere.ifc.newModel.datatype.LIST;
import org.sikongsphere.ifc.newModel.datatype.SET;
import org.sikongsphere.ifc.newModel.datatype.STRING;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class IfcStepElementToStringTest {

    @Test
    public void testSet() {
        SET<Object> set = new SET<>();
        set.add("0");
        set.add("1");
        String s = set.toString();
        System.out.println(s);
    }

    @Test
    public void testList() {
        LIST<Object> list = new LIST<>();
        list.add(new DOUBLE(0.0));
        list.add(new DOUBLE(0.0));
        System.out.println(list.toString());
    }
}

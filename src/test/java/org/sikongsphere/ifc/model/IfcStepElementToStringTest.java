package org.sikongsphere.ifc.model;

import org.junit.Test;
import org.sikongsphere.ifc.newModel.datatype.LIST;
import org.sikongsphere.ifc.newModel.datatype.SET;
import org.sikongsphere.ifc.newModel.datatype.STRING;

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
        list.add(new STRING("user"));
        list.add(new STRING("passwd"));
        System.out.println(list);
    }
}

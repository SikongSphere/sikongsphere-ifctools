package org.sikongsphere.ifc.model;

import org.junit.Test;
import org.sikongsphere.ifc.model.basic.LIST;
import org.sikongsphere.ifc.model.basic.SET;

public class IfcStepElementToStringTest {

    @Test
    public void testList() {
        LIST<Object> list = new LIST<>();
        list.add("0.");
        list.add("1.");
        String s = list.toString();
        System.out.println(s);
    }

    @Test
    public void testSet() {
        SET<Object> set = new SET<>();
        set.add("0");
        set.add("1");
        String s = set.toString();
        System.out.println(s);
    }
}

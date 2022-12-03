package org.sikongsphere.ifc.model;

import org.junit.Test;
import org.sikongsphere.ifc.model.basic.LIST;

public class IfcStepElementToStringTest {

    @Test
    public void testList() {
        LIST<Object> list = new LIST<>();
        list.add("0.");
        list.add("1.");
        String s = list.toString();
        System.out.println(s);
    }
}

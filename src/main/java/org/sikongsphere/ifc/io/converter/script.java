package org.sikongsphere.ifc.io.converter;

import org.sikongsphere.ifc.infra.IfcClassFactory;
import org.sikongsphere.ifc.model.IfcInterface;
import org.sikongsphere.ifc.model.datatype.STRING;

import java.util.ArrayList;

/**
 * @author:stan
 * @date:2023/3/18 14:23
 */
public class script {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(null);
        list.add(new STRING("unknown"));
        list.add(new STRING("user"));
        list.add(null);
        list.add(null);
        list.add(null);
        list.add(null);
        list.add(null);

        IfcInterface ifcPerson = IfcClassFactory.getIfcClass(
                "IfcPerson",
                list.toArray()
        );
        System.out.println(ifcPerson);
    }
}

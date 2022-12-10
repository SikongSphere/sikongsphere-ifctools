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
import org.sikongsphere.ifc.model.datatype.DOUBLE;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.datatype.SCIENTIFICNOTATION;
import org.sikongsphere.ifc.model.datatype.STRING;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcNormalisedRatioMeasure;

public class IfcStepElementToStringTest {

    @Test
    public void testList() {
        LIST<Object> list = new LIST<>();
        list.add(new DOUBLE(0.0));
        list.add(new DOUBLE(0.0));
        System.out.println(list.toString());
    }

    @Test
    public void testIfcNormalisedRatioMeasure() {
        boolean assignableFrom = IfcDataType.class.isAssignableFrom(
            IfcNormalisedRatioMeasure.class
        );
        System.out.println(assignableFrom);
    }

    @Test
    public void testSCI() {
        SCIENTIFICNOTATION scientificnotation = new SCIENTIFICNOTATION(new STRING("1.0E-5"));
        System.out.println(scientificnotation);
    }
}

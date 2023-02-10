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
package org.sikongsphere.ifc.io.constant;

import org.sikongsphere.ifc.model.schema.resource.measure.enumeration.IfcSIUnitName;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author:stan
 * @date:2023/2/5 18:34
 */
public class UnitConstant {

    private static HashMap<String, List<Integer>> setDimensionalExponents() {
        HashMap<String, List<Integer>> dimensionalExponents = new HashMap<>();
        dimensionalExponents.put(IfcSIUnitName.METRE.name(), Arrays.asList(1, 0, 0, 0, 0, 0, 0));
        dimensionalExponents.put(IfcSIUnitName.RADIAN.name(), Arrays.asList(0, 0, 0, 0, 0, 0, 0));
        dimensionalExponents.put(IfcSIUnitName.SECOND.name(), Arrays.asList(0, 0, 1, 0, 0, 0, 0));

        return dimensionalExponents;
    }

    public static final HashMap<String, List<Integer>> DIMENSIONALEXPONENTS =
        setDimensionalExponents();
}

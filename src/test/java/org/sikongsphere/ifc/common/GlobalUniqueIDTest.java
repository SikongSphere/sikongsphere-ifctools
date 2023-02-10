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
package org.sikongsphere.ifc.common;

import org.junit.Test;
import org.sikongsphere.ifc.common.algorithm.GlobalUniqueID;

/**
 * @author:stan
 * @date:2023/2/5 16:18
 */
public class GlobalUniqueIDTest {

    public final String globalId = "2cYUBSBOPCzu_HAZrdO7uv";
    public final String hexString = "a689e2dc-2d86-4cf7-8f91-2a3d67607e39";

    @Test
    public void guidTest() {
        String split = GlobalUniqueID.split(GlobalUniqueID.expand(globalId));
        assert split.equals(hexString);
    }
}

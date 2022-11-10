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
package org.sikongsphere.ifc.sdk.factory;

import org.sikongsphere.ifc.model.shared.sharedbldelements.entity.IfcWall;
import org.sikongsphere.ifc.model.shared.sharedbldelements.entity.IfcWallStandardCase;
import org.sikongsphere.ifc.sdk.order.IOrder;

/**
 * This is an factory for IfcWall
 *
 * @Author: zaiyuan
 * @Date: 2022/11/09 11:47
 */
public class IfcWallFactory implements IFactory<IfcWall> {

    /**
     * create general wall
     * @param order order
     * @return  IfcWall instance
     */
    @Override
    public IfcWall create(IOrder<IfcWall> order) {
        return null;
    }

    /**
     * create standard wall
     * @param order order
     * @return  IfcWallStandardCase
     */
    public IfcWallStandardCase createStandardWall(IOrder<IfcWall> order) {
        return null;
    }
}

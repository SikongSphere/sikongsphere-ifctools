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
package org.sikongsphere.ifc.sdk;

import org.sikongsphere.ifc.model.IfcModel;
import org.sikongsphere.ifc.model.shared.sharedbldelements.entity.IfcWall;
import org.sikongsphere.ifc.sdk.factory.IfcWallFactory;
import org.sikongsphere.ifc.sdk.order.IfcWallOrder;
import org.sikongsphere.ifc.sdk.worker.IfcWallWorker;

/**
 * This is a demo for sdk design
 *
 * @Author: zaiyuan
 * @Date: 2022/11/09 11:47
 */
public class SDKDemo {
    public static void main(String[] args) {
        IfcModel model = new IfcModel();
        IfcWallOrder wallOrder = new IfcWallOrder();
        IfcWallFactory wallFactory = new IfcWallFactory();
        IfcWall ifcWall = wallFactory.create(wallOrder);

        IfcWallWorker wallWorker = new IfcWallWorker();
        wallWorker.install(model, ifcWall);
        model.build();
    }
}

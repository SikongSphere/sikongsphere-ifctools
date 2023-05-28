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

import org.junit.Test;
import org.sikongsphere.ifc.model.schema.resource.actor.entity.IfcPerson;
import org.sikongsphere.ifc.model.schema.shared.building.entity.IfcDoor;
import org.sikongsphere.ifc.model.schema.shared.building.entity.IfcWall;
import org.sikongsphere.ifc.model.schema.shared.building.entity.IfcWindow;
import org.sikongsphere.ifc.sdk.create.factory.IfcDoorFactory;
import org.sikongsphere.ifc.sdk.create.factory.IfcWallFactory;
import org.sikongsphere.ifc.sdk.create.factory.IfcWindowFactory;
import org.sikongsphere.ifc.sdk.create.order.IfcDoorOrder;
import org.sikongsphere.ifc.sdk.create.order.IfcWallOrder;
import org.sikongsphere.ifc.sdk.create.order.IfcWindowOrder;

import java.util.UUID;

/**
 * This is a demo for sdk design
 *
 * @Author: zaiyuan
 * @Date: 2022/11/09 11:47
 */
public class SDKDemo {
    // public static void main(String[] args) {
    // IfcModel model = new IfcModel();
    // IfcWallOrder wallOrder = new IfcWallOrder();
    // IfcWallFactory wallFactory = new IfcWallFactory();
    // IfcWall ifcWall = wallFactory.create(wallOrder);
    //
    // IfcWallWorker wallWorker = new IfcWallWorker();
    // wallWorker.install(model, ifcWall);
    // model.build();
    // }

    @Test
    public void createWall() {
        IfcWallOrder wallOrder = new IfcWallOrder();
        wallOrder.setGlobalId(UUID.randomUUID().toString());
        wallOrder.setName("niubility wall");
        wallOrder.setDescription("gang gang di");
        wallOrder.setObjectType("steel wall");

        IfcWallFactory wallFactory = new IfcWallFactory();
        IfcWall ifcWall = wallFactory.create(wallOrder);
        IfcPerson thePerson = ifcWall.getOwnerHistory().getLastModifyingUser().getThePerson();

        assert ifcWall.getName().value.equals("niubility wall");
        assert thePerson.getFamilyName().value.equals("Ma");
        assert thePerson.getMiddleName().get(0).value.equals("Da");
        assert thePerson.getGivenName().value.equals("Shuai");
    }

    @Test
    public void createDoor() {
        IfcDoorOrder doorlOrder = new IfcDoorOrder();
        doorlOrder.setGlobalId(UUID.randomUUID().toString());
        doorlOrder.setName("default door");
        doorlOrder.setDescription("一扇平平无奇的门");
        doorlOrder.setObjectType("ifc door");

        IfcDoorFactory doorFactory = new IfcDoorFactory();
        IfcDoor ifcDoor = doorFactory.create(doorlOrder);
        IfcPerson thePerson = ifcDoor.getOwnerHistory().getLastModifyingUser().getThePerson();

        assert ifcDoor.getName().value.equals("default door");
        assert thePerson.getFamilyName().value.equals("Ma");
        assert thePerson.getMiddleName().get(0).value.equals("Da");
        assert thePerson.getGivenName().value.equals("Shuai");
    }

    @Test
    public void createWindow() {
        IfcWindowOrder windowOrder = new IfcWindowOrder();
        windowOrder.setGlobalId(UUID.randomUUID().toString());
        windowOrder.setName("default window");
        windowOrder.setDescription("一扇平平无奇的窗");
        windowOrder.setObjectType("wooden window");
        windowOrder.setOverallHeight(1.5);
        windowOrder.setOverallWidth(0.9);
        IfcWindowFactory windowFactory = new IfcWindowFactory();
        IfcWindow ifcWindow = windowFactory.create(windowOrder);
        IfcPerson thePerson = ifcWindow.getOwnerHistory().getLastModifyingUser().getThePerson();

        assert ifcWindow.getName().value.equals("default window");
        assert thePerson.getFamilyName().value.equals("Ma");
        assert thePerson.getMiddleName().get(0).value.equals("Da");
        assert thePerson.getGivenName().value.equals("Shuai");
    }

}

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

import org.sikongsphere.ifc.model.IfcRoot;
import org.sikongsphere.ifc.model.core.kernel.entity.IfcProject;
import org.sikongsphere.ifc.model.core.productextension.entities.IfcBuilding;
import org.sikongsphere.ifc.model.core.productextension.entities.IfcBuildingStorey;
import org.sikongsphere.ifc.model.core.productextension.entities.IfcSite;
import org.sikongsphere.ifc.model.resource.actor.entity.IfcPostalAddress;
import org.sikongsphere.ifc.sdk.order.IOrder;

/**
 * This is an factory for Project
 *
 * @Author: zaiyuan
 * @Date: 2022/11/23 11:47
 */
public class IfcProjectFactory extends AbstractFactory<IfcRoot> {

    @Override
    public IfcRoot create(IOrder<IfcRoot> order) {
        return null;
    }

    public IfcPostalAddress createPostalAddress() {
        return new IfcPostalAddress();
    }

    public IfcProject createProject() {
        return new IfcProject();
    }

    public IfcSite createSite() {
        return new IfcSite();
    }

    public IfcBuilding createBuilding() {
        return new IfcBuilding();
    }

    public IfcBuildingStorey createBuildingStorey() {
        return new IfcBuildingStorey();
    }

}

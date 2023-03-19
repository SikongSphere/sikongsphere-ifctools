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
package org.sikongsphere.ifc.sdk.create;

import org.sikongsphere.ifc.model.schema.extension.product.entities.IfcBuilding;
import org.sikongsphere.ifc.sdk.create.factory.IFactory;
import org.sikongsphere.ifc.sdk.create.factory.IfcBuildingFactory;
import org.sikongsphere.ifc.sdk.create.order.IOrder;
import org.sikongsphere.ifc.sdk.create.worker.IWorker;

/**
 * Query Interface
 *
 * @author zaiyuan
 * @date 2023-03-15 20:44:00
 */
public class IfcModelCreator<IfcFileModel, E> extends AbstractCreator<IfcFileModel, E> {

    @Override
    public IOrder<E> newOrder(Class<E> elementClazz) {
        return null;
    }

    @Override
    public IFactory<E> newFactory(Class<E> elementClazz) {
        if (elementClazz == IfcBuilding.class) {
            return (IFactory) new IfcBuildingFactory();
        }
        return null;
    }

    @Override
    public IWorker<E> newWorker(Class<E> elementClazz) {
        return null;
    }
}

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
package org.sikongsphere.ifc.sdk.worker;

import org.sikongsphere.ifc.model.IfcModel;
import org.sikongsphere.ifc.model.core.kernel.entity.IfcProduct;

/**
 * This is an interface for order
 *
 * @Author: zaiyuan
 * @Date: 2022/11/09 11:47
 */
public interface IWorker<T extends IfcProduct> {
    void install(IfcModel model, T product);

    void install(IfcModel model, T product, Object... params);
}

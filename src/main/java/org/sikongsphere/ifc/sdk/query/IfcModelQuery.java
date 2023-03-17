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
package org.sikongsphere.ifc.sdk.query;

import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.fileelement.IfcFileModel;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Query Interface
 *
 * @author zaiyuan
 * @date 2023-03-15 20:44:00
 */
public class IfcModelQuery extends AbstractQuery<IfcFileModel> {

    @Override
    public List<IfcAbstractClass> filterByClass(IfcFileModel model, Class<?> clazz) {
        return model.getBody()
            .getElements()
            .values()
            .stream()
            .map(i -> match(i, clazz))
            .filter(Objects::nonNull)
            .collect(Collectors.toList());
    }

    public IfcAbstractClass match(IfcAbstractClass obj, Class<?> clazz) {
        if (obj.getClass() == clazz) {
            return obj;
        } else {
            return null;
        }
    }
}

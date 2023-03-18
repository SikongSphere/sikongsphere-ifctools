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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
        List<IfcAbstractClass> result = new ArrayList<>();
        for (IfcAbstractClass value : model.getBody().getElements().values()) {
            if (value.getClass() == clazz) {
                result.add(value);
            }
        }
        return result;
    }

    /**
     * filter equal step number
     *
     * @param model   Ifc model
     * @param stepNum step number
     * @return IfcAbstractClass
     */
    public IfcAbstractClass filterEqualStepNum(IfcFileModel model, Integer stepNum) {
        return model.getBody().getElements().get(stepNum);
    }

    /**
     * filter less than step number
     *
     * @param model   ifc model
     * @param stepNum step number
     * @return IfcAbstractClass List
     */
    public List<IfcAbstractClass> filterLessThanStepNum(IfcFileModel model, Integer stepNum) {
        List<IfcAbstractClass> result = new ArrayList<>();
        for (IfcAbstractClass value : model.getBody().getElements().values()) {
            if (value.getStepNumber() < stepNum) {
                result.add(value);
            }
        }
        return result;
    }

    /**
     * filter less than step number
     *
     * @param model   ifc model
     * @param stepNum step number
     * @return IfcAbstractClass List
     */
    public List<IfcAbstractClass> filterGreaterThanStepNum(IfcFileModel model, Integer stepNum) {
        List<IfcAbstractClass> result = new ArrayList<>();
        for (IfcAbstractClass value : model.getBody().getElements().values()) {
            if (value.getStepNumber() > stepNum) {
                result.add(value);
            }
        }
        return result;
    }
}

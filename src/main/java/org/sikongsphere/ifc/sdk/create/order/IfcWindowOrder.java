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
package org.sikongsphere.ifc.sdk.create.order;

import org.sikongsphere.ifc.model.schema.shared.building.entity.IfcWindow;

/**
 * This is an order for window
 *
 * @author Wang Bohong
 * @Date 2023/05/25
 */
public class IfcWindowOrder extends AbstractOrder<IfcWindow> {
    private String globalId;
    private String name;
    private String description;
    private String objectType;
    private String tag;
    private double overallHeight;
    private double overallWidth;

    public String getGlobalId() {
        return globalId;
    }

    public void setGlobalId(String globalId) {
        this.globalId = globalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public double getOverallHeight() {
        return overallHeight;
    }

    public void setOverallHeight(double overallHeight) {
        this.overallHeight = overallHeight;
    }

    public double getOverallWidth() {
        return overallWidth;
    }

    public void setOverallWidth(double overallWidth) {
        this.overallWidth = overallWidth;
    }
}

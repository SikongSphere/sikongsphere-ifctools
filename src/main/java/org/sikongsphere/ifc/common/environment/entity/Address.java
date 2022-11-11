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
package org.sikongsphere.ifc.common.environment.entity;

/**
 * Config Address Entity
 *
 * @author zaiyuan
 * @date 2022/11/11 19:52
 */
public class Address {
    private String purpose;
    private String description;
    private String userDefinedPurpose;

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUserDefinedPurpose() {
        return userDefinedPurpose;
    }

    public void setUserDefinedPurpose(String userDefinedPurpose) {
        this.userDefinedPurpose = userDefinedPurpose;
    }
}

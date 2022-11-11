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
 * Config Role Entity
 *
 * @author zaiyuan
 * @date 2022/11/11 19:52
 */
public class Role {
    private String roleEnum;
    private String userDefinedRole;
    private String description;

    public String getRoleEnum() {
        return roleEnum;
    }

    public void setRoleEnum(String roleEnum) {
        this.roleEnum = roleEnum;
    }

    public String getUserDefinedRole() {
        return userDefinedRole;
    }

    public void setUserDefinedRole(String userDefinedRole) {
        this.userDefinedRole = userDefinedRole;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

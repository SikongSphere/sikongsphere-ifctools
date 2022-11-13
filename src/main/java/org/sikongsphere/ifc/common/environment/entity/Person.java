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
 * Config Person Entity
 *
 * @author zaiyuan
 * @date 2022/11/11 19:52
 */
public class Person {
    private String familyName;
    private String givenName;
    private String[] middleName;
    private String[] prefixTitles;
    private String[] suffixTitles;

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String[] getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String[] middleName) {
        this.middleName = middleName;
    }

    public String[] getPrefixTitles() {
        return prefixTitles;
    }

    public void setPrefixTitles(String[] prefixTitles) {
        this.prefixTitles = prefixTitles;
    }

    public String[] getSuffixTitles() {
        return suffixTitles;
    }

    public void setSuffixTitles(String[] suffixTitles) {
        this.suffixTitles = suffixTitles;
    }
}

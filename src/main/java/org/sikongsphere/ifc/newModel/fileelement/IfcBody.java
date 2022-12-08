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
package org.sikongsphere.ifc.newModel.fileelement;

import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.newModel.IfcAbstractClass;
import org.sikongsphere.ifc.newModel.IfcFileElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * This class is used to encapsulate data information
 *
 * @author zaiyuan
 * @date 2022-08-13 11:44:00
 */
public class IfcBody extends IfcFileElement {
    public Map<Integer, IfcAbstractClass> elements;

    public IfcBody(Map<Integer, IfcAbstractClass> elements) {
        this.elements = elements;
    }

    public Map<Integer, IfcAbstractClass> getElements() {
        return elements;
    }

    public void setElements(Map<Integer, IfcAbstractClass> elements) {
        this.elements = elements;
    }

    /**
     * used to make up IFC Body with elements:Map
     */
    protected String mkIfcBody() {
        StringBuilder builder = new StringBuilder();

        this.elements.forEach((key, value) -> {
            builder.append(value.toIfc());
            builder.append(StringConstant.NEW_LINE);
        });
        return builder.toString();
    }

    @Override
    public String toString() {
        String ifcBody = "DATA;"
            + StringConstant.NEW_LINE
            + mkIfcBody()
            + StringConstant.END_TAG
            + StringConstant.COLON;

        return ifcBody;
    }
}

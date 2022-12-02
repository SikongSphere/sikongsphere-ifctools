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
package org.sikongsphere.ifc.newModel.schema;

import org.sikongsphere.ifc.newModel.IfcAbstractClass;
import org.sikongsphere.ifc.newModel.IfcInterface;

import java.util.List;

/**
 * This class is used to encapsulate a list of IfcNode
 *
 * @author zaiyuan
 * @date 2022-08-13 11:44:00
 */
public class IfcNodeList extends IfcAbstractClass {

    private List<IfcInterface> elements;

    public IfcNodeList(List<IfcInterface> elements) {
        this.elements = elements;
    }

}

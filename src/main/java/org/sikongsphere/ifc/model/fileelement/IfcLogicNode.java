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
package org.sikongsphere.ifc.model.fileelement;

import org.sikongsphere.ifc.model.IfcAbstractClass;

import java.util.ArrayList;
import java.util.List;

/**
 * This is an empty Ifc Node
 *
 * @author zaiyuan
 * @date 2022-08-13 11:44:00
 */
public class IfcLogicNode extends IfcAbstractClass {

    private String ifcClassName;

    private List<Object> args = new ArrayList<>();

    public IfcLogicNode() {}

    public IfcLogicNode(int stepNumber) {
        super(stepNumber);
    }

    public IfcLogicNode(List<Object> args) {
        super(0);
        this.args = args;
    }

    public IfcLogicNode(String ifcClassName, List<Object> args) {
        super(0);
        this.ifcClassName = ifcClassName;
        this.args = args;
    }

    public List<Object> getArgs() {
        return args;
    }

    public void setArgs(List<Object> args) {
        this.args = args;
    }

    public void addArg(Object arg) {
        args.add(arg);
    }

    public String getIfcClassName() {
        return ifcClassName;
    }

    public void setIfcClassName(String ifcClassName) {
        this.ifcClassName = ifcClassName;
    }
}

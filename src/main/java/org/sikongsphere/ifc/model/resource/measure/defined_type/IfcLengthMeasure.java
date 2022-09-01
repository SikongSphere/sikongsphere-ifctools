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
package org.sikongsphere.ifc.model.resource.measure.defined_type;

/**
 * A length measure is the value of a distance.
 * @author Wang Bohong
 * @date 2022/9/1 16:04
 */
public class IfcLengthMeasure {
    private IfcLogical logic;

    // ToDo It's not quite clear here
    {
        logic.setValue(true);
    }

    public IfcLengthMeasure() {}

    public IfcLengthMeasure(IfcLogical logic) {
        this.logic = logic;
    }

    public IfcLogical getLogic() {
        return logic;
    }

    public void setLogic(IfcLogical logic) {
        this.logic = logic;
    }
}

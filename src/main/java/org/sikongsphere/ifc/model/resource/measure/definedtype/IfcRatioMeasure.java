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
package org.sikongsphere.ifc.model.resource.measure.definedtype;

import org.sikongsphere.ifc.model.IfcNonLeafNode;

/**
 * A ratio measure is the value of the relation between two physical quantities that are of the same kind.
 *
 * @author stan
 * @date 2022/09/01 23:45
 */
public class IfcRatioMeasure {
    private Boolean ratioMeasure;// todo -> REAL

    public IfcRatioMeasure() {}

    public IfcRatioMeasure(Boolean ratioMeasure) {
        this.ratioMeasure = ratioMeasure;
    }

    public Boolean getRatioMeasure() {
        return ratioMeasure;
    }

    public void setRatioMeasure(Boolean ratioMeasure) {
        this.ratioMeasure = ratioMeasure;
    }
}

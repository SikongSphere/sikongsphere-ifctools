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

import org.sikongsphere.ifc.model.basic.STRING;

/**
 * A descriptive measure is a human interpretable definition of a quantifiable value.
 *
 * @author stan
 * @date 2022/09/01 23:46
 */
public class IfcDescriptiveMeasure {
    private STRING descriptiveMeasure;

    public IfcDescriptiveMeasure() {
    }

    public IfcDescriptiveMeasure(STRING descriptiveMeasure) {
        this.descriptiveMeasure = descriptiveMeasure;
    }

    public STRING getDescriptiveMeasure() {
        return descriptiveMeasure;
    }

    public void setDescriptiveMeasure(STRING descriptiveMeasure) {
        this.descriptiveMeasure = descriptiveMeasure;
    }
}

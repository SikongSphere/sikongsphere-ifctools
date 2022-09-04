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
package org.sikongsphere.ifc.model.core.kernel.entity;

import org.sikongsphere.ifc.model.basic.SET;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.model.resource.measure.entity.IfcUnitAssignment;
import org.sikongsphere.ifc.model.resource.representation.entity.IfcRepresentationContext;

/**
 * The undertaking of some design, engineering,
 * construction, or maintenance activities leading towards a product.
 * The project establishes the context for information to be exchanged or shared,
 * and it may represent a construction project but does not have to.
 *
 * @author stan
 * @date 2022/09/01 22:56
 */
public class IfcProject extends IfcObject {
    private IfcLabel longName;
    private IfcLabel phase;
    private SET<IfcRepresentationContext> representationContexts;
    private IfcUnitAssignment unitsInContext;

    public IfcProject() {}

    public IfcProject(
        IfcLabel longName,
        IfcLabel phase,
        SET<IfcRepresentationContext> representationContexts,
        IfcUnitAssignment unitsInContext
    ) {
        this.longName = longName;
        this.phase = phase;
        this.representationContexts = representationContexts;
        this.unitsInContext = unitsInContext;
    }

    public IfcLabel getLongName() {
        return longName;
    }

    public void setLongName(IfcLabel longName) {
        this.longName = longName;
    }

    public IfcLabel getPhase() {
        return phase;
    }

    public void setPhase(IfcLabel phase) {
        this.phase = phase;
    }

    public SET<IfcRepresentationContext> getRepresentationContexts() {
        return representationContexts;
    }

    public void setRepresentationContexts(SET<IfcRepresentationContext> representationContexts) {
        this.representationContexts = representationContexts;
    }

    public IfcUnitAssignment getUnitsInContext() {
        return unitsInContext;
    }

    public void setUnitsInContext(IfcUnitAssignment unitsInContext) {
        this.unitsInContext = unitsInContext;
    }
}

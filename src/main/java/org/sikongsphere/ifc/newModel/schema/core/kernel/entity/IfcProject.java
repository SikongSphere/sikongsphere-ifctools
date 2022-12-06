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
package org.sikongsphere.ifc.newModel.schema.core.kernel.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.datatype.LIST;
import org.sikongsphere.ifc.newModel.datatype.SET;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedtype.IfcText;
import org.sikongsphere.ifc.newModel.schema.resource.measure.entity.IfcUnitAssignment;
import org.sikongsphere.ifc.newModel.schema.resource.representation.entity.IfcRepresentationContext;
import org.sikongsphere.ifc.newModel.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.newModel.schema.resource.utility.entity.IfcOwnerHistory;

import java.util.*;

/**
 * The undertaking of some design, engineering,
 * construction, or maintenance activities leading towards a product.
 * The project establishes the context for information to be exchanged or shared,
 * and it may represent a construction project but does not have to.
 *
 * @author stan
 * @date 2022/09/01 22:56
 */

@IfcClass(layer = IfcLayer.CORE, type = IfcType.ENTITY)
public class IfcProject extends IfcObject {
    private IfcLabel longName;
    private IfcLabel phase;
    private SET<IfcRepresentationContext> representationContexts = new SET<>();
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

    @IfcParserConstructor
    public IfcProject(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcLabel longName,
        IfcLabel phase,
        SET<IfcRepresentationContext> representationContexts,
        IfcUnitAssignment unitsInContext
    ) {
        super(globalId, ownerHistory, name, description, objectType);
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

    public void addRepresentationContext(IfcRepresentationContext representationContext) {
        representationContexts.add(representationContext);
    }

    public IfcUnitAssignment getUnitsInContext() {
        return unitsInContext;
    }

    public void setUnitsInContext(IfcUnitAssignment unitsInContext) {
        this.unitsInContext = unitsInContext;
    }

    @Override
    public String toString() {

        Iterator<IfcRepresentationContext> iterator = this.representationContexts.getObjects().iterator();
        ArrayList<Integer> list = new ArrayList<>();

        while (iterator.hasNext()){
            IfcRepresentationContext element = iterator.next();
            list.add(element.getStepNumber());
        }

        list.sort(Comparator.comparingInt(x -> x));
        LIST<String> strings = new LIST<>();

        list.forEach(x -> strings.add(StringConstant.WELL + x));

        String format = String.format("#%s=%s(%s,#%s,%s,%s,%s,%s,%s,%s,#%s);",
                this.stepNumber,
                this.getClass().getSimpleName().toUpperCase(Locale.ROOT),
                getGlobalId(),
                getOwnerHistory().getStepNumber(),
                getName(),
                Optional.ofNullable(getDescription()).map(x -> getDescription().toString()).orElse(StringConstant.DOLLAR),
                Optional.ofNullable(getObjectType()).map(x -> getObjectType().toString()).orElse(StringConstant.DOLLAR),
                Optional.ofNullable(getLongName()).map(x -> getLongName().toString()).orElse(StringConstant.DOLLAR),
                Optional.ofNullable(getPhase()).map(x -> getPhase().toString()).orElse(StringConstant.DOLLAR),
                strings,
                getUnitsInContext().getStepNumber()
        );

        return format;
    }
}

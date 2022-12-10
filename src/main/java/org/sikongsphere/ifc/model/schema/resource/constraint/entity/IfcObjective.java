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
package org.sikongsphere.ifc.model.schema.resource.constraint.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.resource.actor.selectType.IfcActorSelect;
import org.sikongsphere.ifc.model.schema.resource.constraint.enumeration.IfcConstraintEnum;
import org.sikongsphere.ifc.model.schema.resource.constraint.enumeration.IfcObjectiveEnum;
import org.sikongsphere.ifc.model.schema.resource.datetime.selectType.IfcDateTimeSelect;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;

/**
 * @author zaiyuan
 * @date 2022/12/10 21:15
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcObjective extends IfcConstraint {
    @IfcOptionField
    private IfcMetric benchmarkValues;
    private IfcMetric resultValues;
    @IfcOptionField
    private IfcObjectiveEnum objectiveQualifier;
    @IfcOptionField
    private IfcLabel userDefinedQualifier;

    @IfcParserConstructor
    public IfcObjective(
        IfcLabel name,
        IfcText description,
        IfcConstraintEnum constraintGrade,
        IfcLabel constraintSource,
        IfcActorSelect creatingActor,
        IfcDateTimeSelect creationTime,
        IfcLabel userDefinedGrade,
        IfcMetric benchmarkValues,
        IfcMetric resultValues,
        IfcObjectiveEnum objectiveQualifier,
        IfcLabel userDefinedQualifier
    ) {
        super(
            name,
            description,
            constraintGrade,
            constraintSource,
            creatingActor,
            creationTime,
            userDefinedGrade
        );
        this.benchmarkValues = benchmarkValues;
        this.resultValues = resultValues;
        this.objectiveQualifier = objectiveQualifier;
        this.userDefinedQualifier = userDefinedQualifier;
    }

    public IfcMetric getBenchmarkValues() {
        return benchmarkValues;
    }

    public void setBenchmarkValues(IfcMetric benchmarkValues) {
        this.benchmarkValues = benchmarkValues;
    }

    public IfcMetric getResultValues() {
        return resultValues;
    }

    public void setResultValues(IfcMetric resultValues) {
        this.resultValues = resultValues;
    }

    public IfcObjectiveEnum getObjectiveQualifier() {
        return objectiveQualifier;
    }

    public void setObjectiveQualifier(IfcObjectiveEnum objectiveQualifier) {
        this.objectiveQualifier = objectiveQualifier;
    }

    public IfcLabel getUserDefinedQualifier() {
        return userDefinedQualifier;
    }

    public void setUserDefinedQualifier(IfcLabel userDefinedQualifier) {
        this.userDefinedQualifier = userDefinedQualifier;
    }

    @Override
    public boolean illegal() {
        // TODO
        return super.illegal();
    }
}

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
import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.actor.selectType.IfcActorSelect;
import org.sikongsphere.ifc.model.schema.resource.constraint.enumeration.IfcConstraintEnum;
import org.sikongsphere.ifc.model.schema.resource.datetime.selectType.IfcDateTimeSelect;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;

/**
 * @author zaiyuan
 * @date 2022/12/10 21:15
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public abstract class IfcConstraint extends IfcAbstractClass {
    private IfcLabel name;
    @IfcOptionField
    private IfcText description;
    private IfcConstraintEnum constraintGrade;
    @IfcOptionField
    private IfcLabel constraintSource;
    @IfcOptionField
    private IfcActorSelect creatingActor;
    @IfcOptionField
    private IfcDateTimeSelect creationTime;
    @IfcOptionField
    private IfcLabel userDefinedGrade;

    @IfcInverseParameter
    private SET<IfcConstraintClassificationRelationship> classifiedAs;
    @IfcInverseParameter
    private SET<IfcConstraintRelationship> relatesConstraints;
    @IfcInverseParameter
    private SET<IfcConstraintRelationship> isRelatedWith;
    @IfcInverseParameter
    private SET<IfcPropertyConstraintRelationship> propertiesForConstraint;
    @IfcInverseParameter
    private SET<IfcConstraintAggregationRelationship> aggregates;
    @IfcInverseParameter
    private SET<IfcConstraintAggregationRelationship> isAggregatedIn;

    @IfcParserConstructor
    public IfcConstraint(
        IfcLabel name,
        IfcText description,
        IfcConstraintEnum constraintGrade,
        IfcLabel constraintSource,
        IfcActorSelect creatingActor,
        IfcDateTimeSelect creationTime,
        IfcLabel userDefinedGrade
    ) {
        this.name = name;
        this.description = description;
        this.constraintGrade = constraintGrade;
        this.constraintSource = constraintSource;
        this.creatingActor = creatingActor;
        this.creationTime = creationTime;
        this.userDefinedGrade = userDefinedGrade;
    }

    public IfcLabel getName() {
        return name;
    }

    public void setName(IfcLabel name) {
        this.name = name;
    }

    public IfcText getDescription() {
        return description;
    }

    public void setDescription(IfcText description) {
        this.description = description;
    }

    public IfcConstraintEnum getConstraintGrade() {
        return constraintGrade;
    }

    public void setConstraintGrade(IfcConstraintEnum constraintGrade) {
        this.constraintGrade = constraintGrade;
    }

    public IfcLabel getConstraintSource() {
        return constraintSource;
    }

    public void setConstraintSource(IfcLabel constraintSource) {
        this.constraintSource = constraintSource;
    }

    public IfcActorSelect getCreatingActor() {
        return creatingActor;
    }

    public void setCreatingActor(IfcActorSelect creatingActor) {
        this.creatingActor = creatingActor;
    }

    public IfcDateTimeSelect getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(IfcDateTimeSelect creationTime) {
        this.creationTime = creationTime;
    }

    public IfcLabel getUserDefinedGrade() {
        return userDefinedGrade;
    }

    public void setUserDefinedGrade(IfcLabel userDefinedGrade) {
        this.userDefinedGrade = userDefinedGrade;
    }

    public SET<IfcConstraintClassificationRelationship> getClassifiedAs() {
        return classifiedAs;
    }

    public void setClassifiedAs(SET<IfcConstraintClassificationRelationship> classifiedAs) {
        this.classifiedAs = classifiedAs;
    }

    public SET<IfcConstraintRelationship> getRelatesConstraints() {
        return relatesConstraints;
    }

    public void setRelatesConstraints(SET<IfcConstraintRelationship> relatesConstraints) {
        this.relatesConstraints = relatesConstraints;
    }

    public SET<IfcConstraintRelationship> getIsRelatedWith() {
        return isRelatedWith;
    }

    public void setIsRelatedWith(SET<IfcConstraintRelationship> isRelatedWith) {
        this.isRelatedWith = isRelatedWith;
    }

    public SET<IfcPropertyConstraintRelationship> getPropertiesForConstraint() {
        return propertiesForConstraint;
    }

    public void setPropertiesForConstraint(
        SET<IfcPropertyConstraintRelationship> propertiesForConstraint
    ) {
        this.propertiesForConstraint = propertiesForConstraint;
    }

    public SET<IfcConstraintAggregationRelationship> getAggregates() {
        return aggregates;
    }

    public void setAggregates(SET<IfcConstraintAggregationRelationship> aggregates) {
        this.aggregates = aggregates;
    }

    public SET<IfcConstraintAggregationRelationship> getIsAggregatedIn() {
        return isAggregatedIn;
    }

    public void setIsAggregatedIn(SET<IfcConstraintAggregationRelationship> isAggregatedIn) {
        this.isAggregatedIn = isAggregatedIn;
    }

    @Override
    public boolean illegal() {
        // TODO
        return super.illegal();
    }
}

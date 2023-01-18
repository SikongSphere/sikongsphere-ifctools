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
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.schema.resource.actor.selectType.IfcActorSelect;
import org.sikongsphere.ifc.model.schema.resource.constraint.enumeration.IfcConstraintEnum;
import org.sikongsphere.ifc.model.schema.resource.constraint.enumeration.IfcLogicalOperatorEnum;
import org.sikongsphere.ifc.model.schema.resource.datetime.selectType.IfcDateTimeSelect;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;

/**
 * @author zaiyuan
 * @date 2022/12/10 21:15
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcConstraintAggregationRelationship extends IfcAbstractClass {
    @IfcOptionField
    private IfcLabel name;
    @IfcOptionField
    private IfcText description;
    private IfcConstraint relatingConstraint;
    private LIST<IfcConstraint> relatedConstraints;
    private IfcLogicalOperatorEnum logicalAggregator;

    @IfcParserConstructor
    public IfcConstraintAggregationRelationship(
        IfcLabel name,
        IfcText description,
        IfcConstraint relatingConstraint,
        LIST<IfcConstraint> relatedConstraints,
        IfcLogicalOperatorEnum logicalAggregator
    ) {
        this.name = name;
        this.description = description;
        this.relatingConstraint = relatingConstraint;
        this.relatedConstraints = relatedConstraints;
        this.logicalAggregator = logicalAggregator;
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

    public IfcConstraint getRelatingConstraint() {
        return relatingConstraint;
    }

    public void setRelatingConstraint(IfcConstraint relatingConstraint) {
        this.relatingConstraint = relatingConstraint;
    }

    public LIST<IfcConstraint> getRelatedConstraints() {
        return relatedConstraints;
    }

    public void setRelatedConstraints(LIST<IfcConstraint> relatedConstraints) {
        this.relatedConstraints = relatedConstraints;
    }

    public IfcLogicalOperatorEnum getLogicalAggregator() {
        return logicalAggregator;
    }

    public void setLogicalAggregator(IfcLogicalOperatorEnum logicalAggregator) {
        this.logicalAggregator = logicalAggregator;
    }

    @Override
    public boolean illegal() {
        // TODO
        return super.illegal();
    }
}

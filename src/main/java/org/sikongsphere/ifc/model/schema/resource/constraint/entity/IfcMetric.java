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
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.actor.selectType.IfcActorSelect;
import org.sikongsphere.ifc.model.schema.resource.constraint.enumeration.IfcBenchmarkEnum;
import org.sikongsphere.ifc.model.schema.resource.constraint.enumeration.IfcConstraintEnum;
import org.sikongsphere.ifc.model.schema.resource.constraint.selectType.IfcMetricValueSelect;
import org.sikongsphere.ifc.model.schema.resource.datetime.selectType.IfcDateTimeSelect;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;

/**
 * An IfcMetric is used to capture quantitative resultant metrics that can be applied to objectives.
 *
 * @author zaiyuan
 * @date 2022/12/10 21:15
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcMetric extends IfcConstraint {
    private IfcBenchmarkEnum benchmark;
    @IfcOptionField
    private IfcLabel valueSource;
    private IfcMetricValueSelect dataValue;

    @IfcParserConstructor
    public IfcMetric(
        IfcLabel name,
        IfcText description,
        IfcConstraintEnum constraintGrade,
        IfcLabel constraintSource,
        IfcActorSelect creatingActor,
        IfcDateTimeSelect creationTime,
        IfcLabel userDefinedGrade,
        IfcBenchmarkEnum benchmark,
        IfcLabel valueSource,
        IfcMetricValueSelect dataValue
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
        this.benchmark = benchmark;
        this.valueSource = valueSource;
        this.dataValue = dataValue;
    }

    public IfcBenchmarkEnum getBenchmark() {
        return benchmark;
    }

    public void setBenchmark(IfcBenchmarkEnum benchmark) {
        this.benchmark = benchmark;
    }

    public IfcLabel getValueSource() {
        return valueSource;
    }

    public void setValueSource(IfcLabel valueSource) {
        this.valueSource = valueSource;
    }

    public IfcMetricValueSelect getDataValue() {
        return dataValue;
    }

    public void setDataValue(IfcMetricValueSelect dataValue) {
        this.dataValue = dataValue;
    }
}

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
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.constraint.enumeration.IfcLogicalOperatorEnum;
import org.sikongsphere.ifc.model.schema.resource.externalreference.selectType.IfcClassificationNotationSelect;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;

/**
 * @author zaiyuan
 * @date 2022/12/10 21:15
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcConstraintClassificationRelationship extends IfcAbstractClass {
    private IfcConstraint classifiedConstraint;
    private SET<IfcClassificationNotationSelect> relatedClassifications;

    @IfcParserConstructor
    public IfcConstraintClassificationRelationship(
        IfcConstraint classifiedConstraint,
        SET<IfcClassificationNotationSelect> relatedClassifications
    ) {
        this.classifiedConstraint = classifiedConstraint;
        this.relatedClassifications = relatedClassifications;
    }

    public IfcConstraint getClassifiedConstraint() {
        return classifiedConstraint;
    }

    public void setClassifiedConstraint(IfcConstraint classifiedConstraint) {
        this.classifiedConstraint = classifiedConstraint;
    }

    public SET<IfcClassificationNotationSelect> getRelatedClassifications() {
        return relatedClassifications;
    }

    public void setRelatedClassifications(
        SET<IfcClassificationNotationSelect> relatedClassifications
    ) {
        this.relatedClassifications = relatedClassifications;
    }
}

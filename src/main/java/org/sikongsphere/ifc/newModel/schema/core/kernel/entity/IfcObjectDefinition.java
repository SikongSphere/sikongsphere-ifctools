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
import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.datatype.SET;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedtype.IfcText;
import org.sikongsphere.ifc.newModel.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.newModel.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * IfcObjectDefinition
 *
 * @author zaiyuan
 * @date 2022/8/31 21:15
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.CORE)
public abstract class IfcObjectDefinition extends IfcRoot {
    @IfcInverseParameter
    private SET<IfcRelAssigns> hasAssignments = new SET<>();
    @IfcInverseParameter
    private SET<IfcRelDecomposes> isDecomposedBy = new SET<>();
    @IfcInverseParameter
    private SET<IfcRelDecomposes> decomposes = new SET<>();
    @IfcInverseParameter
    private SET<IfcRelAssociates> hasAssociations = new SET<>();

    public IfcObjectDefinition() {}

    @IfcParserConstructor
    public IfcObjectDefinition(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description
    ) {
        super(globalId, ownerHistory, name, description);
    }

    public SET<IfcRelAssigns> getHasAssignments() {
        return hasAssignments;
    }

    public void setHasAssignments(SET<IfcRelAssigns> hasAssignments) {
        this.hasAssignments = hasAssignments;
    }

    public SET<IfcRelDecomposes> getIsDecomposedBy() {
        return isDecomposedBy;
    }

    public void setIsDecomposedBy(SET<IfcRelDecomposes> isDecomposedBy) {
        this.isDecomposedBy = isDecomposedBy;
    }

    public void addIsDecomposedBy(IfcRelDecomposes isDecomposedBy) {
        this.isDecomposedBy.add(isDecomposedBy);
    }

    public SET<IfcRelDecomposes> getDecomposes() {
        return decomposes;
    }

    public void setDecomposes(SET<IfcRelDecomposes> decomposes) {
        this.decomposes = decomposes;
    }

    public void addDecompose(IfcRelDecomposes decompose) {
        decomposes.add(decompose);
    }

    public SET<IfcRelAssociates> getHasAssociations() {
        return hasAssociations;
    }

    public void setHasAssociations(SET<IfcRelAssociates> hasAssociations) {
        this.hasAssociations = hasAssociations;
    }

    public void addHasAssociations(IfcRelAssociates hasAssociation) {
        this.hasAssociations.add(hasAssociation);
    }
}

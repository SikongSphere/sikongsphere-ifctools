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
package org.sikongsphere.ifc.model.schema.domain.structuralanalysis.entity;

import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.domain.structuralanalysis.enumeration.IfcAnalysisModelTypeEnum;
import org.sikongsphere.ifc.model.schema.extension.product.entities.IfcSystem;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcAxis2Placement3D;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author Yiwei
 * @date 2022/12/23
 */
public class IfcStructuralAnalysisModel extends IfcSystem {
    private IfcAnalysisModelTypeEnum predefinedType;
    @IfcOptionField
    private IfcAxis2Placement3D orientationOf2DPlane;
    @IfcOptionField
    private SET<IfcStructuralLoadGroup> loadedBy;
    @IfcOptionField
    private SET<IfcStructuralResultGroup> hasResults;

    @IfcParserConstructor
    public IfcStructuralAnalysisModel(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcAnalysisModelTypeEnum predefinedType,
        IfcAxis2Placement3D orientationOf2DPlane,
        SET<IfcStructuralLoadGroup> loadedBy,
        SET<IfcStructuralResultGroup> hasResults
    ) {
        super(globalId, ownerHistory, name, description, objectType);
        this.predefinedType = predefinedType;
        this.orientationOf2DPlane = orientationOf2DPlane;
        this.loadedBy = loadedBy;
        this.hasResults = hasResults;
    }

    public IfcAnalysisModelTypeEnum getPredefinedType() {
        return predefinedType;
    }

    public void setPredefinedType(IfcAnalysisModelTypeEnum predefinedType) {
        this.predefinedType = predefinedType;
    }

    public IfcAxis2Placement3D getOrientationOf2DPlane() {
        return orientationOf2DPlane;
    }

    public void setOrientationOf2DPlane(IfcAxis2Placement3D orientationOf2DPlane) {
        this.orientationOf2DPlane = orientationOf2DPlane;
    }

    public SET<IfcStructuralLoadGroup> getLoadedBy() {
        return loadedBy;
    }

    public void setLoadedBy(SET<IfcStructuralLoadGroup> loadedBy) {
        this.loadedBy = loadedBy;
    }

    public SET<IfcStructuralResultGroup> getHasResults() {
        return hasResults;
    }

    public void setHasResults(SET<IfcStructuralResultGroup> hasResults) {
        this.hasResults = hasResults;
    }
}

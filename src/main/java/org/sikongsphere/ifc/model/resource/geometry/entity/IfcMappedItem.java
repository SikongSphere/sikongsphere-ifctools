package org.sikongsphere.ifc.model.resource.geometry.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * @author zhongqi
 * @date 2022/11/1
 */

@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcMappedItem extends 	IfcRepresentationItem{
    private IfcRepresentationMap mappingSource;
    private IfcCartesianTransformationOperator mappingTarget;

    public IfcMappedItem() {
    }

    public IfcMappedItem(IfcRepresentationMap mappingSource, IfcCartesianTransformationOperator mappingTarget) {
        this.mappingSource = mappingSource;
        this.mappingTarget = mappingTarget;
    }

    public IfcRepresentationMap getMappingSource() {
        return mappingSource;
    }

    public void setMappingSource(IfcRepresentationMap mappingSource) {
        this.mappingSource = mappingSource;
    }

    public IfcCartesianTransformationOperator getMappingTarget() {
        return mappingTarget;
    }

    public void setMappingTarget(IfcCartesianTransformationOperator mappingTarget) {
        this.mappingTarget = mappingTarget;
    }
}

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

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.domain.plumbingfireprotection.enumeration.IfcFireSuppressionTerminalTypeEnum;
import org.sikongsphere.ifc.model.schema.domain.structuralanalysis.selectType.IfcOrientationSelect;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcPropertySetDefinition;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcRelAssociates;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcRoot;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcRepresentationMap;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.profileproperty.entity.IfcProfileProperties;
import org.sikongsphere.ifc.model.schema.resource.representation.entity.IfcShapeAspect;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;
import org.sikongsphere.ifc.model.schema.shared.sharedbldgservices.entity.IfcFlowTerminalType;

/**
 * @author yiwei
 * @date 2022/12/22 21:40
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENTITY)
public class IfcRelAssociatesProfileProperties extends IfcRelAssociates {
    private IfcProfileProperties relatingProfileProperties;
    @IfcOptionField
    private IfcShapeAspect profileSectionLocation;
    @IfcOptionField
    private IfcOrientationSelect profileOrientation;

    public IfcRelAssociatesProfileProperties(
        IfcProfileProperties relatingProfileProperties,
        IfcShapeAspect profileSectionLocation,
        IfcOrientationSelect profileOrientation
    ) {
        this.relatingProfileProperties = relatingProfileProperties;
        this.profileSectionLocation = profileSectionLocation;
        this.profileOrientation = profileOrientation;
    }

    public IfcRelAssociatesProfileProperties(
        SET<IfcRoot> relatedObjects,
        IfcProfileProperties relatingProfileProperties,
        IfcShapeAspect profileSectionLocation,
        IfcOrientationSelect profileOrientation
    ) {
        super(relatedObjects);
        this.relatingProfileProperties = relatingProfileProperties;
        this.profileSectionLocation = profileSectionLocation;
        this.profileOrientation = profileOrientation;
    }

    @IfcParserConstructor
    public IfcRelAssociatesProfileProperties(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        SET<IfcRoot> relatedObjects,
        IfcProfileProperties relatingProfileProperties,
        IfcShapeAspect profileSectionLocation,
        IfcOrientationSelect profileOrientation
    ) {
        super(globalId, ownerHistory, name, description, relatedObjects);
        this.relatingProfileProperties = relatingProfileProperties;
        this.profileSectionLocation = profileSectionLocation;
        this.profileOrientation = profileOrientation;
    }

    public IfcProfileProperties getRelatingProfileProperties() {
        return relatingProfileProperties;
    }

    public void setRelatingProfileProperties(IfcProfileProperties relatingProfileProperties) {
        this.relatingProfileProperties = relatingProfileProperties;
    }

    public IfcShapeAspect getProfileSectionLocation() {
        return profileSectionLocation;
    }

    public void setProfileSectionLocation(IfcShapeAspect profileSectionLocation) {
        this.profileSectionLocation = profileSectionLocation;
    }

    public IfcOrientationSelect getProfileOrientation() {
        return profileOrientation;
    }

    public void setProfileOrientation(IfcOrientationSelect profileOrientation) {
        this.profileOrientation = profileOrientation;
    }
}

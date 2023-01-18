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
package org.sikongsphere.ifc.model.schema.domain.architecture.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.extension.product.entities.IfcSpatialStructureElement;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcRelConnects;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcCountMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcNormalisedRatioMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author zaiyuan
 * @date 2022/12/19 21:40
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENTITY)
public class IfcRelInteractionRequirements extends IfcRelConnects {
    @IfcOptionField
    private IfcCountMeasure dailyInteraction;
    @IfcOptionField
    private IfcNormalisedRatioMeasure importanceRating;
    @IfcOptionField
    private IfcSpatialStructureElement locationOfInteraction;
    private IfcSpaceProgram relatedSpaceProgram;
    private IfcSpaceProgram relatingSpaceProgram;

    @IfcParserConstructor
    public IfcRelInteractionRequirements(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcCountMeasure dailyInteraction,
        IfcNormalisedRatioMeasure importanceRating,
        IfcSpatialStructureElement locationOfInteraction,
        IfcSpaceProgram relatedSpaceProgram,
        IfcSpaceProgram relatingSpaceProgram
    ) {
        super(globalId, ownerHistory, name, description);
        this.dailyInteraction = dailyInteraction;
        this.importanceRating = importanceRating;
        this.locationOfInteraction = locationOfInteraction;
        this.relatedSpaceProgram = relatedSpaceProgram;
        this.relatingSpaceProgram = relatingSpaceProgram;
    }

    public IfcCountMeasure getDailyInteraction() {
        return dailyInteraction;
    }

    public void setDailyInteraction(IfcCountMeasure dailyInteraction) {
        this.dailyInteraction = dailyInteraction;
    }

    public IfcNormalisedRatioMeasure getImportanceRating() {
        return importanceRating;
    }

    public void setImportanceRating(IfcNormalisedRatioMeasure importanceRating) {
        this.importanceRating = importanceRating;
    }

    public IfcSpatialStructureElement getLocationOfInteraction() {
        return locationOfInteraction;
    }

    public void setLocationOfInteraction(IfcSpatialStructureElement locationOfInteraction) {
        this.locationOfInteraction = locationOfInteraction;
    }

    public IfcSpaceProgram getRelatedSpaceProgram() {
        return relatedSpaceProgram;
    }

    public void setRelatedSpaceProgram(IfcSpaceProgram relatedSpaceProgram) {
        this.relatedSpaceProgram = relatedSpaceProgram;
    }

    public IfcSpaceProgram getRelatingSpaceProgram() {
        return relatingSpaceProgram;
    }

    public void setRelatingSpaceProgram(IfcSpaceProgram relatingSpaceProgram) {
        this.relatingSpaceProgram = relatingSpaceProgram;
    }
}

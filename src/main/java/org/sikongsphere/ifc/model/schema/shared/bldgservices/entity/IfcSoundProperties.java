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
package org.sikongsphere.ifc.model.schema.shared.bldgservices.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcPropertySetDefinition;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcBoolean;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;
import org.sikongsphere.ifc.model.schema.shared.bldgservices.enumeration.IfcSoundScaleEnum;

/**
 * Common definition to capture the properties of sound typically used within the context of building services and flow distribution systems. Sound properties are sound power or pressure levels across eight octave bands specifying the amount of sound generation or sound attenuation.
 * @author zaiyuan
 * @modify GaoSu
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.SHARED, type = IfcType.ENTITY)
public class IfcSoundProperties extends IfcPropertySetDefinition {
    private IfcBoolean isAttenuating;
    @IfcOptionField
    private IfcSoundScaleEnum soundScale;
    private LIST<IfcSoundValue> soundValues;

    @IfcParserConstructor
    public IfcSoundProperties(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcBoolean isAttenuating,
        IfcSoundScaleEnum soundScale,
        LIST<IfcSoundValue> soundValues
    ) {
        super(globalId, ownerHistory, name, description);
        this.isAttenuating = isAttenuating;
        this.soundScale = soundScale;
        this.soundValues = soundValues;
    }

    public IfcBoolean getIsAttenuating() {
        return isAttenuating;
    }

    public void setIsAttenuating(IfcBoolean isAttenuating) {
        this.isAttenuating = isAttenuating;
    }

    public IfcSoundScaleEnum getSoundScale() {
        return soundScale;
    }

    public void setSoundScale(IfcSoundScaleEnum soundScale) {
        this.soundScale = soundScale;
    }

    public LIST<IfcSoundValue> getSoundValues() {
        return soundValues;
    }

    public void setSoundValues(LIST<IfcSoundValue> soundValues) {
        this.soundValues = soundValues;
    }
}

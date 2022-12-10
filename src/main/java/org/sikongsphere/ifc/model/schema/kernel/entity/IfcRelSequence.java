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
package org.sikongsphere.ifc.model.schema.kernel.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.kernel.enumeration.IfcSequenceEnum;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcTimeMeasure;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author zaiyuan
 * @date 2022/12/10 21:15
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.CORE)
public class IfcRelSequence extends IfcRelConnects {
    private IfcProcess relatingProcess;
    private IfcProcess relatedProcess;
    private IfcTimeMeasure timeLag;
    private IfcSequenceEnum sequenceType;

    @IfcParserConstructor
    public IfcRelSequence(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcProcess relatingProcess,
        IfcProcess relatedProcess,
        IfcTimeMeasure timeLag,
        IfcSequenceEnum sequenceType
    ) {
        super(globalId, ownerHistory, name, description);
        this.relatingProcess = relatingProcess;
        this.relatedProcess = relatedProcess;
        this.timeLag = timeLag;
        this.sequenceType = sequenceType;
    }

    public IfcProcess getRelatingProcess() {
        return relatingProcess;
    }

    public void setRelatingProcess(IfcProcess relatingProcess) {
        this.relatingProcess = relatingProcess;
    }

    public IfcProcess getRelatedProcess() {
        return relatedProcess;
    }

    public void setRelatedProcess(IfcProcess relatedProcess) {
        this.relatedProcess = relatedProcess;
    }

    public IfcTimeMeasure getTimeLag() {
        return timeLag;
    }

    public void setTimeLag(IfcTimeMeasure timeLag) {
        this.timeLag = timeLag;
    }

    public IfcSequenceEnum getSequenceType() {
        return sequenceType;
    }

    public void setSequenceType(IfcSequenceEnum sequenceType) {
        this.sequenceType = sequenceType;
    }

    @Override
    public boolean illegal() {
        // TODO
        return super.illegal();
    }
}

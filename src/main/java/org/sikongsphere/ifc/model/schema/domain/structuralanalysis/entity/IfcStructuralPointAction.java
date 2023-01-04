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

import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.model.datatype.BOOLEAN;
import org.sikongsphere.ifc.model.schema.domain.structuralanalysis.enumeration.IfcProjectedOrTrueLengthEnum;
import org.sikongsphere.ifc.model.schema.resource.geometricconstraint.entity.IfcObjectPlacement;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.representation.entity.IfcProductRepresentation;
import org.sikongsphere.ifc.model.schema.resource.representation.enumeration.IfcGlobalOrLocalEnum;
import org.sikongsphere.ifc.model.schema.resource.structuralload.entity.IfcStructuralLoad;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author Yiwei
 * @date 2022/12/23
 */
public class IfcStructuralPointAction extends IfcStructuralAction {
    public IfcStructuralPointAction(
        IfcStructuralLoad appliedLoad,
        IfcGlobalOrLocalEnum globalOrLocal,
        BOOLEAN destabilizingLoad,
        IfcStructuralReaction causedBy
    ) {
        super(appliedLoad, globalOrLocal, destabilizingLoad, causedBy);
    }

    @IfcParserConstructor
    public IfcStructuralPointAction(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcObjectPlacement objectPlacement,
        IfcProductRepresentation representation,
        IfcStructuralLoad appliedLoad,
        IfcGlobalOrLocalEnum globalOrLocal,
        BOOLEAN destabilizingLoad,
        IfcStructuralReaction causedBy
    ) {
        super(
            globalId,
            ownerHistory,
            name,
            description,
            objectType,
            objectPlacement,
            representation,
            appliedLoad,
            globalOrLocal,
            destabilizingLoad,
            causedBy
        );
    }
}

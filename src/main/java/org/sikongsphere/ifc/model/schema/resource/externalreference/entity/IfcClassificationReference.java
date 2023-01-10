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
package org.sikongsphere.ifc.model.schema.resource.externalreference.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.resource.externalreference.selectType.IfcClassificationNotationSelect;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcIdentifier;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;

/**
 * An IfcClassificationReference is a reference into a classification system or source (see IfcClassification).
 * An optional inherited ItemReference key is also provided to allow more specific references to classification items
 * (or tables) by type. The inherited Name attribute allows for a human interpretable designation of a classification
 * notation (or code) - see use definition of "Lightweight Classification".
 * @author zaiyuan
 * @modify yiwei
 * @date 2022/12/06
 */

@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcClassificationReference extends IfcExternalReference
    implements
        IfcClassificationNotationSelect {

    @IfcOptionField
    private IfcClassification referencedSource;

    
    public IfcClassificationReference(IfcClassification referencedSource) {
        this.referencedSource = referencedSource;
    }
    @IfcParserConstructor
    public IfcClassificationReference(
        IfcLabel location,
        IfcIdentifier itemReference,
        IfcLabel name,
        IfcClassification referencedSource
    ) {
        super(location, itemReference, name);
        this.referencedSource = referencedSource;
    }

    public IfcClassification getReferencedSource() {
        return referencedSource;
    }

    public void setReferencedSource(IfcClassification referencedSource) {
        this.referencedSource = referencedSource;
    }
}

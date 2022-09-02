package org.sikongsphere.ifc.model.resource.presentation.entity;

import org.sikongsphere.ifc.model.resource.externalreference.entity.IfcExternalReference;
import org.sikongsphere.ifc.model.resource.measure.defined_type.IfcIdentifier;
import org.sikongsphere.ifc.model.resource.measure.defined_type.IfcLabel;

/**
 * The externally defined text font is an external reference to a text font
 *
 * @author stan
 * @date 2022/09/02 13:15
 */
public class IfcExternallyDefinedTextFont extends IfcExternalReference {
    public IfcExternallyDefinedTextFont(IfcLabel location, IfcIdentifier itemReference, IfcLabel name) {
        super(location, itemReference, name);
    }
}

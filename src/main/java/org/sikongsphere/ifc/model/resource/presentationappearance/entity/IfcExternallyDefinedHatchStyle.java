package org.sikongsphere.ifc.model.resource.presentationappearance.entity;

import org.sikongsphere.ifc.model.resource.externalreference.entity.IfcExternalReference;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcIdentifier;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcLabel;

/**
 * The externally defined hatch style is an entity which makes an external reference to a hatching style.
 *
 * @author Wang Bohong
 * @date 2022/9/2 11:42
 */
public class IfcExternallyDefinedHatchStyle extends IfcExternalReference {

    public IfcExternallyDefinedHatchStyle() {
    }

    public IfcExternallyDefinedHatchStyle(IfcLabel location, IfcIdentifier itemReference, IfcLabel name) {
        super(location, itemReference, name);
    }
}

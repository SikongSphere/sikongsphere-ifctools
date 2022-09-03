package org.sikongsphere.ifc.model.resource.representation.entity;

import org.sikongsphere.ifc.model.IfcNonLeafNode;
import org.sikongsphere.ifc.model.basic.SET;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcText;

/**
 * The IfcProductRepresentation defines a representation of a product,
 * including its (geometric or topological) representation.
 *
 * @author stan
 * @date 2022/09/02 13:32
 */
public class IfcProductRepresentation {
    private IfcLabel name;
    private IfcText description;
    private SET<IfcRepresentation> representations;
}

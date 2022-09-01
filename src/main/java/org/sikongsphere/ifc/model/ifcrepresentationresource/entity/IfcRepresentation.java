package org.sikongsphere.ifc.model.ifcrepresentationresource.entity;

import org.sikongsphere.ifc.model.IfcNonLeafNode;
import org.sikongsphere.ifc.model.basic.IfcLabel;

/**
 * IfcRepresentation
 *
 * @author zaiyuan
 * @date 2022/9/1 08:15
 */
public class IfcRepresentation extends IfcNonLeafNode {
    private IfcRepresentation contextContextOfItems 	;
    private IfcLabel representationIdentifier;
    private  IfcLabel RepresentationType;
    // TODO private Items	 : 	SET [1:?] OF IfcRepresentationItem;

    /**
     * TODO
     *
     * RepresentationMap	 : 	SET [0:1] OF IfcRepresentationMap FOR MappedRepresentation;
     * LayerAssignments	 : 	SET OF IfcPresentationLayerAssignment FOR Assigneditems;
     * OfProductRepresentation	 : 	SET [0:1] OF IfcProductRepresentation FOR Representations;
     */
}

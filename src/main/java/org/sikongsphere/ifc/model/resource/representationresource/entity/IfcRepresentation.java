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
package org.sikongsphere.ifc.model.resource.representationresource.entity;

import org.sikongsphere.ifc.model.IfcNonLeafNode;
import org.sikongsphere.ifc.model.resource.measureresource.defined_type.IfcLabel;

/**
 * IfcRepresentation
 *
 * @author zaiyuan
 * @date 2022/9/1 08:15
 */
public class IfcRepresentation extends IfcNonLeafNode {
    private IfcRepresentation contextContextOfItems;
    private IfcLabel representationIdentifier;
    private IfcLabel RepresentationType;
    // TODO private Items : SET [1:?] OF IfcRepresentationItem;

    /**
     * TODO
     *
     * RepresentationMap	 : 	SET [0:1] OF IfcRepresentationMap FOR MappedRepresentation;
     * LayerAssignments	 : 	SET OF IfcPresentationLayerAssignment FOR Assigneditems;
     * OfProductRepresentation	 : 	SET [0:1] OF IfcProductRepresentation FOR Representations;
     */
}

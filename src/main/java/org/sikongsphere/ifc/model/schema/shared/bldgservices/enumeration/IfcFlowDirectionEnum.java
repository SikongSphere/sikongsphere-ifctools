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
package org.sikongsphere.ifc.model.schema.shared.bldgservices.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * This enumeration defines the flow direction at a connection point as either a Source, Sink, or both SourceAndSink.
 * @author zaiyuan
 * @modify GaoSu
 * @date 2022/12/18 15:34
 */
@IfcClass(type = IfcType.ENUMERATION, layer = IfcLayer.SHARED)
public enum IfcFlowDirectionEnum {
    /**
     * A source of flow (e.g., it flows out of the connection)
     */
    SOURCE,
    /**
     * A flow sink (e.g., it flows into the connection)
     */
    SINK,
    /**
     * Both a source and sink (e.g., it flows both into and out of the connection simultaneously)
     */
    SOURCEANDSINK,
    /**
     * Undefined flow direction.
     */
    NOTDEFINED
}

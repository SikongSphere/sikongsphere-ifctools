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
package org.sikongsphere.ifc.graph.graphAPI;

import org.sikongsphere.ifc.graph.basic.IfcGraph;
import org.sikongsphere.ifc.graph.basic.LayerType;

public interface IfcGraphWriter {
    public void writeGraph(String path, IfcGraph graph);

    void writeGraphLayer(String path, IfcGraph graph, LayerType layerType);
}

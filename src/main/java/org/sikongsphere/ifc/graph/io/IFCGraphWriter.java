package org.sikongsphere.ifc.graph.io;

import org.sikongsphere.ifc.graph.basic.IFCGraph;
import org.sikongsphere.ifc.graph.basic.LayerType;

public interface IFCGraphWriter {
    public void WriteGraph(String path, IFCGraph graph);

    void WriteGraphLayer(String path, IFCGraph graph, LayerType layerType);
}

package org.sikongsphere.ifc.graph.io;

import org.sikongsphere.ifc.graph.basic.IFCGraph;

public interface IFCGraphReader {
    public IFCGraph ReadGraph(String path);
    public IFCGraph ReadLayer(String path, Enum LayerType);
}

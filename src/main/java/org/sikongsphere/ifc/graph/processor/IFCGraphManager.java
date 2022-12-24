package org.sikongsphere.ifc.graph.processor;

import org.sikongsphere.ifc.graph.basic.IFCGraph;

public interface IFCGraphManager {
    public IFCGraph Process(IFCGraph graph, IFCGraphProcessor processor);
}

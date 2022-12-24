package org.sikongsphere.ifc.graph.processor;

import org.sikongsphere.ifc.graph.basic.IFCGraph;
import org.sikongsphere.ifc.graph.basic.IFCGraphLayer;

public interface IFCGraphProcessor {
    public IFCGraph Process(IFCGraph graph);

    public IFCGraphLayer ProcessLayer(IFCGraphLayer ifcGraphLayer);
}

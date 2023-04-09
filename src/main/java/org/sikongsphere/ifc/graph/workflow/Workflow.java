package org.sikongsphere.ifc.graph.workflow;

import org.sikongsphere.ifc.graph.basic.IfcGraph;
import org.sikongsphere.ifc.graph.generator.IfcGraphStandardGenerator;
import org.sikongsphere.ifc.graph.graphAPI.IfcGraphGenerator;
import org.sikongsphere.ifc.graph.graphAPI.IfcGraphManager;
import org.sikongsphere.ifc.graph.graphAPI.IfcGraphReader;
import org.sikongsphere.ifc.graph.graphAPI.IfcGraphWorkflow;
import org.sikongsphere.ifc.graph.io.IfcGraphStandardReader;
import org.sikongsphere.ifc.graph.io.IfcGraphStandardWriter;
import org.sikongsphere.ifc.graph.manager.IfcGraphPreprocessManager;

public class Workflow implements IfcGraphWorkflow {
    @Override
    // Inject later

    public void startWorkflow(String path) {
        // read graph
        IfcGraphReader reader = new IfcGraphStandardReader();
        IfcGraph src = reader.readGraph(path);

        // process graph
        IfcGraphManager preManager = new IfcGraphPreprocessManager();
        preManager.process(src);

        // graph generation
        IfcGraphGenerator generator = new IfcGraphStandardGenerator();
        IfcGraph dst = generator.generate(src);

        // process new graph
        IfcGraphManager postManager = new IfcGraphPreprocessManager();
        postManager.process(dst);

        String resPath = path + "_res";
        // write graph
        new IfcGraphStandardWriter().writeGraph(resPath, dst);
    }

}

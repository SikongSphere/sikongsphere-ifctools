package org.sikongsphere.ifc.sdk;

import org.sikongsphere.ifc.infra.IfcClassContainer;

public class SikongSphereSession {
    private IfcClassContainer ifcClassContainer;
    private SikongSphereSession(){}
    public SikongSphereSession getOrCreate() {
        return new SikongSphereSession();
    }
}

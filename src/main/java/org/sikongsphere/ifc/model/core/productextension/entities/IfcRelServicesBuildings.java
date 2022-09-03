package org.sikongsphere.ifc.model.core.productextension.entities;

import org.sikongsphere.ifc.model.basic.SET;
import org.sikongsphere.ifc.model.core.kernel.entity.IfcRelConnects;

/**
 * An objectified relationship that
 * defines the relationship between a system and the sites, buildings, storeys or spaces, it serves.
 *
 * @author stan
 * @date 2022/09/02 13:35
 */
public class IfcRelServicesBuildings extends IfcRelConnects {
    private IfcSystem relatingSystem;
    private SET<IfcSpatialStructureElement> relatedBuildings;

    public IfcRelServicesBuildings() {
    }

    public IfcRelServicesBuildings(IfcSystem relatingSystem, SET<IfcSpatialStructureElement> relatedBuildings) {
        this.relatingSystem = relatingSystem;
        this.relatedBuildings = relatedBuildings;
    }

    public IfcSystem getRelatingSystem() {
        return relatingSystem;
    }

    public void setRelatingSystem(IfcSystem relatingSystem) {
        this.relatingSystem = relatingSystem;
    }

    public SET<IfcSpatialStructureElement> getRelatedBuildings() {
        return relatedBuildings;
    }

    public void setRelatedBuildings(SET<IfcSpatialStructureElement> relatedBuildings) {
        this.relatedBuildings = relatedBuildings;
    }
}

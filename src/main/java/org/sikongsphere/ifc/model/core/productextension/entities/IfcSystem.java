package org.sikongsphere.ifc.model.core.productextension.entities;

import org.sikongsphere.ifc.model.basic.SET;
import org.sikongsphere.ifc.model.core.kernel.entity.IfcGroup;

/**
 * Organized combination of related parts within an AEC product, composed for a common purpose or function
 * or to provide a service. System is essentially a functionally related aggregation of products.
 *
 * @author stan
 * @date 2022/09/02 13:36
 */
public class IfcSystem extends IfcGroup {
    private SET<IfcRelServicesBuildings> serviceBuildings;

    public IfcSystem() {
    }

    public IfcSystem(SET<IfcRelServicesBuildings> serviceBuildings) {
        this.serviceBuildings = serviceBuildings;
    }

    public SET<IfcRelServicesBuildings> getServiceBuildings() {
        return serviceBuildings;
    }

    public void setServiceBuildings(SET<IfcRelServicesBuildings> serviceBuildings) {
        this.serviceBuildings = serviceBuildings;
    }
}

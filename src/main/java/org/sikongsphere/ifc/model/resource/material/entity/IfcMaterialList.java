package org.sikongsphere.ifc.model.resource.material.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.basic.LIST;
import org.sikongsphere.ifc.model.body.IfcBodyTemplate;

/**
 * A list of the different materials that are used in an element.
 * @author Wang Bohong
 * @date 2022/10/25 11:50
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcMaterialList extends IfcBodyTemplate {
    private LIST<IfcMaterial> materials;

    public IfcMaterialList() {
    }

    @IfcParserConstructor
    public IfcMaterialList(LIST<IfcMaterial> materials) {
        this.materials = materials;
    }

    public LIST<IfcMaterial> getMaterials() {
        return materials;
    }

    public void setMaterials(LIST<IfcMaterial> materials) {
        this.materials = materials;
    }
}

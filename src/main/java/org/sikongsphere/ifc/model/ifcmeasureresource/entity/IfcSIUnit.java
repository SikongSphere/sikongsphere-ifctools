package org.sikongsphere.ifc.model.ifcmeasureresource.entity;

import org.sikongsphere.ifc.model.ifcmeasureresource.enumeration.IfcSIPrefix;
import org.sikongsphere.ifc.model.ifcmeasureresource.enumeration.IfcSIUnitName;

/**
 * This class is used to encapsulate SI Unit information
 *
 * @author zaiyuan
 * @date 2022-08-31 18:30:00
 */
public class IfcSIUnit extends IfcNamedUnit {
    private IfcSIPrefix prefix;
    private IfcSIUnitName name;

    /**
     * TODO
     * DERIVE
     * SELF\IfcNamedUnit.Dimensions	 : 	IfcDimensionalExponents :=  IfcDimensionsForSiUnit (SELF.Name);
     */
}

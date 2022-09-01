package org.sikongsphere.ifc.model.ifcactorresource.entity;

import org.sikongsphere.ifc.model.basic.IfcLabel;
import org.sikongsphere.ifc.model.basic.LIST;

/**
 * IfcPostalAddress
 *
 * @author zaiyuan
 * @date 2022/9/1 08:15
 */
public class IfcPostalAddress extends IfcAddress {

    private IfcLabel internalLocation;
    private LIST<IfcLabel> AddressLines;
    private IfcLabel PostalBox;
    private IfcLabel Town;
    private IfcLabel Region;
    private IfcLabel PostalCode;
    private IfcLabel Country;

}

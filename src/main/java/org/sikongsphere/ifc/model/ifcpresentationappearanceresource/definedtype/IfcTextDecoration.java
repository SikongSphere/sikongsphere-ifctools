package org.sikongsphere.ifc.model.ifcpresentationappearanceresource.definedtype;

import org.sikongsphere.ifc.model.basic.STRING;

/**
 * IfcTextDecoration
 * 	SELF IN ['none', 'underline', 'overline', 'line-through', 'blink']
 *
 * @author zaiyuan
 * @date 2022/9/1 08:15
 */
public class IfcTextDecoration extends STRING {
    public IfcTextDecoration(String value) {
        super(value);
    }
}

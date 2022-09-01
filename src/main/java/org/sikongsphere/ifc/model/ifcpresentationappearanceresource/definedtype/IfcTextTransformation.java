package org.sikongsphere.ifc.model.ifcpresentationappearanceresource.definedtype;

import org.sikongsphere.ifc.model.basic.STRING;

/**
 * IfcTextTransformation
 * 	SELF IN ['capitalize', 'uppercase', 'lowercase', 'none']
 *
 * @author zaiyuan
 * @date 2022/9/1 08:15
 */
public class IfcTextTransformation extends STRING {
    public IfcTextTransformation(String value) {
        super(value);
    }
}

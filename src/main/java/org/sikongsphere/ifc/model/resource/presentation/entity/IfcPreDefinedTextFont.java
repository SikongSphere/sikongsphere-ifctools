package org.sikongsphere.ifc.model.resource.presentation.entity;

import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcLabel;

/**
 * The pre defined text font determines those qualified names which can be used for fonts
 * that are in scope of the current data exchange specification (in contrary to externally defined text fonts).
 *
 * @author stan
 * @date 2022/09/02 13:13
 */
public abstract class IfcPreDefinedTextFont extends IfcPreDefinedItem{
    public IfcPreDefinedTextFont() {
    }

    public IfcPreDefinedTextFont(IfcLabel name) {
        super(name);
    }
}

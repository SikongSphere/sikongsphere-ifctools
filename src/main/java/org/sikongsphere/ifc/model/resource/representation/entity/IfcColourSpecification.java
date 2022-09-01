package org.sikongsphere.ifc.model.resource.representation.entity;

import org.sikongsphere.ifc.model.resource.measure.defined_type.IfcLabel;
import org.sikongsphere.ifc.model.resource.representation.selecttype.IfcColour;

/**
 * The IfcTextFontSelect alows for either a predefined text font, a text font model or an externally defined
 * text font to be used to describe the font of a text literal.
 *
 * @author zaiyuan
 * @date 2022/9/2 08:15
 */
public class IfcColourSpecification implements IfcColour {
    private IfcLabel name;
}

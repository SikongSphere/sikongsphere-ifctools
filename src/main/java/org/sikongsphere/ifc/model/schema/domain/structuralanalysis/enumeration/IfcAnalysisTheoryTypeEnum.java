/*
 * Copyright 2022 SikongSphere
 *
 * This program is free software; you can redistribute it and/or modify it under the terms of the
 * GNU General Public License version 2 as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
*/
package org.sikongsphere.ifc.model.schema.domain.structuralanalysis.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 *This type definition is used to distinguish between different types of structural analysis methods, i.e. first order theory, second order theory (small deformations), third order theory (large deformations) and the full nonlinear theory (large deformations and higher order effects). The IfcAnalysisTheoryTypeEnum type is referenced by the entity IfcStructuralResultGroup.
 *
 * @author yiwei
 * @date 2022-12-22 20:30:00
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION)
public enum IfcAnalysisTheoryTypeEnum {
    FIRST_ORDER_THEORY,
    SECOND_ORDER_THEORY,
    THIRD_ORDER_THEORY,
    FULL_NONLINEAR_THEORY,
    USERDEFINED,
    NOTDEFINED
}

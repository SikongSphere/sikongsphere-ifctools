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
package org.sikongsphere.ifc.model.schema.resource.geometry.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.BOOLEAN;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.geometry.enumeration.IfcTrimmingPreference;
import org.sikongsphere.ifc.model.schema.resource.geometry.selectType.IfcTrimmingSelect;

/**
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcTrimmedCurve extends IfcBoundedCurve {
    private IfcCurve basisCurve;
    private SET<IfcTrimmingSelect> trim1;
    private SET<IfcTrimmingSelect> trim2;
    private BOOLEAN senseAgreement;
    private IfcTrimmingPreference masterRepresentation;

    @IfcParserConstructor
    public IfcTrimmedCurve(
        IfcCurve basisCurve,
        SET<IfcTrimmingSelect> trim1,
        SET<IfcTrimmingSelect> trim2,
        BOOLEAN senseAgreement,
        IfcTrimmingPreference masterRepresentation
    ) {
        this.basisCurve = basisCurve;
        this.trim1 = trim1;
        this.trim2 = trim2;
        this.senseAgreement = senseAgreement;
        this.masterRepresentation = masterRepresentation;
    }

    public IfcCurve getBasisCurve() {
        return basisCurve;
    }

    public void setBasisCurve(IfcCurve basisCurve) {
        this.basisCurve = basisCurve;
    }

    public SET<IfcTrimmingSelect> getTrim1() {
        return trim1;
    }

    public void setTrim1(SET<IfcTrimmingSelect> trim1) {
        this.trim1 = trim1;
    }

    public SET<IfcTrimmingSelect> getTrim2() {
        return trim2;
    }

    public void setTrim2(SET<IfcTrimmingSelect> trim2) {
        this.trim2 = trim2;
    }

    public BOOLEAN getSenseAgreement() {
        return senseAgreement;
    }

    public void setSenseAgreement(BOOLEAN senseAgreement) {
        this.senseAgreement = senseAgreement;
    }

    public IfcTrimmingPreference getMasterRepresentation() {
        return masterRepresentation;
    }

    public void setMasterRepresentation(IfcTrimmingPreference masterRepresentation) {
        this.masterRepresentation = masterRepresentation;
    }
}

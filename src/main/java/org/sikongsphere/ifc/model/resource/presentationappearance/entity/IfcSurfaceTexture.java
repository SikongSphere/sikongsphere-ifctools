package org.sikongsphere.ifc.model.resource.presentationappearance.entity;


import org.sikongsphere.ifc.model.basic.LOGICAL;
import org.sikongsphere.ifc.model.resource.geometry.entity.IfcCartesianPoint;
import org.sikongsphere.ifc.model.resource.geometry.entity.IfcCartesianTransformationOperator;
import org.sikongsphere.ifc.model.resource.geometry.entity.IfcCartesianTransformationOperator2D;
import org.sikongsphere.ifc.model.resource.presentationappearance.enumeration.IfcSurfaceTextureEnum;

/**
 * An IfcSurfaceTexture provides a 2-dimensional image-based texture map.
 * It can either be given by referencing an external image file through an URL reference (IfcImageTexture),
 * or by explicitly including an array of pixels (IfcPixelTexture).
 *
 * @author stan
 * @date 2022/09/02 13:22
 */
public abstract class IfcSurfaceTexture {
    private LOGICAL repeatS;//todo -> BOOLEAN
    private LOGICAL repeatT;//todo -> BOOLEAN
    private IfcSurfaceTextureEnum textureType;
    private IfcCartesianTransformationOperator2D textureTransform;

    public IfcSurfaceTexture() {
    }

    public IfcSurfaceTexture(LOGICAL repeatS, LOGICAL repeatT, IfcSurfaceTextureEnum textureType, IfcCartesianTransformationOperator2D textureTransform) {
        this.repeatS = repeatS;
        this.repeatT = repeatT;
        this.textureType = textureType;
        this.textureTransform = textureTransform;
    }

    public LOGICAL getRepeatS() {
        return repeatS;
    }

    public void setRepeatS(LOGICAL repeatS) {
        this.repeatS = repeatS;
    }

    public LOGICAL getRepeatT() {
        return repeatT;
    }

    public void setRepeatT(LOGICAL repeatT) {
        this.repeatT = repeatT;
    }

    public IfcSurfaceTextureEnum getTextureType() {
        return textureType;
    }

    public void setTextureType(IfcSurfaceTextureEnum textureType) {
        this.textureType = textureType;
    }

    public IfcCartesianTransformationOperator2D getTextureTransform() {
        return textureTransform;
    }

    public void setTextureTransform(IfcCartesianTransformationOperator2D textureTransform) {
        this.textureTransform = textureTransform;
    }
}

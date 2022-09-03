package org.sikongsphere.ifc.model.resource.presentationappearance.entity;

import org.sikongsphere.ifc.model.IfcNonLeafNode;
import org.sikongsphere.ifc.model.basic.SET;

/**
 * The entity IfcSurfaceStyleWithTextures allows for the assignment of image textures to surface styles.
 * These image textures can be applied repeating across the surface or mapped with a particular scale upon the surface.
 *
 * @author stan
 * @date 2022/09/02 13:21
 */
public class IfcSurfaceStyleWithTextures {
    private SET<IfcSurfaceTexture> textures;

    public IfcSurfaceStyleWithTextures() {
    }

    public IfcSurfaceStyleWithTextures(SET<IfcSurfaceTexture> textures) {
        this.textures = textures;
    }

    public SET<IfcSurfaceTexture> getTextures() {
        return textures;
    }

    public void setTextures(SET<IfcSurfaceTexture> textures) {
        this.textures = textures;
    }
}

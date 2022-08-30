package org.sikongsphere.ifc.model.body;

import org.sikongsphere.ifc.model.basic.IfcLabel;
import org.sikongsphere.ifc.model.basic.IfcText;
import org.sikongsphere.ifc.model.basic.SET;

/**
 * This class is used to encapsulate organization relationship information
 *
 * @author zaiyuan
 * @date 2022-08-30 18:30:00
 */
public class IfcOrganizationRelationship {
    private IfcLabel name;
    private IfcText description;
    private IfcOrganization relatingOrganization;
    private SET<IfcOrganization> relatedOrganizations;

    public IfcOrganizationRelationship(IfcLabel name,
                                       IfcOrganization relatingOrganization,
                                       SET<IfcOrganization> relatedOrganizations) {
        this.name = name;
        this.relatingOrganization = relatingOrganization;
        this.relatedOrganizations = relatedOrganizations;
    }

    public IfcOrganizationRelationship(IfcLabel name,
                                       IfcText description,
                                       IfcOrganization relatingOrganization,
                                       SET<IfcOrganization> relatedOrganizations) {
        this.name = name;
        this.description = description;
        this.relatingOrganization = relatingOrganization;
        this.relatedOrganizations = relatedOrganizations;
    }

    public IfcLabel getName() {
        return name;
    }

    public void setName(IfcLabel name) {
        this.name = name;
    }

    public IfcText getDescription() {
        return description;
    }

    public void setDescription(IfcText description) {
        this.description = description;
    }

    public IfcOrganization getRelatingOrganization() {
        return relatingOrganization;
    }

    public void setRelatingOrganization(IfcOrganization relatingOrganization) {
        this.relatingOrganization = relatingOrganization;
    }

    public SET<IfcOrganization> getRelatedOrganizations() {
        return relatedOrganizations;
    }

    public void setRelatedOrganizations(SET<IfcOrganization> relatedOrganizations) {
        this.relatedOrganizations = relatedOrganizations;
    }
}

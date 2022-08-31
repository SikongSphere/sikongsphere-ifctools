package org.sikongsphere.ifc.model.ifcactorresource.entity;

import org.sikongsphere.ifc.model.basic.*;

/**
 * This class is used to encapsulate organization information
 *
 * @author zaiyuan
 * @date 2022-08-30 18:30:00
 */
public class IfcOrganization {
    private IfcIdentifier id;
    private IfcLabel name;
    private IfcText description;
    private LIST<IfcActorRole> roles;
    private LIST<IfcAddress> addresses;

    private SET<IfcOrganizationRelationship> isRelatedBy;
    private SET<IfcOrganizationRelationship> relates;
    private SET<IfcPersonAndOrganization> engages;

    public IfcOrganization(IfcIdentifier id,
                           IfcLabel name,
                           IfcText description,
                           LIST<IfcActorRole> roles,
                           LIST<IfcAddress> addresses) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.roles = roles;
        this.addresses = addresses;
    }

    public IfcIdentifier getId() {
        return id;
    }

    public void setId(IfcIdentifier id) {
        this.id = id;
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

    public LIST<IfcActorRole> getRoles() {
        return roles;
    }

    public void setRoles(LIST<IfcActorRole> roles) {
        this.roles = roles;
    }

    public LIST<IfcAddress> getAddresses() {
        return addresses;
    }

    public void setAddresses(LIST<IfcAddress> addresses) {
        this.addresses = addresses;
    }

    public SET<IfcOrganizationRelationship> getIsRelatedBy() {
        return isRelatedBy;
    }

    public void setIsRelatedBy(SET<IfcOrganizationRelationship> isRelatedBy) {
        this.isRelatedBy = isRelatedBy;
    }

    public SET<IfcOrganizationRelationship> getRelates() {
        return relates;
    }

    public void setRelates(SET<IfcOrganizationRelationship> relates) {
        this.relates = relates;
    }

    public SET<IfcPersonAndOrganization> getEngages() {
        return engages;
    }

    public void setEngages(SET<IfcPersonAndOrganization> engages) {
        this.engages = engages;
    }
}
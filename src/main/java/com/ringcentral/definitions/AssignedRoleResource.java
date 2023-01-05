package com.ringcentral.definitions;


public class AssignedRoleResource
{
    /**
     * Internal identifier of a role
     */
    public String id;
    public AssignedRoleResource id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Specifies if a role can be auto assigned
     */
    public Boolean autoAssigned;
    public AssignedRoleResource autoAssigned(Boolean autoAssigned)
    {
        this.autoAssigned = autoAssigned;
        return this;
    }

    /**
     * Name of a default role
     */
    public String displayName;
    public AssignedRoleResource displayName(String displayName)
    {
        this.displayName = displayName;
        return this;
    }

    /**
     * Site compatibility flag
     */
    public Boolean siteCompatible;
    public AssignedRoleResource siteCompatible(Boolean siteCompatible)
    {
        this.siteCompatible = siteCompatible;
        return this;
    }

    /**
     * Site restricted flag
     */
    public Boolean siteRestricted;
    public AssignedRoleResource siteRestricted(Boolean siteRestricted)
    {
        this.siteRestricted = siteRestricted;
        return this;
    }
}
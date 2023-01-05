package com.ringcentral.definitions;


    /**
* Resource metadata
*/
public class ScimMeta
{
    /**
     * Format: date-time
     */
    public String created;
    public ScimMeta created(String created)
    {
        this.created = created;
        return this;
    }

    /**
     * Format: date-time
     */
    public String lastModified;
    public ScimMeta lastModified(String lastModified)
    {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * Resource location URI
     */
    public String location;
    public ScimMeta location(String location)
    {
        this.location = location;
        return this;
    }

    /**
     * Enum: User, Group, ResourceType, Schema
     */
    public String resourceType;
    public ScimMeta resourceType(String resourceType)
    {
        this.resourceType = resourceType;
        return this;
    }
}
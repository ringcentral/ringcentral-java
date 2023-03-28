package com.ringcentral.definitions;


/**
 * Resource metadata
 */
public class ScimMeta {
    /**
     * Format: date-time
     */
    public String created;
    /**
     * Format: date-time
     */
    public String lastModified;
    /**
     * Resource location URI
     */
    public String location;
    /**
     * Enum: User, Group, ResourceType, Schema
     */
    public String resourceType;

    public ScimMeta created(String created) {
        this.created = created;
        return this;
    }

    public ScimMeta lastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    public ScimMeta location(String location) {
        this.location = location;
        return this;
    }

    public ScimMeta resourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
}

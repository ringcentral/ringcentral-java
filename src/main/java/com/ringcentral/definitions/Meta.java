package com.ringcentral.definitions;


// resource metadata
public class Meta {
    /**
     *
     */
    public String created;
    /**
     *
     */
    public String lastModified;
    /**
     * resource location URI
     */
    public String location;
    /**
     * Enum: User, Group
     */
    public String resourceType;

    public Meta created(String created) {
        this.created = created;
        return this;
    }

    public Meta lastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    public Meta location(String location) {
        this.location = location;
        return this;
    }

    public Meta resourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

}

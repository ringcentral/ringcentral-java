package com.ringcentral.definitions;


public class GlipCompany {
    /**
     * Internal identifier of an RC account/Glip company, or tilde (~) to indicate a company the current user belongs to
     * Required
     */
    public String id;
    /**
     * Name of a company
     */
    public String name;
    /**
     * Domain name of a company
     */
    public String domain;
    /**
     * Datetime of creation in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     * Required
     */
    public String creationTime;
    /**
     * Datetime of last modification in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     * Required
     */
    public String lastModifiedTime;

    public GlipCompany id(String id) {
        this.id = id;
        return this;
    }

    public GlipCompany name(String name) {
        this.name = name;
        return this;
    }

    public GlipCompany domain(String domain) {
        this.domain = domain;
        return this;
    }

    public GlipCompany creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public GlipCompany lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

}

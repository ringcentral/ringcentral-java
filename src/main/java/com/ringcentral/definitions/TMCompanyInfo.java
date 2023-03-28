package com.ringcentral.definitions;


public class TMCompanyInfo {
    /**
     * Internal identifier of a company (RingCentral account ID)
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
     * Datetime of creation in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
     * Required
     * Format: date-time
     */
    public String creationTime;
    /**
     * Datetime of last modification in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
     * Required
     * Format: date-time
     */
    public String lastModifiedTime;

    public TMCompanyInfo id(String id) {
        this.id = id;
        return this;
    }

    public TMCompanyInfo name(String name) {
        this.name = name;
        return this;
    }

    public TMCompanyInfo domain(String domain) {
        this.domain = domain;
        return this;
    }

    public TMCompanyInfo creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public TMCompanyInfo lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
}

package com.ringcentral.definitions;


public class RcwResourceBaseModel {
    /**
     * Internal object ID
     * Example: 78654321
     */
    public String id;
    /**
     * Object creation time
     * Required
     * Format: date-time
     */
    public String creationTime;
    /**
     * Object last modification time
     * Required
     * Format: date-time
     */
    public String lastModifiedTime;

    public RcwResourceBaseModel id(String id) {
        this.id = id;
        return this;
    }

    public RcwResourceBaseModel creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public RcwResourceBaseModel lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
}

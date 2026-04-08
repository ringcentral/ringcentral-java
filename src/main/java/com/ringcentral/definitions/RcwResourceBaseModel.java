package com.ringcentral.definitions;


public class RcwResourceBaseModel
{
    /**
     * Internal object ID
     * Example: 78654321
     */
    public String id;
    public RcwResourceBaseModel id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Object creation time
     * Required
     * Format: date-time
     */
    public String creationTime;
    public RcwResourceBaseModel creationTime(String creationTime)
    {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Object last modification time
     * Required
     * Format: date-time
     */
    public String lastModifiedTime;
    public RcwResourceBaseModel lastModifiedTime(String lastModifiedTime)
    {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
}
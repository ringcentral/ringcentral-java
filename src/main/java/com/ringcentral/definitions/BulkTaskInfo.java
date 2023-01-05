package com.ringcentral.definitions;


public class BulkTaskInfo
{
    /**
     * Internal identifier of a task for multiple switches creation
     */
    public String id;
    public BulkTaskInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Status of a task
     * Enum: Accepted, Failed
     */
    public String status;
    public BulkTaskInfo status(String status)
    {
        this.status = status;
        return this;
    }

    /**
     * Task creation time
     * Format: date-time
     */
    public String creationTime;
    public BulkTaskInfo creationTime(String creationTime)
    {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Time of the task latest modification
     * Format: date-time
     */
    public String lastModifiedTime;
    public BulkTaskInfo lastModifiedTime(String lastModifiedTime)
    {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
}
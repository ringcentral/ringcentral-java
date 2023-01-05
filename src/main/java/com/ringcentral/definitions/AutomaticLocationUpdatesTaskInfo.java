package com.ringcentral.definitions;


public class AutomaticLocationUpdatesTaskInfo
{
    /**
     * Internal identifier of a task
     */
    public String id;
    public AutomaticLocationUpdatesTaskInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Status of a task
     * Enum: Accepted, InProgress, Completed, Failed
     */
    public String status;
    public AutomaticLocationUpdatesTaskInfo status(String status)
    {
        this.status = status;
        return this;
    }

    /**
     * Task creation time
     * Format: date-time
     */
    public String creationTime;
    public AutomaticLocationUpdatesTaskInfo creationTime(String creationTime)
    {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Time of the task latest modification
     * Format: date-time
     */
    public String lastModifiedTime;
    public AutomaticLocationUpdatesTaskInfo lastModifiedTime(String lastModifiedTime)
    {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * Type of a task
     * Enum: WirelessPointsBulkCreate, WirelessPointsBulkUpdate, SwitchesBulkCreate, SwitchesBulkUpdate
     */
    public String type;
    public AutomaticLocationUpdatesTaskInfo type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     */
    public TaskResultInfo result;
    public AutomaticLocationUpdatesTaskInfo result(TaskResultInfo result)
    {
        this.result = result;
        return this;
    }
}
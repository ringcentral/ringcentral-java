package com.ringcentral.definitions;


public class AutomaticLocationUpdatesTaskInfo {
    /**
     * Internal identifier of a task
     */
    public String id;
    /**
     * Status of a task
     * Enum: Accepted, InProgress, Completed, Failed
     */
    public String status;
    /**
     * Task creation time
     * Format: date-time
     */
    public String creationTime;
    /**
     * Time of the task latest modification
     * Format: date-time
     */
    public String lastModifiedTime;
    /**
     * Type of task
     * Enum: WirelessPointsBulkCreate, WirelessPointsBulkUpdate, SwitchesBulkCreate, SwitchesBulkUpdate
     */
    public String type;
    /**
     *
     */
    public TaskResultInfo result;

    public AutomaticLocationUpdatesTaskInfo id(String id) {
        this.id = id;
        return this;
    }

    public AutomaticLocationUpdatesTaskInfo status(String status) {
        this.status = status;
        return this;
    }

    public AutomaticLocationUpdatesTaskInfo creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public AutomaticLocationUpdatesTaskInfo lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public AutomaticLocationUpdatesTaskInfo type(String type) {
        this.type = type;
        return this;
    }

    public AutomaticLocationUpdatesTaskInfo result(TaskResultInfo result) {
        this.result = result;
        return this;
    }
}

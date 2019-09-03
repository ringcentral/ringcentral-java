package com.ringcentral.definitions;


public class BulkTaskInfo {
    /**
     * Internal identifier of a task for multiple switches creation
     */
    public String id;
    /**
     * Status of a task
     * Enum: Accepted, Failed
     */
    public String status;
    /**
     * Task creation time
     */
    public String creationTime;
    /**
     * Time of the task latest modification
     */
    public String lastModifiedTime;

    public BulkTaskInfo id(String id) {
        this.id = id;
        return this;
    }

    public BulkTaskInfo status(String status) {
        this.status = status;
        return this;
    }

    public BulkTaskInfo creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public BulkTaskInfo lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

}

package com.ringcentral.definitions;


// Information on the task for multiple wireless points creation
public class BulkTaskInfoWiCreate {
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

    public BulkTaskInfoWiCreate id(String id) {
        this.id = id;
        return this;
    }

    public BulkTaskInfoWiCreate status(String status) {
        this.status = status;
        return this;
    }

    public BulkTaskInfoWiCreate creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public BulkTaskInfoWiCreate lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
}

package com.ringcentral.definitions;


public class DataExportTask {
    /**
     * Canonical URI of a task
     */
    public String uri;
    /**
     * Internal identifier of a task
     */
    public String id;
    /**
     * Task creation datetime
     */
    public String creationTime;
    /**
     * Task last modification datetime
     */
    public String lastModifiedTime;
    /**
     * Task status
     * Enum: Accepted, InProgress, Completed, Failed
     */
    public String status;
    /**
     * Data collection archives. Returned by task ID
     */
    public ExportTaskResultInfo[] result;

    public DataExportTask uri(String uri) {
        this.uri = uri;
        return this;
    }

    public DataExportTask id(String id) {
        this.id = id;
        return this;
    }

    public DataExportTask creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public DataExportTask lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public DataExportTask status(String status) {
        this.status = status;
        return this;
    }

    public DataExportTask result(ExportTaskResultInfo[] result) {
        this.result = result;
        return this;
    }

}

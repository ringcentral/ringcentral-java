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
     * Task creation timestamp
     * Format: date-time
     */
    public String creationTime;
    /**
     * Task last modification timestamp
     * Format: date-time
     */
    public String lastModifiedTime;
    /**
     * Task status
     * Enum: Accepted, InProgress, Completed, Failed, Expired
     */
    public String status;
    /**
     *
     */
    public CreatorInfo creator;
    /**
     *
     */
    public SpecificInfo specific;
    /**
     * Data collection archives. Returned by task ID
     */
    public ExportTaskResultInfo[] datasets;

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

    public DataExportTask creator(CreatorInfo creator) {
        this.creator = creator;
        return this;
    }

    public DataExportTask specific(SpecificInfo specific) {
        this.specific = specific;
        return this;
    }

    public DataExportTask datasets(ExportTaskResultInfo[] datasets) {
        this.datasets = datasets;
        return this;
    }
}

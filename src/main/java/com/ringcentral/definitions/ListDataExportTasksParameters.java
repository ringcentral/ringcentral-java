package com.ringcentral.definitions;


/**
 * Query parameters for operation listDataExportTasks
 */
public class ListDataExportTasksParameters {
    /**
     * Status of the task(s) to be returned. Multiple values are supported
     * Enum: Accepted, InProgress, Completed, Failed, Expired
     */
    public String status;
    /**
     * Page number to be retrieved; value range is &gt; 0
     * Format: int32
     * Default: 1
     */
    public Long page;
    /**
     * Number of records to be returned per page; value range is 1 - 250
     * Format: int32
     * Default: 30
     */
    public Long perPage;

    public ListDataExportTasksParameters status(String status) {
        this.status = status;
        return this;
    }

    public ListDataExportTasksParameters page(Long page) {
        this.page = page;
        return this;
    }

    public ListDataExportTasksParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }
}

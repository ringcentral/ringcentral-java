package com.ringcentral.definitions;


/**
 * Information on a task for updating multiple extensions
 */
public class ExtensionBulkUpdateTaskResource {
    /**
     * Link to a task resource
     * Required
     * Format: uri
     */
    public String uri;
    /**
     * Internal identifier of a task
     * Required
     */
    public String id;
    /**
     * Task status
     * Required
     * Enum: Accepted, InProgress, Completed, Failed
     */
    public String status;
    /**
     * Task creation datetime
     * Required
     * Format: date-time
     */
    public String creationTime;
    /**
     * Task latest update datetime
     * Required
     * Format: date-time
     */
    public String lastModifiedTime;
    /**
     *
     */
    public ExtensionBulkUpdateTaskResult result;

    public ExtensionBulkUpdateTaskResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public ExtensionBulkUpdateTaskResource id(String id) {
        this.id = id;
        return this;
    }

    public ExtensionBulkUpdateTaskResource status(String status) {
        this.status = status;
        return this;
    }

    public ExtensionBulkUpdateTaskResource creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public ExtensionBulkUpdateTaskResource lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public ExtensionBulkUpdateTaskResource result(ExtensionBulkUpdateTaskResult result) {
        this.result = result;
        return this;
    }
}

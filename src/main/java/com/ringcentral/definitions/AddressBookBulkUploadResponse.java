package com.ringcentral.definitions;


/**
 * Information on a task for adding multiple contacts to multiple extensions
 */
public class AddressBookBulkUploadResponse {
    /**
     * Internal identifier of a task
     * Required
     */
    public String id;
    /**
     * Link for the task status retrieval
     * Required
     */
    public String uri;
    /**
     * Task status
     * Required
     * Enum: Accepted, InProgress, Completed, Failed
     */
    public String status;
    /**
     * Datetime of a task creation
     * Required
     */
    public String creationTime;
    /**
     * Datetime of a task latest update
     * Required
     */
    public String lastModifiedTime;
    /**
     *
     */
    public AddressBookBulkUploadTaskResult results;

    public AddressBookBulkUploadResponse id(String id) {
        this.id = id;
        return this;
    }

    public AddressBookBulkUploadResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    public AddressBookBulkUploadResponse status(String status) {
        this.status = status;
        return this;
    }

    public AddressBookBulkUploadResponse creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public AddressBookBulkUploadResponse lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public AddressBookBulkUploadResponse results(AddressBookBulkUploadTaskResult results) {
        this.results = results;
        return this;
    }
}

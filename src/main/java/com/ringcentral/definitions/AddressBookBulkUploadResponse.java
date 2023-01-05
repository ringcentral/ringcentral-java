package com.ringcentral.definitions;


    /**
* Information on a task for adding multiple contacts to multiple extensions
* 
*/
public class AddressBookBulkUploadResponse
{
    /**
     * Internal identifier of a task
     * Required
     */
    public String id;
    public AddressBookBulkUploadResponse id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Link for the task status retrieval
     * Required
     * Format: uri
     */
    public String uri;
    public AddressBookBulkUploadResponse uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Task status
     * Required
     * Enum: Accepted, InProgress, Completed, Failed
     */
    public String status;
    public AddressBookBulkUploadResponse status(String status)
    {
        this.status = status;
        return this;
    }

    /**
     * Datetime of a task creation
     * Required
     * Format: date-time
     */
    public String creationTime;
    public AddressBookBulkUploadResponse creationTime(String creationTime)
    {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Datetime of a task latest update
     * Required
     * Format: date-time
     */
    public String lastModifiedTime;
    public AddressBookBulkUploadResponse lastModifiedTime(String lastModifiedTime)
    {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     */
    public AddressBookBulkUploadTaskResult results;
    public AddressBookBulkUploadResponse results(AddressBookBulkUploadTaskResult results)
    {
        this.results = results;
        return this;
    }
}
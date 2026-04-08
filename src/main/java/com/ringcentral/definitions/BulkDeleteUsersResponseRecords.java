package com.ringcentral.definitions;


public class BulkDeleteUsersResponseRecords
{
    /**
     * Internal identifier of an extension
     * Example: 1162820004
     */
    public String id;
    public BulkDeleteUsersResponseRecords id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Indicates if this item was processed successfully during bulk operation.
    * If false, `bulkItemErrors` attribute contains the list of errors
     * Example: true
     */
    public Boolean bulkItemSuccessful;
    public BulkDeleteUsersResponseRecords bulkItemSuccessful(Boolean bulkItemSuccessful)
    {
        this.bulkItemSuccessful = bulkItemSuccessful;
        return this;
    }

    /**
     * The list of errors occurred during processing of particular item of bulk operation.
    * Returned only if `bulkItemSuccessful` is false
     */
    public ApiError[] bulkItemErrors;
    public BulkDeleteUsersResponseRecords bulkItemErrors(ApiError[] bulkItemErrors)
    {
        this.bulkItemErrors = bulkItemErrors;
        return this;
    }
}
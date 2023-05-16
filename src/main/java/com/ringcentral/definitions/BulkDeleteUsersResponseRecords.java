package com.ringcentral.definitions;


public class BulkDeleteUsersResponseRecords {
    /**
     * Internal identifier of an extension
     * Example: 1162820004
     */
    public String id;
    /**
     * Indicates if this item was processed successfully during bulk operation.
     * If false, `bulkItemErrors` attribute contains the list of errors
     * Example: true
     */
    public Boolean bulkItemSuccessful;
    /**
     * The list of errors occurred during processing of particular item of bulk operation.
     * Returned only if `bulkItemSuccessful` is false
     */
    public ApiError[] bulkItemErrors;

    public BulkDeleteUsersResponseRecords id(String id) {
        this.id = id;
        return this;
    }

    public BulkDeleteUsersResponseRecords bulkItemSuccessful(Boolean bulkItemSuccessful) {
        this.bulkItemSuccessful = bulkItemSuccessful;
        return this;
    }

    public BulkDeleteUsersResponseRecords bulkItemErrors(ApiError[] bulkItemErrors) {
        this.bulkItemErrors = bulkItemErrors;
        return this;
    }
}

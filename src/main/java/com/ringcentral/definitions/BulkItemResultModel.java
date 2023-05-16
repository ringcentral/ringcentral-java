package com.ringcentral.definitions;


public class BulkItemResultModel {
    /**
     * Indicates if this item was processed successfully during bulk operation.
     * If false, `bulkItemErrors` attribute contains the list of errors
     * Required
     * Example: true
     */
    public Boolean bulkItemSuccessful;
    /**
     * The list of errors occurred during processing of particular item of bulk operation.
     * Returned only if `bulkItemSuccessful` is false
     */
    public ApiError[] bulkItemErrors;

    public BulkItemResultModel bulkItemSuccessful(Boolean bulkItemSuccessful) {
        this.bulkItemSuccessful = bulkItemSuccessful;
        return this;
    }

    public BulkItemResultModel bulkItemErrors(ApiError[] bulkItemErrors) {
        this.bulkItemErrors = bulkItemErrors;
        return this;
    }
}

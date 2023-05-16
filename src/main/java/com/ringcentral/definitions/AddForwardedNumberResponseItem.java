package com.ringcentral.definitions;


public class AddForwardedNumberResponseItem {
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
    /**
     * Forwarded phone number ID. Returned only for successfully added numbers
     */
    public String id;
    /**
     * Phone number in e.164 format (with &#039;+&#039; prefix)
     * Required
     * Example: +16501234567
     */
    public String phoneNumber;
    /**
     *
     */
    public BulkOperationExtensionReference extension;

    public AddForwardedNumberResponseItem bulkItemSuccessful(Boolean bulkItemSuccessful) {
        this.bulkItemSuccessful = bulkItemSuccessful;
        return this;
    }

    public AddForwardedNumberResponseItem bulkItemErrors(ApiError[] bulkItemErrors) {
        this.bulkItemErrors = bulkItemErrors;
        return this;
    }

    public AddForwardedNumberResponseItem id(String id) {
        this.id = id;
        return this;
    }

    public AddForwardedNumberResponseItem phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public AddForwardedNumberResponseItem extension(BulkOperationExtensionReference extension) {
        this.extension = extension;
        return this;
    }
}

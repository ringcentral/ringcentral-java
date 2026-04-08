package com.ringcentral.definitions;

public class DeletePhoneNumbersResponseItem {
    /**
     * Indicates if this item was processed successfully during bulk operation. If false,
     * `bulkItemErrors` attribute contains the list of errors Required Example: true
     */
    public Boolean bulkItemSuccessful;

    public DeletePhoneNumbersResponseItem bulkItemSuccessful(Boolean bulkItemSuccessful) {
        this.bulkItemSuccessful = bulkItemSuccessful;
        return this;
    }

    /**
     * The list of errors occurred during processing of particular item of bulk operation. Returned
     * only if `bulkItemSuccessful` is false
     */
    public ApiError[] bulkItemErrors;

    public DeletePhoneNumbersResponseItem bulkItemErrors(ApiError[] bulkItemErrors) {
        this.bulkItemErrors = bulkItemErrors;
        return this;
    }

    /** Internal unique identifier of a phone number Example: 1162820004 */
    public String id;

    public DeletePhoneNumbersResponseItem id(String id) {
        this.id = id;
        return this;
    }

    /** Phone number in e.164 format (with &#039;+&#039; prefix) Example: +16501234567 */
    public String phoneNumber;

    public DeletePhoneNumbersResponseItem phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}

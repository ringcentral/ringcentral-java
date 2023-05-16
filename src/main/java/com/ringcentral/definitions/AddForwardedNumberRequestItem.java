package com.ringcentral.definitions;


public class AddForwardedNumberRequestItem {
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

    public AddForwardedNumberRequestItem phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public AddForwardedNumberRequestItem extension(BulkOperationExtensionReference extension) {
        this.extension = extension;
        return this;
    }
}

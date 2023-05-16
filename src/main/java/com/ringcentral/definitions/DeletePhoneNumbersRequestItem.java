package com.ringcentral.definitions;


/**
 * The indication of a number to be deleted - either "id" or "phoneNumber" must be specified.
 */
public class DeletePhoneNumbersRequestItem {
    /**
     * Internal unique identifier of a phone number
     * Example: 1162820004
     */
    public String id;
    /**
     * Phone number in e.164 format (with &#039;+&#039; prefix)
     * Example: +16501234567
     */
    public String phoneNumber;

    public DeletePhoneNumbersRequestItem id(String id) {
        this.id = id;
        return this;
    }

    public DeletePhoneNumbersRequestItem phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}

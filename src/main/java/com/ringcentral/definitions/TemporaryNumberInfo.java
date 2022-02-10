package com.ringcentral.definitions;


/**
 * Temporary phone number, if any. Returned for phone numbers in `Pending` porting status only
 */
public class TemporaryNumberInfo {
    /**
     * Temporary phone number identifier
     */
    public String id;
    /**
     * Temporary phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) (with &#039;+&#039; sign) format
     */
    public String phoneNumber;

    public TemporaryNumberInfo id(String id) {
        this.id = id;
        return this;
    }

    public TemporaryNumberInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}

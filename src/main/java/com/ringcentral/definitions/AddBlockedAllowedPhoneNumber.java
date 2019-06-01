package com.ringcentral.definitions;


// Updates either blocked or allowed phone number list with a new phone number.
public class AddBlockedAllowedPhoneNumber {
    /**
     * A blocked/allowed phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format
     */
    public String phoneNumber;
    /**
     * Custom name of a blocked/allowed phone number
     */
    public String label;
    /**
     * Status of a phone number
     * Default: Blocked
     * Enum: Blocked, Allowed
     */
    public String status;

    public AddBlockedAllowedPhoneNumber phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public AddBlockedAllowedPhoneNumber label(String label) {
        this.label = label;
        return this;
    }

    public AddBlockedAllowedPhoneNumber status(String status) {
        this.status = status;
        return this;
    }

}

package com.ringcentral.definitions;


/**
 * Target caller information
 */
public class BaseCallLogToParty {
    /**
     * Dialed phone number without any format modifications. Returned for outbound calls
     */
    public String dialedPhoneNumber;

    public BaseCallLogToParty dialedPhoneNumber(String dialedPhoneNumber) {
        this.dialedPhoneNumber = dialedPhoneNumber;
        return this;
    }
}

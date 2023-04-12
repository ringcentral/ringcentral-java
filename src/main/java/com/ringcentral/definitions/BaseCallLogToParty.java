package com.ringcentral.definitions;


/**
 * Target caller info
 */
public class BaseCallLogToParty {
    /**
     * The dialed phone number without modifications. Returned for outbound calls and Overlay accounts
     */
    public String dialedPhoneNumber;

    public BaseCallLogToParty dialedPhoneNumber(String dialedPhoneNumber) {
        this.dialedPhoneNumber = dialedPhoneNumber;
        return this;
    }
}

package com.ringcentral.definitions;


/**
 * Sender/initiator caller info
 */
public class BaseCallLogFromParty {
    /**
     * The dialer phone number without modifications. Returned for inbound calls and Overlay accounts
     */
    public String dialerPhoneNumber;

    public BaseCallLogFromParty dialerPhoneNumber(String dialerPhoneNumber) {
        this.dialerPhoneNumber = dialerPhoneNumber;
        return this;
    }
}

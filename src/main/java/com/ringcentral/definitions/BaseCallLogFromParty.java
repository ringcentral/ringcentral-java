package com.ringcentral.definitions;


/**
 * Sender/initiator caller information
 */
public class BaseCallLogFromParty {
    /**
     * Dialer phone number without any format modifications. Returned for inbound calls
     */
    public String dialerPhoneNumber;

    public BaseCallLogFromParty dialerPhoneNumber(String dialerPhoneNumber) {
        this.dialerPhoneNumber = dialerPhoneNumber;
        return this;
    }
}

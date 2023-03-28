package com.ringcentral.definitions;


/**
 * Query parameters for operation getBridgeByPstnPin
 */
public class GetBridgeByPstnPinParameters {
    /**
     * Phone number to find a phone group for PSTN PIN. If it is not specified, then the default phone group will be used.
     */
    public String phoneNumber;
    /**
     * Bridge hash password
     */
    public String pw;

    public GetBridgeByPstnPinParameters phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public GetBridgeByPstnPinParameters pw(String pw) {
        this.pw = pw;
        return this;
    }
}

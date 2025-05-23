package com.ringcentral.definitions;


/**
 * Query parameters for operation getBridgeByPstnPin
 */
public class GetBridgeByPstnPinParameters {
    /**
     * Bridge hash password
     */
    public String pw;
    /**
     * Phone number to find a phone group for PSTN PIN. If it is not specified, then the default phone group will be used.
     */
    public String phoneNumber;

    public GetBridgeByPstnPinParameters pw(String pw) {
        this.pw = pw;
        return this;
    }

    public GetBridgeByPstnPinParameters phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}

package com.ringcentral.definitions;


/**
 * Query parameters for operation getBridgeByWebPin
 */
public class GetBridgeByWebPinParameters {
    /**
     * Bridge hash password
     */
    public String pw;

    public GetBridgeByWebPinParameters pw(String pw) {
        this.pw = pw;
        return this;
    }
}

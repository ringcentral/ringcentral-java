package com.ringcentral.definitions;


/**
 * Query parameters for operation getBridge
 */
public class GetBridgeParameters {
    /**
     * Bridge hash password
     */
    public String pw;

    public GetBridgeParameters pw(String pw) {
        this.pw = pw;
        return this;
    }
}

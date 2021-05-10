package com.ringcentral.definitions;


public class BridgeTargetRequest {
    /**
     * Internal identifier of a call session to be connected to (bridged)
     * Required
     */
    public String telephonySessionId;
    /**
     * Internal identifier of a call party to be connected to (bridged)
     * Required
     */
    public String partyId;

    public BridgeTargetRequest telephonySessionId(String telephonySessionId) {
        this.telephonySessionId = telephonySessionId;
        return this;
    }

    public BridgeTargetRequest partyId(String partyId) {
        this.partyId = partyId;
        return this;
    }
}

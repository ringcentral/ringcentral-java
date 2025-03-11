package com.ringcentral.definitions;


public class HoldCallPartyRequest {
    /**
     * Protocol for hold mode initiation
     * Default: Auto
     * Enum: Auto, RC, BroadWorks, DisconnectHolder, BroadWorksOrDisconnectHolder
     */
    public String proto;

    public HoldCallPartyRequest proto(String proto) {
        this.proto = proto;
        return this;
    }
}

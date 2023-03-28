package com.ringcentral.definitions;


public class AddPartyRequest {
    /**
     * Internal identifier of a call session
     * Required
     */
    public String sessionId;
    /**
     * Internal identifier of a party that should be added to the call session
     * Required
     */
    public String partyId;

    public AddPartyRequest sessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    public AddPartyRequest partyId(String partyId) {
        this.partyId = partyId;
        return this;
    }
}

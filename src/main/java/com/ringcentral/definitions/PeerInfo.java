package com.ringcentral.definitions;


// Peer session/party details. Valid in 'Gone' state of a call
public class PeerInfo {
    /**
     *
     */
    public String sessionId;
    /**
     *
     */
    public String telephonySessionId;
    /**
     *
     */
    public String partyId;

    public PeerInfo sessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    public PeerInfo telephonySessionId(String telephonySessionId) {
        this.telephonySessionId = telephonySessionId;
        return this;
    }

    public PeerInfo partyId(String partyId) {
        this.partyId = partyId;
        return this;
    }
}

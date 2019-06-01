package com.ringcentral.definitions;


// Peer session / party data. Valid in Gone state only
public class PeerInfo {
    /**
     *
     */
    public String sessionId;
    /**
     *
     */
    public String partyId;

    public PeerInfo sessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    public PeerInfo partyId(String partyId) {
        this.partyId = partyId;
        return this;
    }

}

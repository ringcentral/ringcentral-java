package com.ringcentral.definitions;


public class PartyUpdateInfo {
    /**
     * True if the party is muted. False - otherwise
     */
    public Boolean muted;
    /**
     * True if party is not connected to a session voice conference. False - otherwise
     */
    public Boolean standAlone;

    public PartyUpdateInfo muted(Boolean muted) {
        this.muted = muted;
        return this;
    }

    public PartyUpdateInfo standAlone(Boolean standAlone) {
        this.standAlone = standAlone;
        return this;
    }

}

package com.ringcentral.definitions;


public class CallSessionObject {
    /**
     * Internal identifier of a call session
     */
    public String id;
    /**
     * Initial data of a call session
     */
    public OriginInfo origin;
    /**
     * For calls of 'Conference' type only
     */
    public String voiceCallToken;
    /**
     * Information on a party of a call session
     */
    public CallParty parties;
    /**
     * Date and time of the latest session update represented in Unix time format
     */
    public String creationTime;

    public CallSessionObject id(String id) {
        this.id = id;
        return this;
    }

    public CallSessionObject origin(OriginInfo origin) {
        this.origin = origin;
        return this;
    }

    public CallSessionObject voiceCallToken(String voiceCallToken) {
        this.voiceCallToken = voiceCallToken;
        return this;
    }

    public CallSessionObject parties(CallParty parties) {
        this.parties = parties;
        return this;
    }

    public CallSessionObject creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

}

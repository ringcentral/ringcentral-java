package com.ringcentral.definitions;


public class ActiveCallInfoWithoutSIP {
    /**
     * Internal identifier of a call
     */
    public String id;
    /**
     * Call direction
     * Enum: Inbound, Outbound
     */
    public String direction;
    /**
     * Phone number or extension number of a caller. For GCM transport type '_from' property should be used
     */
    public String from;
    /**
     * Name of a caller
     */
    public String fromName;
    /**
     * Phone number or extension number of a callee
     */
    public String to;
    /**
     * Name of a callee
     */
    public String toName;
    /**
     * Time when the call is actually started
     */
    public String startTime;
    /**
     * Telephony call status
     * Enum: NoCall, CallConnected, Ringing, OnHold, ParkedCall
     */
    public String telephonyStatus;
    /**
     * Internal identifier of a call session
     */
    public String sessionId;
    /**
     * Type of call termination. Supported for calls in 'NoCall' status. If the returned termination type is 'intermediate' it means the call is not actually ended, the connection is established on one of the devices
     * Enum: final, intermediate
     */
    public String terminationType;

    public ActiveCallInfoWithoutSIP id(String id) {
        this.id = id;
        return this;
    }

    public ActiveCallInfoWithoutSIP direction(String direction) {
        this.direction = direction;
        return this;
    }

    public ActiveCallInfoWithoutSIP from(String from) {
        this.from = from;
        return this;
    }

    public ActiveCallInfoWithoutSIP fromName(String fromName) {
        this.fromName = fromName;
        return this;
    }

    public ActiveCallInfoWithoutSIP to(String to) {
        this.to = to;
        return this;
    }

    public ActiveCallInfoWithoutSIP toName(String toName) {
        this.toName = toName;
        return this;
    }

    public ActiveCallInfoWithoutSIP startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public ActiveCallInfoWithoutSIP telephonyStatus(String telephonyStatus) {
        this.telephonyStatus = telephonyStatus;
        return this;
    }

    public ActiveCallInfoWithoutSIP sessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    public ActiveCallInfoWithoutSIP terminationType(String terminationType) {
        this.terminationType = terminationType;
        return this;
    }

}

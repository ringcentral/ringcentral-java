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
     * Identifies if a call belongs to the call queue
     */
    public Boolean queueCall;
    /**
     * Phone number or extension number of a caller. For GCM transport type &#039;_from&#039; property should be used
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
     * Internal identifier of a call party
     */
    public String partyId;
    /**
     * Time when the call is actually started
     */
    public String startTime;
    /**
     * Internal identifier of a call session
     */
    public String sessionId;
    /**
     * Telephony call status
     * Enum: NoCall, CallConnected, Ringing, OnHold, ParkedCall
     */
    public String telephonyStatus;
    /**
     * Telephony identifier of a call session
     */
    public String telephonySessionId;
    /**
     * Type of call termination. Supported for calls in &#039;NoCall&#039; status. If the returned termination type is &#039;intermediate&#039; it means the call is not actually ended, the connection is established on one of the devices
     * Enum: final, intermediate
     */
    public String terminationType;
    /**
     *
     */
    public CallInfoCQ callInfo;

    public ActiveCallInfoWithoutSIP id(String id) {
        this.id = id;
        return this;
    }

    public ActiveCallInfoWithoutSIP direction(String direction) {
        this.direction = direction;
        return this;
    }

    public ActiveCallInfoWithoutSIP queueCall(Boolean queueCall) {
        this.queueCall = queueCall;
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

    public ActiveCallInfoWithoutSIP partyId(String partyId) {
        this.partyId = partyId;
        return this;
    }

    public ActiveCallInfoWithoutSIP startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public ActiveCallInfoWithoutSIP sessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    public ActiveCallInfoWithoutSIP telephonyStatus(String telephonyStatus) {
        this.telephonyStatus = telephonyStatus;
        return this;
    }

    public ActiveCallInfoWithoutSIP telephonySessionId(String telephonySessionId) {
        this.telephonySessionId = telephonySessionId;
        return this;
    }

    public ActiveCallInfoWithoutSIP terminationType(String terminationType) {
        this.terminationType = terminationType;
        return this;
    }

    public ActiveCallInfoWithoutSIP callInfo(CallInfoCQ callInfo) {
        this.callInfo = callInfo;
        return this;
    }
}

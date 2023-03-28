package com.ringcentral.definitions;


public class ActiveCallInfo {
    /**
     *
     */
    public String id;
    /**
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
     * Time when the call is actually started
     * Format: date-time
     */
    public String startTime;
    /**
     * Telephony presence status
     * Enum: NoCall, CallConnected, Ringing, OnHold, ParkedCall
     */
    public String telephonyStatus;
    /**
     *
     */
    public DetailedCallInfo sipData;
    /**
     *
     */
    public String sessionId;
    /**
     * Telephony identifier of a call session
     */
    public String telephonySessionId;
    /**
     * Extension ID of the call owner on whose behalf a call is performed
     */
    public String onBehalfOf;
    /**
     * Internal identifier of a call party
     */
    public String partyId;
    /**
     *
     */
    public String terminationType;
    /**
     *
     */
    public CallInfoCQ callInfo;

    public ActiveCallInfo id(String id) {
        this.id = id;
        return this;
    }

    public ActiveCallInfo direction(String direction) {
        this.direction = direction;
        return this;
    }

    public ActiveCallInfo queueCall(Boolean queueCall) {
        this.queueCall = queueCall;
        return this;
    }

    public ActiveCallInfo from(String from) {
        this.from = from;
        return this;
    }

    public ActiveCallInfo fromName(String fromName) {
        this.fromName = fromName;
        return this;
    }

    public ActiveCallInfo to(String to) {
        this.to = to;
        return this;
    }

    public ActiveCallInfo toName(String toName) {
        this.toName = toName;
        return this;
    }

    public ActiveCallInfo startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public ActiveCallInfo telephonyStatus(String telephonyStatus) {
        this.telephonyStatus = telephonyStatus;
        return this;
    }

    public ActiveCallInfo sipData(DetailedCallInfo sipData) {
        this.sipData = sipData;
        return this;
    }

    public ActiveCallInfo sessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    public ActiveCallInfo telephonySessionId(String telephonySessionId) {
        this.telephonySessionId = telephonySessionId;
        return this;
    }

    public ActiveCallInfo onBehalfOf(String onBehalfOf) {
        this.onBehalfOf = onBehalfOf;
        return this;
    }

    public ActiveCallInfo partyId(String partyId) {
        this.partyId = partyId;
        return this;
    }

    public ActiveCallInfo terminationType(String terminationType) {
        this.terminationType = terminationType;
        return this;
    }

    public ActiveCallInfo callInfo(CallInfoCQ callInfo) {
        this.callInfo = callInfo;
        return this;
    }
}

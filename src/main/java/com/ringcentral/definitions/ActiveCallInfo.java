package com.ringcentral.definitions;


public class ActiveCallInfo
{
    /**
     */
    public String id;
    public ActiveCallInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Enum: Inbound, Outbound
     */
    public String direction;
    public ActiveCallInfo direction(String direction)
    {
        this.direction = direction;
        return this;
    }

    /**
     * Identifies if a call belongs to the call queue
     */
    public Boolean queueCall;
    public ActiveCallInfo queueCall(Boolean queueCall)
    {
        this.queueCall = queueCall;
        return this;
    }

    /**
     * Phone number or extension number of a caller. For GCM transport type &#039;_from&#039; property should be used
     */
    public String from;
    public ActiveCallInfo from(String from)
    {
        this.from = from;
        return this;
    }

    /**
     * Name of a caller
     */
    public String fromName;
    public ActiveCallInfo fromName(String fromName)
    {
        this.fromName = fromName;
        return this;
    }

    /**
     * Phone number or extension number of a callee
     */
    public String to;
    public ActiveCallInfo to(String to)
    {
        this.to = to;
        return this;
    }

    /**
     * Name of a callee
     */
    public String toName;
    public ActiveCallInfo toName(String toName)
    {
        this.toName = toName;
        return this;
    }

    /**
     * Time when the call is actually started
     * Format: date-time
     */
    public String startTime;
    public ActiveCallInfo startTime(String startTime)
    {
        this.startTime = startTime;
        return this;
    }

    /**
     * Telephony presence status
     * Enum: NoCall, CallConnected, Ringing, OnHold, ParkedCall
     */
    public String telephonyStatus;
    public ActiveCallInfo telephonyStatus(String telephonyStatus)
    {
        this.telephonyStatus = telephonyStatus;
        return this;
    }

    /**
     */
    public DetailedCallInfo sipData;
    public ActiveCallInfo sipData(DetailedCallInfo sipData)
    {
        this.sipData = sipData;
        return this;
    }

    /**
     */
    public String sessionId;
    public ActiveCallInfo sessionId(String sessionId)
    {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * Telephony identifier of a call session
     */
    public String telephonySessionId;
    public ActiveCallInfo telephonySessionId(String telephonySessionId)
    {
        this.telephonySessionId = telephonySessionId;
        return this;
    }

    /**
     * Extension ID of the call owner on whose behalf a call is performed
     */
    public String onBehalfOf;
    public ActiveCallInfo onBehalfOf(String onBehalfOf)
    {
        this.onBehalfOf = onBehalfOf;
        return this;
    }

    /**
     * Internal identifier of a call party
     */
    public String partyId;
    public ActiveCallInfo partyId(String partyId)
    {
        this.partyId = partyId;
        return this;
    }

    /**
     */
    public String terminationType;
    public ActiveCallInfo terminationType(String terminationType)
    {
        this.terminationType = terminationType;
        return this;
    }

    /**
     */
    public CallInfoCQ callInfo;
    public ActiveCallInfo callInfo(CallInfoCQ callInfo)
    {
        this.callInfo = callInfo;
        return this;
    }
}
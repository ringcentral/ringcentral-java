package com.ringcentral.definitions;


public class CompanyCallLogRecord
{
    /**
     * Internal identifier of a cal log record
     */
    public String id;
    public CompanyCallLogRecord id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Canonical URI of a call log record
     * Format: uri
     */
    public String uri;
    public CompanyCallLogRecord uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Internal identifier of a call session
     */
    public String sessionId;
    public CompanyCallLogRecord sessionId(String sessionId)
    {
        this.sessionId = sessionId;
        return this;
    }

    /**
     */
    public ExtensionInfoCallLog extension;
    public CompanyCallLogRecord extension(ExtensionInfoCallLog extension)
    {
        this.extension = extension;
        return this;
    }

    /**
     * Telephony identifier of a call session
     */
    public String telephonySessionId;
    public CompanyCallLogRecord telephonySessionId(String telephonySessionId)
    {
        this.telephonySessionId = telephonySessionId;
        return this;
    }

    /**
     * The type of a call transport. &#039;PSTN&#039; indicates that a call leg was initiated
    * from the PSTN network provider; &#039;VoIP&#039; - from an RC phone.
     * Enum: PSTN, VoIP
     */
    public String transport;
    public CompanyCallLogRecord transport(String transport)
    {
        this.transport = transport;
        return this;
    }

    /**
     */
    public CallLogCallerInfo from;
    public CompanyCallLogRecord from(CallLogCallerInfo from)
    {
        this.from = from;
        return this;
    }

    /**
     */
    public CallLogCallerInfo to;
    public CompanyCallLogRecord to(CallLogCallerInfo to)
    {
        this.to = to;
        return this;
    }

    /**
     * The type of a call
     * Enum: Voice, Fax
     */
    public String type;
    public CompanyCallLogRecord type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * The direction of a call
     * Enum: Inbound, Outbound
     */
    public String direction;
    public CompanyCallLogRecord direction(String direction)
    {
        this.direction = direction;
        return this;
    }

    /**
     */
    public CallLogRecordMessage message;
    public CompanyCallLogRecord message(CallLogRecordMessage message)
    {
        this.message = message;
        return this;
    }

    /**
     */
    public CallLogDelegateInfo delegate;
    public CompanyCallLogRecord delegate(CallLogDelegateInfo delegate)
    {
        this.delegate = delegate;
        return this;
    }

    /**
     * Indicates whether the record is deleted. Returned for deleted records, for ISync requests
     */
    public Boolean deleted;
    public CompanyCallLogRecord deleted(Boolean deleted)
    {
        this.deleted = deleted;
        return this;
    }

    /**
     * The internal action corresponding to the call operation
     * Enum: Unknown, Phone Call, Phone Login, Calling Card, VoIP Call, Paging, Hunting, Call Park, Monitoring, Text Relay, External Application, Park Location, CallOut-CallMe, Conference Call, Move, RC Meetings, Accept Call, FindMe, FollowMe, RingMe, Transfer, Call Return, Ring Directly, RingOut Web, RingOut PC, RingOut Mobile, 411 Info, Emergency, E911 Update, Support, Incoming Fax, Outgoing Fax
     */
    public String action;
    public CompanyCallLogRecord action(String action)
    {
        this.action = action;
        return this;
    }

    /**
     * The result of the call operation
     * Enum: Unknown, Accepted, Call connected, In Progress, Voicemail, Reply, Missed, Busy, Rejected, No Answer, Hang Up, Blocked, ResultEmpty, Suspended account, Call Failed, Call Failure, Internal Error, IP Phone Offline, No Calling Credit, Not Allowed, Restricted Number, Wrong Number, Answered Not Accepted, Stopped, Poor Line Quality, International Disabled, International Restricted, Abandoned, Declined, Received, Fax on Demand, Partial Receive, Receive Error, Fax Receipt Error, Fax Partially Sent, No fax machine, Send Error, Sent, Fax Not Sent, Fax Poor Line
     */
    public String result;
    public CompanyCallLogRecord result(String result)
    {
        this.result = result;
        return this;
    }

    /**
     */
    public String reasonDescription;
    public CompanyCallLogRecord reasonDescription(String reasonDescription)
    {
        this.reasonDescription = reasonDescription;
        return this;
    }

    /**
     * The call start datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
     * Format: date-time
     */
    public String startTime;
    public CompanyCallLogRecord startTime(String startTime)
    {
        this.startTime = startTime;
        return this;
    }

    /**
     * Call duration in seconds
     * Format: int32
     */
    public Long duration;
    public CompanyCallLogRecord duration(Long duration)
    {
        this.duration = duration;
        return this;
    }

    /**
     */
    public CallLogRecordingInfo recording;
    public CompanyCallLogRecord recording(CallLogRecordingInfo recording)
    {
        this.recording = recording;
        return this;
    }

    /**
     * Indicates that the recording is too short and therefore wouldn&#039;t be returned. The flag is not returned if the value is false
     */
    public Boolean shortRecording;
    public CompanyCallLogRecord shortRecording(Boolean shortRecording)
    {
        this.shortRecording = shortRecording;
        return this;
    }

    /**
     * For &#039;Detailed&#039; view only. Leg description
     */
    public CallLogRecordLegInfo[] legs;
    public CompanyCallLogRecord legs(CallLogRecordLegInfo[] legs)
    {
        this.legs = legs;
        return this;
    }

    /**
     */
    public BillingInfo billing;
    public CompanyCallLogRecord billing(BillingInfo billing)
    {
        this.billing = billing;
        return this;
    }

    /**
     * For &#039;Detailed&#039; view only. The datetime when the call log record
    * was modified in (ISO 8601)[https://en.wikipedia.org/wiki/ISO_8601] format
    * including timezone, for example *2016-03-10T18:07:52.534Z*
     * Format: date-time
     */
    public String lastModifiedTime;
    public CompanyCallLogRecord lastModifiedTime(String lastModifiedTime)
    {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * The internal type of the call
     * Enum: Local, LongDistance, International, Sip, RingMe, RingOut, Usual, TollFreeNumber, VerificationNumber, Vma, LocalNumber, ImsOutgoing, ImsIncoming
     */
    public String internalType;
    public CompanyCallLogRecord internalType(String internalType)
    {
        this.internalType = internalType;
        return this;
    }
}
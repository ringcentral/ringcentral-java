package com.ringcentral.definitions;


public class CompanyCallLogRecord {
    /**
     * Internal identifier of a cal log record
     */
    public String id;
    /**
     * Canonical URI of a call log record
     * Format: uri
     */
    public String uri;
    /**
     * Internal identifier of a call session
     */
    public String sessionId;
    /**
     *
     */
    public ExtensionInfoCallLog extension;
    /**
     * Telephony identifier of a call session
     */
    public String telephonySessionId;
    /**
     * Call session identifier, required for Telephony REST API
     */
    public String sipUuidInfo;
    /**
     *
     */
    public CompanyCallLogRecordTransferTarget transferTarget;
    /**
     *
     */
    public CompanyCallLogRecordTransferee transferee;
    /**
     * Internal Identifier of Participant
     */
    public String partyId;
    /**
     * The type of a call transport. &#039;PSTN&#039; indicates that a call leg was initiated
     * from the PSTN network provider; &#039;VoIP&#039; - from an RC phone.
     * Enum: PSTN, VoIP
     */
    public String transport;
    /**
     *
     */
    public CallLogCallerInfo from;
    /**
     *
     */
    public CallLogCallerInfo to;
    /**
     * The type of a call
     * Enum: Voice, Fax
     */
    public String type;
    /**
     * The direction of a call
     * Enum: Inbound, Outbound
     */
    public String direction;
    /**
     *
     */
    public CallLogRecordMessage message;
    /**
     *
     */
    public CallLogDelegateInfo delegate;
    /**
     * Indicates whether the record is deleted. Returned for deleted records, for ISync requests
     */
    public Boolean deleted;
    /**
     * The internal action corresponding to the call operation
     * Enum: Unknown, Phone Call, Phone Login, Calling Card, VoIP Call, Paging, Hunting, Call Park, Monitoring, Text Relay, External Application, Park Location, CallOut-CallMe, Conference Call, Move, RC Meetings, Accept Call, FindMe, FollowMe, RingMe, Transfer, Call Return, Ring Directly, RingOut Web, RingOut PC, RingOut Mobile, 411 Info, Emergency, E911 Update, Support, Incoming Fax, Outgoing Fax
     */
    public String action;
    /**
     * The result of the call operation
     * Enum: Unknown, Accepted, Call connected, In Progress, Voicemail, Reply, Missed, Busy, Rejected, No Answer, Hang Up, Blocked, ResultEmpty, Suspended account, Call Failed, Call Failure, Internal Error, IP Phone Offline, No Calling Credit, Not Allowed, Restricted Number, Wrong Number, Answered Not Accepted, Stopped, Poor Line Quality, International Disabled, International Restricted, Abandoned, Declined, Received, Fax on Demand, Partial Receive, Receive Error, Fax Receipt Error, Fax Partially Sent, No fax machine, Send Error, Sent, Fax Not Sent, Fax Poor Line
     */
    public String result;
    /**
     *
     */
    public String reasonDescription;
    /**
     * The call start datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
     * Format: date-time
     */
    public String startTime;
    /**
     * Call duration in seconds
     * Format: int32
     */
    public Long duration;
    /**
     *
     */
    public CallLogRecordingInfo recording;
    /**
     * Indicates that the recording is too short and therefore wouldn&#039;t be returned. The flag is not returned if the value is false
     */
    public Boolean shortRecording;
    /**
     * For &#039;Detailed&#039; view only. Leg description
     */
    public CallLogRecordLegInfo[] legs;
    /**
     *
     */
    public BillingInfo billing;
    /**
     * For &#039;Detailed&#039; view only. The datetime when the call log record
     * was modified in (ISO 8601)[https://en.wikipedia.org/wiki/ISO_8601] format
     * including timezone, for example *2016-03-10T18:07:52.534Z*
     * Format: date-time
     */
    public String lastModifiedTime;
    /**
     * The internal type of the call
     * Enum: Local, LongDistance, International, Sip, RingMe, RingOut, Usual, TollFreeNumber, VerificationNumber, Vma, LocalNumber, ImsOutgoing, ImsIncoming
     */
    public String internalType;

    public CompanyCallLogRecord id(String id) {
        this.id = id;
        return this;
    }

    public CompanyCallLogRecord uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CompanyCallLogRecord sessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    public CompanyCallLogRecord extension(ExtensionInfoCallLog extension) {
        this.extension = extension;
        return this;
    }

    public CompanyCallLogRecord telephonySessionId(String telephonySessionId) {
        this.telephonySessionId = telephonySessionId;
        return this;
    }

    public CompanyCallLogRecord sipUuidInfo(String sipUuidInfo) {
        this.sipUuidInfo = sipUuidInfo;
        return this;
    }

    public CompanyCallLogRecord transferTarget(CompanyCallLogRecordTransferTarget transferTarget) {
        this.transferTarget = transferTarget;
        return this;
    }

    public CompanyCallLogRecord transferee(CompanyCallLogRecordTransferee transferee) {
        this.transferee = transferee;
        return this;
    }

    public CompanyCallLogRecord partyId(String partyId) {
        this.partyId = partyId;
        return this;
    }

    public CompanyCallLogRecord transport(String transport) {
        this.transport = transport;
        return this;
    }

    public CompanyCallLogRecord from(CallLogCallerInfo from) {
        this.from = from;
        return this;
    }

    public CompanyCallLogRecord to(CallLogCallerInfo to) {
        this.to = to;
        return this;
    }

    public CompanyCallLogRecord type(String type) {
        this.type = type;
        return this;
    }

    public CompanyCallLogRecord direction(String direction) {
        this.direction = direction;
        return this;
    }

    public CompanyCallLogRecord message(CallLogRecordMessage message) {
        this.message = message;
        return this;
    }

    public CompanyCallLogRecord delegate(CallLogDelegateInfo delegate) {
        this.delegate = delegate;
        return this;
    }

    public CompanyCallLogRecord deleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    public CompanyCallLogRecord action(String action) {
        this.action = action;
        return this;
    }

    public CompanyCallLogRecord result(String result) {
        this.result = result;
        return this;
    }

    public CompanyCallLogRecord reasonDescription(String reasonDescription) {
        this.reasonDescription = reasonDescription;
        return this;
    }

    public CompanyCallLogRecord startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public CompanyCallLogRecord duration(Long duration) {
        this.duration = duration;
        return this;
    }

    public CompanyCallLogRecord recording(CallLogRecordingInfo recording) {
        this.recording = recording;
        return this;
    }

    public CompanyCallLogRecord shortRecording(Boolean shortRecording) {
        this.shortRecording = shortRecording;
        return this;
    }

    public CompanyCallLogRecord legs(CallLogRecordLegInfo[] legs) {
        this.legs = legs;
        return this;
    }

    public CompanyCallLogRecord billing(BillingInfo billing) {
        this.billing = billing;
        return this;
    }

    public CompanyCallLogRecord lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public CompanyCallLogRecord internalType(String internalType) {
        this.internalType = internalType;
        return this;
    }
}

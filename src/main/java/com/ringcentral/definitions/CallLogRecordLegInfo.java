package com.ringcentral.definitions;


public class CallLogRecordLegInfo {
    /**
     * The internal action corresponding to the call operation
     * Enum: Unknown, Phone Call, Phone Login, Calling Card, VoIP Call, Paging, Hunting, Call Park, Monitoring, Text Relay, External Application, Park Location, CallOut-CallMe, Conference Call, Move, RC Meetings, Accept Call, FindMe, FollowMe, RingMe, Transfer, Call Return, Ring Directly, RingOut Web, RingOut PC, RingOut Mobile, 411 Info, Emergency, E911 Update, Support, Incoming Fax, Outgoing Fax
     */
    public String action;
    /**
     * The direction of a call
     * Enum: Inbound, Outbound
     */
    public String direction;
    /**
     *
     */
    public BillingInfo billing;
    /**
     *
     */
    public CallLogDelegateInfo delegate;
    /**
     * Internal identifier of an extension
     */
    public String extensionId;
    /**
     * Call duration in seconds
     * Format: int32
     */
    public Long duration;
    /**
     *
     */
    public ExtensionInfoCallLog extension;
    /**
     * Leg type
     * Enum: SipForwarding, ServiceMinus2, ServiceMinus3, PstnToSip, Accept, FindMe, FollowMe, TestCall, FaxSent, CallBack, CallingCard, RingDirectly, RingOutWebToSubscriber, RingOutWebToCaller, SipToPstnMetered, RingOutClientToSubscriber, RingOutClientToCaller, RingMe, TransferCall, SipToPstnUnmetered, RingOutDeviceToSubscriber, RingOutDeviceToCaller, RingOutOneLegToCaller, ExtensionToExtension, CallPark, PagingServer, Hunting, OutgoingFreeSpDl, ParkLocation, ConferenceCall, MobileApp, Monitoring, MoveToConference, Unknown
     */
    public String legType;
    /**
     * The call start datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
     * Format: date-time
     */
    public String startTime;
    /**
     * The type of a call
     * Enum: Voice, Fax
     */
    public String type;
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
     *
     */
    public CallLogCallerInfo from;
    /**
     *
     */
    public CallLogCallerInfo to;
    /**
     * The type of a call transport. &#039;PSTN&#039; indicates that a call leg was initiated
     * from the PSTN network provider; &#039;VoIP&#039; - from an RC phone.
     * Enum: PSTN, VoIP
     */
    public String transport;
    /**
     *
     */
    public CallLogRecordingInfo recording;
    /**
     * Indicates that the recording is too short and therefore wouldn&#039;t be returned. The flag is not returned if the value is false
     */
    public Boolean shortRecording;
    /**
     * Returned for &#039;Detailed&#039; call log. Specifies if the leg is master-leg
     */
    public Boolean master;
    /**
     *
     */
    public CallLogRecordMessage message;
    /**
     * Telephony identifier of a call session
     */
    public String telephonySessionId;
    /**
     * The internal type of the call
     * Enum: Local, LongDistance, International, Sip, RingMe, RingOut, Usual, TollFreeNumber, VerificationNumber, Vma, LocalNumber, ImsOutgoing, ImsIncoming
     */
    public String internalType;

    public CallLogRecordLegInfo action(String action) {
        this.action = action;
        return this;
    }

    public CallLogRecordLegInfo direction(String direction) {
        this.direction = direction;
        return this;
    }

    public CallLogRecordLegInfo billing(BillingInfo billing) {
        this.billing = billing;
        return this;
    }

    public CallLogRecordLegInfo delegate(CallLogDelegateInfo delegate) {
        this.delegate = delegate;
        return this;
    }

    public CallLogRecordLegInfo extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public CallLogRecordLegInfo duration(Long duration) {
        this.duration = duration;
        return this;
    }

    public CallLogRecordLegInfo extension(ExtensionInfoCallLog extension) {
        this.extension = extension;
        return this;
    }

    public CallLogRecordLegInfo legType(String legType) {
        this.legType = legType;
        return this;
    }

    public CallLogRecordLegInfo startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public CallLogRecordLegInfo type(String type) {
        this.type = type;
        return this;
    }

    public CallLogRecordLegInfo result(String result) {
        this.result = result;
        return this;
    }

    public CallLogRecordLegInfo reasonDescription(String reasonDescription) {
        this.reasonDescription = reasonDescription;
        return this;
    }

    public CallLogRecordLegInfo from(CallLogCallerInfo from) {
        this.from = from;
        return this;
    }

    public CallLogRecordLegInfo to(CallLogCallerInfo to) {
        this.to = to;
        return this;
    }

    public CallLogRecordLegInfo transport(String transport) {
        this.transport = transport;
        return this;
    }

    public CallLogRecordLegInfo recording(CallLogRecordingInfo recording) {
        this.recording = recording;
        return this;
    }

    public CallLogRecordLegInfo shortRecording(Boolean shortRecording) {
        this.shortRecording = shortRecording;
        return this;
    }

    public CallLogRecordLegInfo master(Boolean master) {
        this.master = master;
        return this;
    }

    public CallLogRecordLegInfo message(CallLogRecordMessage message) {
        this.message = message;
        return this;
    }

    public CallLogRecordLegInfo telephonySessionId(String telephonySessionId) {
        this.telephonySessionId = telephonySessionId;
        return this;
    }

    public CallLogRecordLegInfo internalType(String internalType) {
        this.internalType = internalType;
        return this;
    }
}

package com.ringcentral.definitions;


/**
 * Call leg record
 */
public class CallLogRecordLegInfo {
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
    public CallLogRecordLegInfoTransferTarget transferTarget;
    /**
     *
     */
    public CallLogRecordLegInfoTransferee transferee;
    /**
     * Internal Identifier of Participant
     */
    public String partyId;
    /**
     * The type of a call transport. &#039;PSTN&#039; indicates that a call leg was initiated
     * from the PSTN network provider; &#039;VoIP&#039; - from an RC phone.
     * Required
     * Enum: PSTN, VoIP
     */
    public String transport;
    /**
     *
     */
    public CallLogFromParty from;
    /**
     *
     */
    public CallLogToParty to;
    /**
     * The type of a call
     * Required
     * Enum: Voice, Fax
     */
    public String type;
    /**
     * The direction of a call
     * Required
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
     * The internal action corresponding to the call operation
     * Required
     * Enum: Accept Call, Barge In Call, Call Park, Call Return, CallOut-CallMe, Calling Card, Conference Call, E911 Update, Emergency, External Application, FindMe, FollowMe, FreeSPDL, Hunting, Incoming Fax, Monitoring, Move, Outgoing Fax, Paging, Park Location, Phone Call, Phone Login, Pickup, RC Meetings, Ring Directly, RingMe, RingOut Mobile, RingOut PC, RingOut Web, Sip Forwarding, Support, Text Relay, Transfer, Unknown, VoIP Call
     */
    public String action;
    /**
     * The result of the call operation
     * Enum: 911, 933, Abandoned, Accepted, Answered Not Accepted, Blocked, Busy, Call Failed, Call Failure, Call connected, Carrier is not active, Declined, EDGE trunk misconfigured, Fax Not Sent, Fax Partially Sent, Fax Poor Line, Fax Receipt Error, Fax on Demand, Hang Up, IP Phone Offline, In Progress, Internal Error, International Disabled, International Restricted, Missed, No Answer, No Calling Credit, Not Allowed, Partial Receive, Phone Login, Receive Error, Received, Rejected, Reply, Restricted Number, Send Error, Sent, Sent to Voicemail, Stopped, Suspended account, Unknown, Voicemail, Wrong Number
     */
    public String result;
    /**
     * The reason of the call result:
     * * `Accepted` - The call was connected to and accepted by this number
     * * `Connected` - The call was answered, but there was no response on how to handle the call (for example, a voice mail system answered the call and did not push &quot;1&quot; to accept)
     * * `Line Busy` - The phone number you dialed was busy
     * * `Not Answered` - The phone number you dialed was not answered
     * * `No Answer` - You did not answer the call
     * * `Hang Up` - The caller hung up before the call was answered
     * * `Stopped` - This attempt was stopped because the call was answered by another phone
     * * `Internal Error` - An internal error occurred when making the call. Please try again
     * * `No Credit` - There was not enough Calling Credit on your account to make this call
     * * `Restricted Number` - The number you dialed is restricted by RingCentral
     * * `Wrong Number` - The number you dialed has either been disconnected or is not a valid phone number. Please check the number and try again
     * * `International Disabled` - International calling is not enabled on your account. Contact customer service to activate International Calling
     * * `International Restricted` - The country and/or area you attempted to call has been prohibited by your administrator
     * * `Bad Number` - An error occurred when making the call. Please check the number before trying again
     * * `Info 411 Restricted` - Calling to 411 Information Services is restricted
     * * `Customer 611 Restricted` - 611 customer service is not supported. Please contact customer service at &lt;(888) 555-1212&gt;
     * * `No Digital Line` - This DigitalLine was either not plugged in or did not have an internet connection
     * * `Failed Try Again` - Call failed. Please try again
     * * `Max Call Limit` - The number of simultaneous calls to your account has reached its limit
     * * `Too Many Calls` - The number of simultaneous calls for per DigitalLine associated with Other Phone has reached its limit. Please contact customer service
     * * `Calls Not Accepted` - Your account was not accepting calls at this time
     * * `Number Not Allowed` - The number that was dialed to access your account is not allowed
     * * `Number Blocked` - This number is in your Blocked Numbers list
     * * `Number Disabled` - The phone number and/or area you attempted to call has been prohibited by your administrator
     * * `Resource Error` - An error occurred when making the call. Please try again
     * * `Call Loop` - A call loop occurred due to an incorrect call forwarding configuration. Please check that you are not forwarding calls back to your own account
     * * `Fax Not Received` - An incoming fax could not be received because a proper connection with the sender&#039;s fax machine could not be established
     * * `Fax Partially Sent` - The fax was only partially sent. Possible explanations include phone line quality to poor to maintain the connection or the call was dropped
     * * `Fax Not Sent` - An attempt to send the fax was made, but could not connect with the receiving fax machine
     * * `Fax Poor Line` - An attempt to send the fax was made, but the phone line quality was too poor to send the fax
     * * `Fax Prepare Error` - An internal error occurred when preparing the fax. Please try again
     * * `Fax Save Error` - An internal error occurred when saving the fax. Please try again
     * * `Fax Send Error` - An error occurred when sending the fax. Please try again
     * * `Emergency Address not defined` - The call was rejected due to no E911 address
     * * `Carrier is not active` - The call was rejected due to carrier inactivity
     * * `EDGE trunk misconfigured` - The call was rejected due to error in EDGE trunk configuration
     * * `Internal Call Error` - An internal error occurred when making the call. Please try again
     * * `Receive Error` - Fax receive error
     * Enum: Accepted, Bad Number, Call Loop, Calls Not Accepted, Carrier is not active, Connected, Customer 611 Restricted, EDGE trunk misconfigured, Emergency Address not defined, Failed Try Again, Fax Not Received, Fax Not Sent, Fax Partially Sent, Fax Poor Line, Fax Prepare Error, Fax Save Error, Fax Send Error, Hang Up, Info 411 Restricted, Internal Call Error, Internal Error, International Disabled, International Restricted, Line Busy, Max Call Limit, No Answer, No Credit, No Digital Line, Not Answered, Number Blocked, Number Disabled, Number Not Allowed, Receive Error, Resource Error, Restricted Number, Stopped, Too Many Calls, Unknown, Wrong Number
     */
    public String reason;
    /**
     * The detailed reason description of the call result
     */
    public String reasonDescription;
    /**
     * The call start datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
     * Required
     * Format: date-time
     */
    public String startTime;
    /**
     * Call duration in seconds
     * Required
     * Format: int32
     */
    public Long duration;
    /**
     * Call duration in milliseconds
     * Required
     * Format: int32
     */
    public Long durationMs;
    /**
     *
     */
    public CallLogRecordingInfo recording;
    /**
     * Indicates that the recording is too short and therefore wouldn&#039;t be returned. The flag is not returned if the value is false
     */
    public Boolean shortRecording;
    /**
     *
     */
    public BillingInfo billing;
    /**
     * The internal type of the call
     * Enum: Local, LongDistance, International, Sip, RingMe, RingOut, Usual, TollFreeNumber, VerificationNumber, Vma, LocalNumber, ImsOutgoing, ImsIncoming
     */
    public String internalType;
    /**
     * Leg type
     * Required
     * Enum: SipForwarding, ServiceMinus2, ServiceMinus3, PstnToSip, Accept, FindMe, FollowMe, TestCall, FaxSent, CallBack, CallingCard, RingDirectly, RingOutWebToSubscriber, RingOutWebToCaller, SipToPstnMetered, RingOutClientToSubscriber, RingOutClientToCaller, RingMe, TransferCall, SipToPstnUnmetered, RingOutDeviceToSubscriber, RingOutDeviceToCaller, RingOutOneLegToCaller, ExtensionToExtension, CallPark, PagingServer, Hunting, OutgoingFreeSpDl, ParkLocation, ConferenceCall, MobileApp, MoveToConference, Unknown, MeetingsCall, SilentMonitoring, Monitoring, Pickup, ImsCall, JoinCall, TextRelay
     */
    public String legType;
    /**
     * Returned for &#039;Detailed&#039; call log. Specifies if the leg is master-leg
     */
    public Boolean master;

    public CallLogRecordLegInfo extension(ExtensionInfoCallLog extension) {
        this.extension = extension;
        return this;
    }

    public CallLogRecordLegInfo telephonySessionId(String telephonySessionId) {
        this.telephonySessionId = telephonySessionId;
        return this;
    }

    public CallLogRecordLegInfo sipUuidInfo(String sipUuidInfo) {
        this.sipUuidInfo = sipUuidInfo;
        return this;
    }

    public CallLogRecordLegInfo transferTarget(CallLogRecordLegInfoTransferTarget transferTarget) {
        this.transferTarget = transferTarget;
        return this;
    }

    public CallLogRecordLegInfo transferee(CallLogRecordLegInfoTransferee transferee) {
        this.transferee = transferee;
        return this;
    }

    public CallLogRecordLegInfo partyId(String partyId) {
        this.partyId = partyId;
        return this;
    }

    public CallLogRecordLegInfo transport(String transport) {
        this.transport = transport;
        return this;
    }

    public CallLogRecordLegInfo from(CallLogFromParty from) {
        this.from = from;
        return this;
    }

    public CallLogRecordLegInfo to(CallLogToParty to) {
        this.to = to;
        return this;
    }

    public CallLogRecordLegInfo type(String type) {
        this.type = type;
        return this;
    }

    public CallLogRecordLegInfo direction(String direction) {
        this.direction = direction;
        return this;
    }

    public CallLogRecordLegInfo message(CallLogRecordMessage message) {
        this.message = message;
        return this;
    }

    public CallLogRecordLegInfo delegate(CallLogDelegateInfo delegate) {
        this.delegate = delegate;
        return this;
    }

    public CallLogRecordLegInfo action(String action) {
        this.action = action;
        return this;
    }

    public CallLogRecordLegInfo result(String result) {
        this.result = result;
        return this;
    }

    public CallLogRecordLegInfo reason(String reason) {
        this.reason = reason;
        return this;
    }

    public CallLogRecordLegInfo reasonDescription(String reasonDescription) {
        this.reasonDescription = reasonDescription;
        return this;
    }

    public CallLogRecordLegInfo startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public CallLogRecordLegInfo duration(Long duration) {
        this.duration = duration;
        return this;
    }

    public CallLogRecordLegInfo durationMs(Long durationMs) {
        this.durationMs = durationMs;
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

    public CallLogRecordLegInfo billing(BillingInfo billing) {
        this.billing = billing;
        return this;
    }

    public CallLogRecordLegInfo internalType(String internalType) {
        this.internalType = internalType;
        return this;
    }

    public CallLogRecordLegInfo legType(String legType) {
        this.legType = legType;
        return this;
    }

    public CallLogRecordLegInfo master(Boolean master) {
        this.master = master;
        return this;
    }
}

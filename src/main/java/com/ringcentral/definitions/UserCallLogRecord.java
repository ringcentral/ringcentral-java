package com.ringcentral.definitions;


public class UserCallLogRecord {
    /**
     * Internal identifier of a cal log record
     */
    public String id;
    /**
     * Canonical URI of a call log record
     */
    public String uri;
    /**
     * Internal identifier of a call session
     */
    public String sessionId;
    /**
     * Telephony identifier of a call session
     */
    public String telephonySessionId;
    /**
     *
     */
    public CallLogCallerInfo from;
    /**
     *
     */
    public CallLogCallerInfo to;
    /**
     *
     */
    public ExtensionInfoCallLog extension;
    /**
     * Call type
     * Enum: Voice, Fax
     */
    public String type;
    /**
     * For 'Detailed' view only. Call transport
     * Enum: PSTN, VoIP
     */
    public String transport;
    /**
     * For 'Detailed' view only. Leg description
     */
    public CallLogRecordLegInfo[] legs;
    /**
     * Billing information related to the call
     */
    public BillingInfo billing;
    /**
     * Call direction
     * Enum: Inbound, Outbound
     */
    public String direction;
    /**
     * The call start datetime in (ISO 8601)[https://en.wikipedia.org/wiki/ISO_8601] format including timezone, for example 2016-03-10T18:07:52.534Z
     */
    public String startTime;
    /**
     * Indicates whether the record is deleted. Returned for deleted records, for ISync requests
     */
    public Boolean deleted;
    /**
     * Call duration in seconds
     */
    public Long duration;
    /**
     * For 'Detailed' view only. The datetime when the call log record was modified in (ISO 8601)[https://en.wikipedia.org/wiki/ISO_8601] format including timezone, for example 2016-03-10T18:07:52.534Z
     */
    public String lastModifiedTime;
    /**
     *
     */
    public CallLogRecordingInfo recording;
    /**
     * Indicates that the recording is too short and therefore wouldn't be returned. The flag is not returned if the value is false
     */
    public Boolean shortRecording;
    /**
     * Action description of the call operation
     * Enum: Unknown, Phone Login, Calling Card, VoIP Call, Phone Call, Paging, Hunting, Call Park, Monitoring, Text Relay, External Application, Park Location, CallOut-CallMe, Conference Call, Move, RC Meetings, Accept Call, FindMe, FollowMe, RingMe, Transfer, Call Return, Ring Directly, RingOut Web, RingOut PC, RingOut Mobile, Emergency, E911 Update, Support, Incoming Fax, Outgoing Fax
     */
    public String action;
    /**
     * Status description of the call operation
     * Enum: Unknown, Accepted, Call connected, In Progress, Voicemail, Reply, Missed, Busy, Rejected, No Answer, Hang Up, Blocked, Suspended account, Call Failed, Call Failure, Internal Error, IP Phone Offline, No Calling Credit, Not Allowed, Restricted Number, Wrong Number, Answered Not Accepted, Stopped, International Disabled, International Restricted, Abandoned, Declined, Received, Fax on Demand, Partial Receive, Receive Error, Fax Receipt Error, Sent, Fax Partially Sent, Send Error, Fax Not Sent, Fax Poor Line
     */
    public String result;
    /**
     * Reason of a call result:
     * * `Accepted` - The call was connected to and accepted by this number
     * * `Connected` - The call was answered, but there was no response on how to handle the call (for example, a voice mail system answered the call and did not push "1" to accept)
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
     * * `Customer 611 Restricted` - 611 customer service is not supported. Please contact customer service at (888) 555-1212
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
     * * `Fax Not Received` - An incoming fax could not be received because a proper connection with the sender's fax machine could not be established
     * * `Fax Partially Sent` - The fax was only partially sent. Possible explanations include phone line quality to poor to maintain the connection or the call was dropped
     * * `Fax Not Sent` - An attempt to send the fax was made, but could not connect with the receiving fax machine
     * * `Fax Poor Line` - An attempt to send the fax was made, but the phone line quality was too poor to send the fax
     * * `Fax Prepare Error` - An internal error occurred when preparing the fax. Please try again
     * * `Fax Save Error` - An internal error occurred when saving the fax. Please try again
     * * `Fax Send Error` - An error occurred when sending the fax. Please try again
     * Enum: Accepted, Connected, line Busy, Not Answered, No Answer, Hang Up, Stopped, Internal Error, No Credit, Restricted Number, Wrong Number, International Disabled, International Restricted, Bad Number, Info 411 Restricted, Customer 611 Restricted, No Digital Line, Failed Try Again, Max Call Limit, Too Many Calls, Calls Not Accepted, Number Not Allowed, Number Blocked, Number Disabled, Resource Error, Call Loop, Fax Not Received, Fax Partially Sent, Fax Not Sent, Fax Poor Line, Fax Prepare Error, Fax Save Error, Fax Send Error
     */
    public String reason;
    /**
     *
     */
    public String reasonDescription;

    public UserCallLogRecord id(String id) {
        this.id = id;
        return this;
    }

    public UserCallLogRecord uri(String uri) {
        this.uri = uri;
        return this;
    }

    public UserCallLogRecord sessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    public UserCallLogRecord telephonySessionId(String telephonySessionId) {
        this.telephonySessionId = telephonySessionId;
        return this;
    }

    public UserCallLogRecord from(CallLogCallerInfo from) {
        this.from = from;
        return this;
    }

    public UserCallLogRecord to(CallLogCallerInfo to) {
        this.to = to;
        return this;
    }

    public UserCallLogRecord extension(ExtensionInfoCallLog extension) {
        this.extension = extension;
        return this;
    }

    public UserCallLogRecord type(String type) {
        this.type = type;
        return this;
    }

    public UserCallLogRecord transport(String transport) {
        this.transport = transport;
        return this;
    }

    public UserCallLogRecord legs(CallLogRecordLegInfo[] legs) {
        this.legs = legs;
        return this;
    }

    public UserCallLogRecord billing(BillingInfo billing) {
        this.billing = billing;
        return this;
    }

    public UserCallLogRecord direction(String direction) {
        this.direction = direction;
        return this;
    }

    public UserCallLogRecord startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public UserCallLogRecord deleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    public UserCallLogRecord duration(Long duration) {
        this.duration = duration;
        return this;
    }

    public UserCallLogRecord lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public UserCallLogRecord recording(CallLogRecordingInfo recording) {
        this.recording = recording;
        return this;
    }

    public UserCallLogRecord shortRecording(Boolean shortRecording) {
        this.shortRecording = shortRecording;
        return this;
    }

    public UserCallLogRecord action(String action) {
        this.action = action;
        return this;
    }

    public UserCallLogRecord result(String result) {
        this.result = result;
        return this;
    }

    public UserCallLogRecord reason(String reason) {
        this.reason = reason;
        return this;
    }

    public UserCallLogRecord reasonDescription(String reasonDescription) {
        this.reasonDescription = reasonDescription;
        return this;
    }

}

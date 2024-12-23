package com.ringcentral.definitions;


public class TelephonySessionsEventPartyInfo {
    /**
     * Internal identifier of an account
     */
    public String accountId;
    /**
     * Internal identifier of an extension
     */
    public String extensionId;
    /**
     * Internal identifier of a party
     */
    public String id;
    /**
     * Call direction
     * Enum: Inbound, Outbound
     */
    public String direction;
    /**
     *
     */
    public CallPartyInfo to;
    /**
     *
     */
    public CallPartyInfo from;
    /**
     *
     */
    public RecordingInfo[] recordings;
    /**
     *
     */
    public CallStatusInfo status;
    /**
     *
     */
    public ParkInfo park;
    /**
     * Specifies if it&#039;s a queue call
     */
    public Boolean queueCall;
    /**
     * Specifies if a call was missed by the party
     */
    public Boolean missedCall;
    /**
     * If `true` then the party is not connected to a session voice
     * conference, `false` means the party is connected to other parties in a
     * session
     */
    public Boolean standAlone;
    /**
     * Specifies if a call participant is muted or not. **Note:**
     * If a call is also controlled via Hard phone or RingCentral App (not only
     * through the API by calling call control methods) then it cannot be fully
     * muted/unmuted via API only, in this case the action should be duplicated
     * via Hard phone/RC App interfaces
     */
    public Boolean muted;
    /**
     * Defines party role in Server Side Conference
     * Enum: Host, Participant
     */
    public String conferenceRole;
    /**
     *
     */
    public SipData sipData;
    /**
     *
     */
    public UiCallInfo uiCallInfo;

    public TelephonySessionsEventPartyInfo accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public TelephonySessionsEventPartyInfo extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public TelephonySessionsEventPartyInfo id(String id) {
        this.id = id;
        return this;
    }

    public TelephonySessionsEventPartyInfo direction(String direction) {
        this.direction = direction;
        return this;
    }

    public TelephonySessionsEventPartyInfo to(CallPartyInfo to) {
        this.to = to;
        return this;
    }

    public TelephonySessionsEventPartyInfo from(CallPartyInfo from) {
        this.from = from;
        return this;
    }

    public TelephonySessionsEventPartyInfo recordings(RecordingInfo[] recordings) {
        this.recordings = recordings;
        return this;
    }

    public TelephonySessionsEventPartyInfo status(CallStatusInfo status) {
        this.status = status;
        return this;
    }

    public TelephonySessionsEventPartyInfo park(ParkInfo park) {
        this.park = park;
        return this;
    }

    public TelephonySessionsEventPartyInfo queueCall(Boolean queueCall) {
        this.queueCall = queueCall;
        return this;
    }

    public TelephonySessionsEventPartyInfo missedCall(Boolean missedCall) {
        this.missedCall = missedCall;
        return this;
    }

    public TelephonySessionsEventPartyInfo standAlone(Boolean standAlone) {
        this.standAlone = standAlone;
        return this;
    }

    public TelephonySessionsEventPartyInfo muted(Boolean muted) {
        this.muted = muted;
        return this;
    }

    public TelephonySessionsEventPartyInfo conferenceRole(String conferenceRole) {
        this.conferenceRole = conferenceRole;
        return this;
    }

    public TelephonySessionsEventPartyInfo sipData(SipData sipData) {
        this.sipData = sipData;
        return this;
    }

    public TelephonySessionsEventPartyInfo uiCallInfo(UiCallInfo uiCallInfo) {
        this.uiCallInfo = uiCallInfo;
        return this;
    }
}

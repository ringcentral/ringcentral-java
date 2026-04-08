package com.ringcentral.definitions;

public class TelephonySessionsEventPartyInfo {
    /** Internal identifier of an account */
    public String accountId;

    public TelephonySessionsEventPartyInfo accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /** Internal identifier of an extension */
    public String extensionId;

    public TelephonySessionsEventPartyInfo extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    /** Internal identifier of a party */
    public String id;

    public TelephonySessionsEventPartyInfo id(String id) {
        this.id = id;
        return this;
    }

    /** Call direction Enum: Inbound, Outbound */
    public String direction;

    public TelephonySessionsEventPartyInfo direction(String direction) {
        this.direction = direction;
        return this;
    }

    /** */
    public CallPartyShortInfo to;

    public TelephonySessionsEventPartyInfo to(CallPartyShortInfo to) {
        this.to = to;
        return this;
    }

    /** */
    public CallPartyShortInfo from;

    public TelephonySessionsEventPartyInfo from(CallPartyShortInfo from) {
        this.from = from;
        return this;
    }

    /** */
    public RecordingInfo[] recordings;

    public TelephonySessionsEventPartyInfo recordings(RecordingInfo[] recordings) {
        this.recordings = recordings;
        return this;
    }

    /** */
    public CallStatusInfo status;

    public TelephonySessionsEventPartyInfo status(CallStatusInfo status) {
        this.status = status;
        return this;
    }

    /** */
    public ParkInfo park;

    public TelephonySessionsEventPartyInfo park(ParkInfo park) {
        this.park = park;
        return this;
    }

    /** Specifies if it&#039;s a queue call */
    public Boolean queueCall;

    public TelephonySessionsEventPartyInfo queueCall(Boolean queueCall) {
        this.queueCall = queueCall;
        return this;
    }

    /** Specifies if a call was missed by the party */
    public Boolean missedCall;

    public TelephonySessionsEventPartyInfo missedCall(Boolean missedCall) {
        this.missedCall = missedCall;
        return this;
    }

    /**
     * If `true` then the party is not connected to a session voice conference, `false` means the
     * party is connected to other parties in a session
     */
    public Boolean standAlone;

    public TelephonySessionsEventPartyInfo standAlone(Boolean standAlone) {
        this.standAlone = standAlone;
        return this;
    }

    /**
     * Specifies if a call participant is muted or not. **Note:** If a call is also controlled via
     * Hard phone or RingCentral App (not only through the API by calling call control methods) then
     * it cannot be fully muted/unmuted via API only, in this case the action should be duplicated
     * via Hard phone/RC App interfaces
     */
    public Boolean muted;

    public TelephonySessionsEventPartyInfo muted(Boolean muted) {
        this.muted = muted;
        return this;
    }

    /** Defines party role in Server Side Conference Enum: Host, Participant */
    public String conferenceRole;

    public TelephonySessionsEventPartyInfo conferenceRole(String conferenceRole) {
        this.conferenceRole = conferenceRole;
        return this;
    }

    /** */
    public SipData sipData;

    public TelephonySessionsEventPartyInfo sipData(SipData sipData) {
        this.sipData = sipData;
        return this;
    }

    /** */
    public UiCallInfo uiCallInfo;

    public TelephonySessionsEventPartyInfo uiCallInfo(UiCallInfo uiCallInfo) {
        this.uiCallInfo = uiCallInfo;
        return this;
    }
}

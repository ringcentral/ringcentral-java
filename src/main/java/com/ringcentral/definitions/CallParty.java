package com.ringcentral.definitions;

/** Information on a party of a call session */
public class CallParty {
    /** Internal identifier of a party */
    public String id;

    public CallParty id(String id) {
        this.id = id;
        return this;
    }

    /** Internal identifier of an account */
    public String accountId;

    public CallParty accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /** Internal identifier of an extension */
    public String extensionId;

    public CallParty extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    /** */
    public Attributes attributes;

    public CallParty attributes(Attributes attributes) {
        this.attributes = attributes;
        return this;
    }

    /** */
    public CallStatusInfo status;

    public CallParty status(CallStatusInfo status) {
        this.status = status;
        return this;
    }

    /**
     * Specifies if a call participant is muted or not. **Note:** If a call is also controlled via
     * Hard phone or RingCentral App (not only through the API by calling call control methods) then
     * it cannot be fully muted/unmuted via API only, in this case the action should be duplicated
     * via Hard phone/RC App interfaces
     */
    public Boolean muted;

    public CallParty muted(Boolean muted) {
        this.muted = muted;
        return this;
    }

    /**
     * If `true` then the party is not connected to a session voice conference, `false` means the
     * party is connected to other parties in a session
     */
    public Boolean standAlone;

    public CallParty standAlone(Boolean standAlone) {
        this.standAlone = standAlone;
        return this;
    }

    /** */
    public ParkInfo park;

    public CallParty park(ParkInfo park) {
        this.park = park;
        return this;
    }

    /** */
    public PartyInfo from;

    public CallParty from(PartyInfo from) {
        this.from = from;
        return this;
    }

    /** */
    public PartyInfo to;

    public CallParty to(PartyInfo to) {
        this.to = to;
        return this;
    }

    /** */
    public OwnerInfo owner;

    public CallParty owner(OwnerInfo owner) {
        this.owner = owner;
        return this;
    }

    /** Direction of a call Enum: Inbound, Outbound */
    public String direction;

    public CallParty direction(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * A party&#039;s role in the conference scenarios. For calls of &#039;Conference&#039; type
     * only Enum: Host, Participant
     */
    public String conferenceRole;

    public CallParty conferenceRole(String conferenceRole) {
        this.conferenceRole = conferenceRole;
        return this;
    }

    /**
     * A party&#039;s role in &#039;Ring Me&#039;/&#039;RingOut&#039; scenarios. For calls of
     * &#039;Ringout&#039; type only Enum: Initiator, Target
     */
    public String ringOutRole;

    public CallParty ringOutRole(String ringOutRole) {
        this.ringOutRole = ringOutRole;
        return this;
    }

    /**
     * A party&#039;s role in &#039;Ring Me&#039;/&#039;RingOut&#039; scenarios. For calls of
     * &#039;Ringme&#039; type only Enum: Initiator, Target
     */
    public String ringMeRole;

    public CallParty ringMeRole(String ringMeRole) {
        this.ringMeRole = ringMeRole;
        return this;
    }

    /** Active recordings list */
    public RecordingInfo[] recordings;

    public CallParty recordings(RecordingInfo[] recordings) {
        this.recordings = recordings;
        return this;
    }

    /** Call metadata. */
    public MetaData[] metadata;

    public CallParty metadata(MetaData[] metadata) {
        this.metadata = metadata;
        return this;
    }
}

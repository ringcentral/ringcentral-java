package com.ringcentral.definitions;


public class CallParty {
    /**
     * Internal identifier of a party
     */
    public String id;
    /**
     * Status data of a call session
     */
    public CallStatusInfo status;
    /**
     * Specifies if a call participant is muted or not
     */
    public Boolean muted;
    /**
     * True if party is not connected to a session voice conference. False - otherwise
     */
    public Boolean standAlone;
    /**
     * Call park information
     */
    public ParkInfo park;
    /**
     * Data on a calling party
     */
    public PartyInfo from;
    /**
     * Data on a called party
     */
    public PartyInfo to;
    /**
     * Data on a call owner
     */
    public OwnerInfo owner;
    /**
     * Direction of a call
     * Enum: Inbound, Outbound
     */
    public String direction;
    /**
     * A party's role in the conference scenarios. For calls of 'Conference' type only
     * Enum: Host, Participant
     */
    public String conferenceRole;
    /**
     * A party's role in 'Ring Me'/'RingOut' scenarios. For calls of 'Ringout' type only
     * Enum: Initiator, Target
     */
    public String ringOutRole;
    /**
     * A party's role in 'Ring Me'/'RingOut' scenarios. For calls of 'Ringme' type only
     * Enum: Initiator, Target
     */
    public String ringMeRole;
    /**
     * Active recordings list
     */
    public RecordingInfo[] recordings;

    public CallParty id(String id) {
        this.id = id;
        return this;
    }

    public CallParty status(CallStatusInfo status) {
        this.status = status;
        return this;
    }

    public CallParty muted(Boolean muted) {
        this.muted = muted;
        return this;
    }

    public CallParty standAlone(Boolean standAlone) {
        this.standAlone = standAlone;
        return this;
    }

    public CallParty park(ParkInfo park) {
        this.park = park;
        return this;
    }

    public CallParty from(PartyInfo from) {
        this.from = from;
        return this;
    }

    public CallParty to(PartyInfo to) {
        this.to = to;
        return this;
    }

    public CallParty owner(OwnerInfo owner) {
        this.owner = owner;
        return this;
    }

    public CallParty direction(String direction) {
        this.direction = direction;
        return this;
    }

    public CallParty conferenceRole(String conferenceRole) {
        this.conferenceRole = conferenceRole;
        return this;
    }

    public CallParty ringOutRole(String ringOutRole) {
        this.ringOutRole = ringOutRole;
        return this;
    }

    public CallParty ringMeRole(String ringMeRole) {
        this.ringMeRole = ringMeRole;
        return this;
    }

    public CallParty recordings(RecordingInfo[] recordings) {
        this.recordings = recordings;
        return this;
    }

}

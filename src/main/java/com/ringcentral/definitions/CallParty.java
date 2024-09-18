package com.ringcentral.definitions;


/**
 * Information on a party of a call session
 */
public class CallParty {
    /**
     * Internal identifier of a party
     */
    public String id;
    /**
     *
     */
    public CallStatusInfo status;
    /**
     * Specifies if a call participant is muted or not. **Note:**
     * If a call is also controlled via Hard phone or RingCentral App (not only
     * through the API by calling call control methods) then it cannot be fully
     * muted/unmuted via API only, in this case the action should be duplicated
     * via Hard phone/RC App interfaces
     */
    public Boolean muted;
    /**
     * If `true` then the party is not connected to a session voice
     * conference, `false` means the party is connected to other parties in a
     * session
     */
    public Boolean standAlone;
    /**
     *
     */
    public ParkInfo park;
    /**
     *
     */
    public PartyInfo from;
    /**
     *
     */
    public PartyInfo to;
    /**
     *
     */
    public OwnerInfo owner;
    /**
     * Direction of a call
     * Enum: Inbound, Outbound
     */
    public String direction;
    /**
     * A party&#039;s role in the conference scenarios. For calls of &#039;Conference&#039; type only
     * Enum: Host, Participant
     */
    public String conferenceRole;
    /**
     * A party&#039;s role in &#039;Ring Me&#039;/&#039;RingOut&#039; scenarios. For calls of &#039;Ringout&#039; type only
     * Enum: Initiator, Target
     */
    public String ringOutRole;
    /**
     * A party&#039;s role in &#039;Ring Me&#039;/&#039;RingOut&#039; scenarios. For calls of &#039;Ringme&#039; type only
     * Enum: Initiator, Target
     */
    public String ringMeRole;
    /**
     * Active recordings list
     */
    public RecordingInfo[] recordings;
    /**
     * Call metadata.
     */
    public MetaData[] metadata;

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

    public CallParty metadata(MetaData[] metadata) {
        this.metadata = metadata;
        return this;
    }
}

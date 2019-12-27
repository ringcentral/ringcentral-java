package com.ringcentral.definitions;


public class ReplyParty {
    /**
     * Internal identifier of a party
     */
    public String id;
    /**
     * Status data of a call session
     */
    public CallStatusInfo status;
    /**
     * Specifies if a call participant is muted or not. **Note:** If a call is also controlled via Hard phone or RingCentral App (not only through the API by calling call control methods) then it cannot be fully muted/unmuted via API only, in this case the action should be duplicated via Hard phone/RC App interfaces
     */
    public Boolean muted;
    /**
     * If 'True' then the party is not connected to a session voice conference, 'False' means the party is connected to other parties in a session
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

    public ReplyParty id(String id) {
        this.id = id;
        return this;
    }

    public ReplyParty status(CallStatusInfo status) {
        this.status = status;
        return this;
    }

    public ReplyParty muted(Boolean muted) {
        this.muted = muted;
        return this;
    }

    public ReplyParty standAlone(Boolean standAlone) {
        this.standAlone = standAlone;
        return this;
    }

    public ReplyParty park(ParkInfo park) {
        this.park = park;
        return this;
    }

    public ReplyParty from(PartyInfo from) {
        this.from = from;
        return this;
    }

    public ReplyParty to(PartyInfo to) {
        this.to = to;
        return this;
    }

    public ReplyParty owner(OwnerInfo owner) {
        this.owner = owner;
        return this;
    }

    public ReplyParty direction(String direction) {
        this.direction = direction;
        return this;
    }

}

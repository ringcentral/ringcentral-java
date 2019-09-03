package com.ringcentral.definitions;


public class SuperviseCallSession {
    /**
     * Information about a call party that monitors a call
     */
    public PartyInfo from;
    /**
     * Information about a call party that is monitored
     */
    public PartyInfo to;
    /**
     * Direction of a call
     * Enum: Outbound, Inbound
     */
    public String direction;
    /**
     * Internal identifier of a party that monitors a call
     */
    public String id;
    /**
     * Specifies if a call participant is muted or not. **Note:** If a call is also controlled via Hard phone or RingCentral App (not only through the API by calling call control methods) then it cannot be fully muted/unmuted via API only, in this case the action should be duplicated via Hard phone/RC App interfaces
     */
    public Boolean muted;
    /**
     * Data on a call owner
     */
    public OwnerInfo owner;
    /**
     * If 'True' then the party is not connected to a session voice conference, 'False' means the party is connected to other parties in a session
     */
    public Boolean standAlone;
    /**
     *
     */
    public CallStatusInfo status;

    public SuperviseCallSession from(PartyInfo from) {
        this.from = from;
        return this;
    }

    public SuperviseCallSession to(PartyInfo to) {
        this.to = to;
        return this;
    }

    public SuperviseCallSession direction(String direction) {
        this.direction = direction;
        return this;
    }

    public SuperviseCallSession id(String id) {
        this.id = id;
        return this;
    }

    public SuperviseCallSession muted(Boolean muted) {
        this.muted = muted;
        return this;
    }

    public SuperviseCallSession owner(OwnerInfo owner) {
        this.owner = owner;
        return this;
    }

    public SuperviseCallSession standAlone(Boolean standAlone) {
        this.standAlone = standAlone;
        return this;
    }

    public SuperviseCallSession status(CallStatusInfo status) {
        this.status = status;
        return this;
    }

}

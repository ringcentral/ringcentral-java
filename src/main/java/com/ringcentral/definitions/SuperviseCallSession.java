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
     * Specifies if a call party is muted
     */
    public Boolean muted;
    /**
     *
     */
    public OwnerInfo owner;
    /**
     * Specifies if a device is stand-alone
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

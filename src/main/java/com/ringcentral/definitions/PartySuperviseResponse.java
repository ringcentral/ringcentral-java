package com.ringcentral.definitions;


public class PartySuperviseResponse {
    /**
     *
     */
    public PartyInfo from;
    /**
     *
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
     * Internal identifier of an account that monitors a call
     */
    public String accountId;
    /**
     * Internal identifier of an extension that monitors a call
     */
    public String extensionId;
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

    public PartySuperviseResponse from(PartyInfo from) {
        this.from = from;
        return this;
    }

    public PartySuperviseResponse to(PartyInfo to) {
        this.to = to;
        return this;
    }

    public PartySuperviseResponse direction(String direction) {
        this.direction = direction;
        return this;
    }

    public PartySuperviseResponse id(String id) {
        this.id = id;
        return this;
    }

    public PartySuperviseResponse accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public PartySuperviseResponse extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public PartySuperviseResponse muted(Boolean muted) {
        this.muted = muted;
        return this;
    }

    public PartySuperviseResponse owner(OwnerInfo owner) {
        this.owner = owner;
        return this;
    }

    public PartySuperviseResponse standAlone(Boolean standAlone) {
        this.standAlone = standAlone;
        return this;
    }

    public PartySuperviseResponse status(CallStatusInfo status) {
        this.status = status;
        return this;
    }
}

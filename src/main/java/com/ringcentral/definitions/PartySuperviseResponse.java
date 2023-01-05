package com.ringcentral.definitions;


public class PartySuperviseResponse
{
    /**
     */
    public PartyInfo from;
    public PartySuperviseResponse from(PartyInfo from)
    {
        this.from = from;
        return this;
    }

    /**
     */
    public PartyInfo to;
    public PartySuperviseResponse to(PartyInfo to)
    {
        this.to = to;
        return this;
    }

    /**
     * Direction of a call
     * Enum: Outbound, Inbound
     */
    public String direction;
    public PartySuperviseResponse direction(String direction)
    {
        this.direction = direction;
        return this;
    }

    /**
     * Internal identifier of a party that monitors a call
     */
    public String id;
    public PartySuperviseResponse id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Internal identifier of an account that monitors a call
     */
    public String accountId;
    public PartySuperviseResponse accountId(String accountId)
    {
        this.accountId = accountId;
        return this;
    }

    /**
     * Internal identifier of an extension that monitors a call
     */
    public String extensionId;
    public PartySuperviseResponse extensionId(String extensionId)
    {
        this.extensionId = extensionId;
        return this;
    }

    /**
     * Specifies if a call party is muted
     */
    public Boolean muted;
    public PartySuperviseResponse muted(Boolean muted)
    {
        this.muted = muted;
        return this;
    }

    /**
     */
    public OwnerInfo owner;
    public PartySuperviseResponse owner(OwnerInfo owner)
    {
        this.owner = owner;
        return this;
    }

    /**
     * Specifies if a device is stand-alone
     */
    public Boolean standAlone;
    public PartySuperviseResponse standAlone(Boolean standAlone)
    {
        this.standAlone = standAlone;
        return this;
    }

    /**
     */
    public CallStatusInfo status;
    public PartySuperviseResponse status(CallStatusInfo status)
    {
        this.status = status;
        return this;
    }
}
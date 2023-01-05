package com.ringcentral.definitions;


public class SuperviseCallSessionResponse
{
    /**
     */
    public PartyInfo from;
    public SuperviseCallSessionResponse from(PartyInfo from)
    {
        this.from = from;
        return this;
    }

    /**
     */
    public PartyInfo to;
    public SuperviseCallSessionResponse to(PartyInfo to)
    {
        this.to = to;
        return this;
    }

    /**
     * Direction of a call
     * Enum: Outbound, Inbound
     */
    public String direction;
    public SuperviseCallSessionResponse direction(String direction)
    {
        this.direction = direction;
        return this;
    }

    /**
     * Internal identifier of a party that monitors a call
     */
    public String id;
    public SuperviseCallSessionResponse id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Internal identifier of an account that monitors a call
     */
    public String accountId;
    public SuperviseCallSessionResponse accountId(String accountId)
    {
        this.accountId = accountId;
        return this;
    }

    /**
     * Internal identifier of an extension that monitors a call
     */
    public String extensionId;
    public SuperviseCallSessionResponse extensionId(String extensionId)
    {
        this.extensionId = extensionId;
        return this;
    }

    /**
     * Specifies if a call participant is muted or not. **Note:** If a call is also controlled via Hard phone or RingCentral App (not only through the API by calling call control methods) then it cannot be fully muted/unmuted via API only, in this case the action should be duplicated via Hard phone/RC App interfaces
     */
    public Boolean muted;
    public SuperviseCallSessionResponse muted(Boolean muted)
    {
        this.muted = muted;
        return this;
    }

    /**
     */
    public OwnerInfo owner;
    public SuperviseCallSessionResponse owner(OwnerInfo owner)
    {
        this.owner = owner;
        return this;
    }

    /**
     * If &#039;True&#039; then the party is not connected to a session voice conference, &#039;False&#039; means the party is connected to other parties in a session
     */
    public Boolean standAlone;
    public SuperviseCallSessionResponse standAlone(Boolean standAlone)
    {
        this.standAlone = standAlone;
        return this;
    }

    /**
     */
    public CallStatusInfo status;
    public SuperviseCallSessionResponse status(CallStatusInfo status)
    {
        this.status = status;
        return this;
    }
}
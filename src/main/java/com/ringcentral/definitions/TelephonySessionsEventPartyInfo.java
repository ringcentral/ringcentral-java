package com.ringcentral.definitions;


public class TelephonySessionsEventPartyInfo
{
    /**
     */
    public String accountId;
    public TelephonySessionsEventPartyInfo accountId(String accountId)
    {
        this.accountId = accountId;
        return this;
    }

    /**
     */
    public String extensionId;
    public TelephonySessionsEventPartyInfo extensionId(String extensionId)
    {
        this.extensionId = extensionId;
        return this;
    }

    /**
     */
    public String id;
    public TelephonySessionsEventPartyInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Enum: Inbound, Outbound
     */
    public String direction;
    public TelephonySessionsEventPartyInfo direction(String direction)
    {
        this.direction = direction;
        return this;
    }

    /**
     */
    public CallPartyInfo to;
    public TelephonySessionsEventPartyInfo to(CallPartyInfo to)
    {
        this.to = to;
        return this;
    }

    /**
     */
    public CallPartyInfo from;
    public TelephonySessionsEventPartyInfo from(CallPartyInfo from)
    {
        this.from = from;
        return this;
    }

    /**
     */
    public CallSessionStatusInfo status;
    public TelephonySessionsEventPartyInfo status(CallSessionStatusInfo status)
    {
        this.status = status;
        return this;
    }
}
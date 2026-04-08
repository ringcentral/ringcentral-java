package com.ringcentral.definitions;


public class AccountHistoryPublicRecord
{
    /**
     * Internal record identifier
     * Example: 9835bead-397b-4ba8-b457-73f07ab79997
     */
    public String id;
    public AccountHistoryPublicRecord id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Timestamp of an event (provided by a client), RFC3339 date-time format, UTC time zone.
     * Format: date-time
     */
    public String eventTime;
    public AccountHistoryPublicRecord eventTime(String eventTime)
    {
        this.eventTime = eventTime;
        return this;
    }

    /**
     */
    public AccountHistoryRecordPublicInitiator initiator;
    public AccountHistoryPublicRecord initiator(AccountHistoryRecordPublicInitiator initiator)
    {
        this.initiator = initiator;
        return this;
    }

    /**
     * Action type
     * Example: CHANGE_SECRET_INFO
     */
    public String actionId;
    public AccountHistoryPublicRecord actionId(String actionId)
    {
        this.actionId = actionId;
        return this;
    }

    /**
     * Operation: &quot;CREATE&quot;, &quot;UPDATE&quot;, &quot;DELETE&quot; or custom
     * Example: UPDATE
     */
    public String eventType;
    public AccountHistoryPublicRecord eventType(String eventType)
    {
        this.eventType = eventType;
        return this;
    }

    /**
     * Account identifier which is related with the particular record.
     * Example: 403858014008
     */
    public String accountId;
    public AccountHistoryPublicRecord accountId(String accountId)
    {
        this.accountId = accountId;
        return this;
    }

    /**
     * Account (company) name
     * Example: Some Company
     */
    public String accountName;
    public AccountHistoryPublicRecord accountName(String accountName)
    {
        this.accountName = accountName;
        return this;
    }

    /**
     */
    public AccountHistoryRecordTarget target;
    public AccountHistoryPublicRecord target(AccountHistoryRecordTarget target)
    {
        this.target = target;
        return this;
    }

    /**
     * IP-address of a client.
     * Example: 192.168.42.6
     */
    public String clientIp;
    public AccountHistoryPublicRecord clientIp(String clientIp)
    {
        this.clientIp = clientIp;
        return this;
    }

    /**
     * Custom top-level comment
     */
    public String comment;
    public AccountHistoryPublicRecord comment(String comment)
    {
        this.comment = comment;
        return this;
    }

    /**
     */
    public AccountHistoryRecordPublicDetails details;
    public AccountHistoryPublicRecord details(AccountHistoryRecordPublicDetails details)
    {
        this.details = details;
        return this;
    }
}
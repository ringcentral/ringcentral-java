package com.ringcentral.definitions;


public class MessageStoreReport
{
    /**
     * Internal identifier of a message store report task
     * Example: 400142200026-400142200026-bd162f24028442489385eb3f44c18354
     */
    public String id;
    public MessageStoreReport id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Canonical URI of a task
     * Format: uri
     */
    public String uri;
    public MessageStoreReport uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Status of a message store report task
     * Enum: Accepted, Pending, InProgress, AttemptFailed, Failed, Completed, Cancelled
     */
    public String status;
    public MessageStoreReport status(String status)
    {
        this.status = status;
        return this;
    }

    /**
     * Internal identifier of an account
     */
    public String accountId;
    public MessageStoreReport accountId(String accountId)
    {
        this.accountId = accountId;
        return this;
    }

    /**
     * Internal identifier of an extension
     */
    public String extensionId;
    public MessageStoreReport extensionId(String extensionId)
    {
        this.extensionId = extensionId;
        return this;
    }

    /**
     * The end of the time range to collect message records in ISO 8601 format including timezone
     * Format: date-time
     */
    public String dateTo;
    public MessageStoreReport dateTo(String dateTo)
    {
        this.dateTo = dateTo;
        return this;
    }

    /**
     * The beginning of the time range to collect call log records in ISO 8601 format including timezone
     * Format: date-time
     */
    public String dateFrom;
    public MessageStoreReport dateFrom(String dateFrom)
    {
        this.dateFrom = dateFrom;
        return this;
    }

    /**
     * The time when this task was started
     * Format: date-time
     */
    public String startTime;
    public MessageStoreReport startTime(String startTime)
    {
        this.startTime = startTime;
        return this;
    }

    /**
     * The time when this task was finished
     * Format: date-time
     */
    public String finishTime;
    public MessageStoreReport finishTime(String finishTime)
    {
        this.finishTime = finishTime;
        return this;
    }

    /**
     * Type of messages to be collected.
     * Example: Fax,VoiceMail
     * Enum: EMail, Fax, SMS, VoiceMail, Pager, Text
     */
    public String[] messageTypes;
    public MessageStoreReport messageTypes(String[] messageTypes)
    {
        this.messageTypes = messageTypes;
        return this;
    }
}
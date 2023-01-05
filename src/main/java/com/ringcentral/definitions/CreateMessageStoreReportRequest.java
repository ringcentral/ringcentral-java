package com.ringcentral.definitions;


public class CreateMessageStoreReportRequest
{
    /**
     * The end of the time range to collect message records in ISO 8601 format including timezone.
    * Default is the current time
     * Format: date-time
     */
    public String dateTo;
    public CreateMessageStoreReportRequest dateTo(String dateTo)
    {
        this.dateTo = dateTo;
        return this;
    }

    /**
     * The beginning of the time range to collect call log records in ISO 8601 format including timezone.
    * Default is the current time minus 24 hours
     * Format: date-time
     */
    public String dateFrom;
    public CreateMessageStoreReportRequest dateFrom(String dateFrom)
    {
        this.dateFrom = dateFrom;
        return this;
    }

    /**
     * Types of messages to be collected. If not specified, all messages without message type filtering will be returned. Multiple values are accepted
     * Example: Fax,VoiceMail
     * Enum: EMail, Fax, SMS, VoiceMail, Pager, Text
     */
    public String[] messageTypes;
    public CreateMessageStoreReportRequest messageTypes(String[] messageTypes)
    {
        this.messageTypes = messageTypes;
        return this;
    }
}
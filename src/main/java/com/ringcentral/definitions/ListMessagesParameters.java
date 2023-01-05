package com.ringcentral.definitions;


    /**
* Query parameters for operation listMessages
*/
public class ListMessagesParameters
{
    /**
     * Specifies the availability status for the resulting messages. Multiple values are accepted
     * Enum: Alive, Deleted, Purged
     */
    public String[] availability;
    public ListMessagesParameters availability(String[] availability)
    {
        this.availability = availability;
        return this;
    }

    /**
     * Specifies the conversation identifier for the resulting messages
     */
    public Long conversationId;
    public ListMessagesParameters conversationId(Long conversationId)
    {
        this.conversationId = conversationId;
        return this;
    }

    /**
     * The start datetime for resulting messages in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. The default value is dateTo minus 24 hours
     * Format: date-time
     */
    public String dateFrom;
    public ListMessagesParameters dateFrom(String dateFrom)
    {
        this.dateFrom = dateFrom;
        return this;
    }

    /**
     * The end datetime for resulting messages in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. The default value is current time
     * Format: date-time
     */
    public String dateTo;
    public ListMessagesParameters dateTo(String dateTo)
    {
        this.dateTo = dateTo;
        return this;
    }

    /**
     * The direction for the resulting messages. If not specified, both inbound and outbound messages are returned. Multiple values are accepted
     * Enum: Inbound, Outbound
     */
    public String[] direction;
    public ListMessagesParameters direction(String[] direction)
    {
        this.direction = direction;
        return this;
    }

    /**
     * If &#039;True&#039;, then the latest messages per every conversation ID are returned
     */
    public Boolean distinctConversations;
    public ListMessagesParameters distinctConversations(Boolean distinctConversations)
    {
        this.distinctConversations = distinctConversations;
        return this;
    }

    /**
     * The type of the resulting messages. If not specified, all messages without message type filtering are returned. Multiple values are accepted
     * Enum: Fax, SMS, VoiceMail, Pager, Text
     */
    public String[] messageType;
    public ListMessagesParameters messageType(String[] messageType)
    {
        this.messageType = messageType;
        return this;
    }

    /**
     * The read status for the resulting messages. Multiple values are accepted
     * Enum: Read, Unread
     */
    public String[] readStatus;
    public ListMessagesParameters readStatus(String[] readStatus)
    {
        this.readStatus = readStatus;
        return this;
    }

    /**
     * Indicates the page number to retrieve. Only positive number values are accepted
     * Default: 1
     */
    public Long page;
    public ListMessagesParameters page(Long page)
    {
        this.page = page;
        return this;
    }

    /**
     * Indicates the page size (number of items)
     * Default: 100
     */
    public Long perPage;
    public ListMessagesParameters perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }

    /**
     * The phone number. If specified, messages are returned for this particular phone number only
     */
    public String phoneNumber;
    public ListMessagesParameters phoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
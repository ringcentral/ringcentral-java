package com.ringcentral.definitions;


public class ListMessagesParameters {
    /**
     * Specifies the availability status for the resulting messages. Multiple values are accepted
     */
    public String[] availability;
    /**
     * Specifies the conversation identifier for the resulting messages
     */
    public Long conversationId;
    /**
     * The start datetime for resulting messages in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. The default value is dateTo minus 24 hours
     */
    public String dateFrom;
    /**
     * The end datetime for resulting messages in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. The default value is current time
     */
    public String dateTo;
    /**
     * The direction for the resulting messages. If not specified, both inbound and outbound messages are returned. Multiple values are accepted
     */
    public String[] direction;
    /**
     * If 'True', then the latest messages per every conversation ID are returned
     */
    public Boolean distinctConversations;
    /**
     * The type of the resulting messages. If not specified, all messages without message type filtering are returned. Multiple values are accepted
     */
    public String[] messageType;
    /**
     * The read status for the resulting messages. Multiple values are accepted
     */
    public String[] readStatus;
    /**
     * Indicates the page number to retrieve. Only positive number values are accepted
     * Default: 1
     */
    public Long page;
    /**
     * Indicates the page size (number of items)
     * Default: 100
     */
    public Long perPage;
    /**
     * The phone number. If specified, messages are returned for this particular phone number only
     */
    public String phoneNumber;

    public ListMessagesParameters availability(String[] availability) {
        this.availability = availability;
        return this;
    }

    public ListMessagesParameters conversationId(Long conversationId) {
        this.conversationId = conversationId;
        return this;
    }

    public ListMessagesParameters dateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
        return this;
    }

    public ListMessagesParameters dateTo(String dateTo) {
        this.dateTo = dateTo;
        return this;
    }

    public ListMessagesParameters direction(String[] direction) {
        this.direction = direction;
        return this;
    }

    public ListMessagesParameters distinctConversations(Boolean distinctConversations) {
        this.distinctConversations = distinctConversations;
        return this;
    }

    public ListMessagesParameters messageType(String[] messageType) {
        this.messageType = messageType;
        return this;
    }

    public ListMessagesParameters readStatus(String[] readStatus) {
        this.readStatus = readStatus;
        return this;
    }

    public ListMessagesParameters page(Long page) {
        this.page = page;
        return this;
    }

    public ListMessagesParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public ListMessagesParameters phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

}

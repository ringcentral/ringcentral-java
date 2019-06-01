package com.ringcentral.definitions;


public class SyncMessagesParameters {
    /**
     * Conversation identifier for the resulting messages. Meaningful for SMS and Pager messages only.
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
     * Direction for the resulting messages. If not specified, both inbound and outbound messages are returned. Multiple values are accepted
     */
    public String[] direction;
    /**
     * If 'True', then the latest messages per every conversation ID are returned
     */
    public Boolean distinctConversations;
    /**
     * Type for the resulting messages. If not specified, all types of messages are returned. Multiple values are accepted
     */
    public String[] messageType;
    /**
     * Limits the number of records to be returned (works in combination with dateFrom and dateTo if specified)
     */
    public Long recordCount;
    /**
     * Value of syncToken property of last sync request response
     */
    public String syncToken;
    /**
     * Type of message synchronization
     */
    public String[] syncType;

    public SyncMessagesParameters conversationId(Long conversationId) {
        this.conversationId = conversationId;
        return this;
    }

    public SyncMessagesParameters dateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
        return this;
    }

    public SyncMessagesParameters dateTo(String dateTo) {
        this.dateTo = dateTo;
        return this;
    }

    public SyncMessagesParameters direction(String[] direction) {
        this.direction = direction;
        return this;
    }

    public SyncMessagesParameters distinctConversations(Boolean distinctConversations) {
        this.distinctConversations = distinctConversations;
        return this;
    }

    public SyncMessagesParameters messageType(String[] messageType) {
        this.messageType = messageType;
        return this;
    }

    public SyncMessagesParameters recordCount(Long recordCount) {
        this.recordCount = recordCount;
        return this;
    }

    public SyncMessagesParameters syncToken(String syncToken) {
        this.syncToken = syncToken;
        return this;
    }

    public SyncMessagesParameters syncType(String[] syncType) {
        this.syncType = syncType;
        return this;
    }

}

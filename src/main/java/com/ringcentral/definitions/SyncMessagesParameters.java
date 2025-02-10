package com.ringcentral.definitions;


/**
 * Query parameters for operation syncMessages
 */
public class SyncMessagesParameters {
    /**
     * Conversation identifier for the resulting messages. Meaningful
     * for SMS and Pager messages only.
     * Format: int64
     */
    public Long conversationId;
    /**
     * The start date/time for resulting messages in ISO 8601 format
     * including timezone, for example 2016-03-10T18:07:52.534Z. The default value
     * is dateTo minus 24 hours
     * Format: date-time
     */
    public String dateFrom;
    /**
     * The end date/time for resulting messages in ISO 8601 format including
     * timezone, for example 2016-03-10T18:07:52.534Z. The default value is current
     * time
     * Format: date-time
     */
    public String dateTo;
    /**
     * Direction for the resulting messages. If not specified, both
     * inbound and outbound messages are returned. Multiple values are accepted
     * Enum: Inbound, Outbound
     */
    public String[] direction;
    /**
     * If `true`, then the latest messages per every conversation ID
     * are returned
     */
    public Boolean distinctConversations;
    /**
     * Type for the resulting messages. If not specified, all types
     * of messages are returned. Multiple values are accepted
     * Enum: Fax, SMS, VoiceMail, Pager
     */
    public String[] messageType;
    /**
     * Limits the number of records to be returned (works in combination
     * with dateFrom and dateTo if specified)
     * Format: int32
     */
    public Long recordCount;
    /**
     * A `syncToken` value from the previous sync response (for `ISync` mode only, mandatory)
     */
    public String syncToken;
    /**
     * Type of message synchronization request:
     * - FSync -- full sync
     * - ISync -- incremental sync
     * Enum: FSync, ISync
     */
    public String syncType;
    /**
     * Filters voicemail messages based on the owner extension. Supported if the &#039;SharedVoicemail&#039;
     * feature is enabled.
     * Default: Personal
     * Enum: Any, Personal, Shared
     */
    public String[] voicemailOwner;

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

    public SyncMessagesParameters syncType(String syncType) {
        this.syncType = syncType;
        return this;
    }

    public SyncMessagesParameters voicemailOwner(String[] voicemailOwner) {
        this.voicemailOwner = voicemailOwner;
        return this;
    }
}

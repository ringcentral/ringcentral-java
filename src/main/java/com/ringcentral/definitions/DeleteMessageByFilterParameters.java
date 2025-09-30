package com.ringcentral.definitions;


/**
 * Query parameters for operation deleteMessageByFilter
 */
public class DeleteMessageByFilterParameters {
    /**
     * ID(s) of a conversation to delete
     */
    public String[] conversationId;
    /**
     * Messages received earlier then the date specified will be deleted.
     * The default value is current date/time
     * Format: date-time
     */
    public String dateTo;
    /**
     * Type of messages to be deleted
     * Default: All
     * Enum: Fax, SMS, VoiceMail, Pager, Text, All
     */
    public String type;

    public DeleteMessageByFilterParameters conversationId(String[] conversationId) {
        this.conversationId = conversationId;
        return this;
    }

    public DeleteMessageByFilterParameters dateTo(String dateTo) {
        this.dateTo = dateTo;
        return this;
    }

    public DeleteMessageByFilterParameters type(String type) {
        this.type = type;
        return this;
    }
}

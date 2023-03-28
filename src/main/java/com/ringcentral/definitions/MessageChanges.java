package com.ringcentral.definitions;


public class MessageChanges {
    /**
     * Type of messages to be collected
     * Example: Fax
     * Enum: EMail, Fax, SMS, VoiceMail, Pager, Text
     */
    public String type;
    /**
     * Number of new messages. Can be omitted if the value is zero
     * Format: int32
     */
    public Long newCount;
    /**
     * Number of updated messages. Can be omitted if the value is zero
     * Format: int32
     */
    public Long updatedCount;

    public MessageChanges type(String type) {
        this.type = type;
        return this;
    }

    public MessageChanges newCount(Long newCount) {
        this.newCount = newCount;
        return this;
    }

    public MessageChanges updatedCount(Long updatedCount) {
        this.updatedCount = updatedCount;
        return this;
    }
}

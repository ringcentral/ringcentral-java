package com.ringcentral.definitions;


public class MessageChanges {
    /**
     * Message type
     * Enum: Voicemail, SMS, Fax, Pager
     */
    public String type;
    /**
     * The number of new messages. Can be omitted if the value is zero
     */
    public Long newCount;
    /**
     * The number of updated messages. Can be omitted if the value is zero
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

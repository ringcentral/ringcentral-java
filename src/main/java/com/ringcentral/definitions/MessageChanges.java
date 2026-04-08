package com.ringcentral.definitions;

public class MessageChanges {
    /** Type of the message Enum: Fax, SMS, VoiceMail, Pager */
    public String type;

    public MessageChanges type(String type) {
        this.type = type;
        return this;
    }

    /** Number of new messages. Can be omitted if the value is zero Format: int32 */
    public Long newCount;

    public MessageChanges newCount(Long newCount) {
        this.newCount = newCount;
        return this;
    }

    /** Number of updated messages. Can be omitted if the value is zero Format: int32 */
    public Long updatedCount;

    public MessageChanges updatedCount(Long updatedCount) {
        this.updatedCount = updatedCount;
        return this;
    }

    /** Identifiers of the new messages, applicable for all message types */
    public Long[] newMessageIds;

    public MessageChanges newMessageIds(Long[] newMessageIds) {
        this.newMessageIds = newMessageIds;
        return this;
    }
}

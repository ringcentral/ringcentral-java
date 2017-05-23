package com.ringcentral.definitions;

public class MessageChange {
    // Message type
    public String type;
    // The number of new messages. Can be omitted if the value is zero
    public Long newCount;
    // The number of updated messages. Can be omitted if the value is zero
    public Long updatedCount;

    public MessageChange type(String type) {
        this.type = type;
        return this;
    }

    public MessageChange newCount(Long newCount) {
        this.newCount = newCount;
        return this;
    }

    public MessageChange updatedCount(Long updatedCount) {
        this.updatedCount = updatedCount;
        return this;
    }
}

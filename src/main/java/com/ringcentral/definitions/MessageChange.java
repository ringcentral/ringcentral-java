package com.ringcentral.definitions;

public class MessageChange {
    // Message type
    public String type;
    // The number of new messages. Can be omitted if the value is zero
    public Long newCount;
    // The number of updated messages. Can be omitted if the value is zero
    public Long updatedCount;
}

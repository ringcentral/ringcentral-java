package com.ringcentral.definitions;


public class UpdateMessageRequest {
    /**
     * Message read status
     * Required
     * Enum: Read, Unread
     */
    public String readStatus;

    public UpdateMessageRequest readStatus(String readStatus) {
        this.readStatus = readStatus;
        return this;
    }
}

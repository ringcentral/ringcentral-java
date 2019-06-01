package com.ringcentral.definitions;


public class UpdateMessageRequest {
    /**
     * Read status of a message to be changed. Multiple values are accepted
     * Enum: Read, Unread
     */
    public String readStatus;

    public UpdateMessageRequest readStatus(String readStatus) {
        this.readStatus = readStatus;
        return this;
    }

}

package com.ringcentral.definitions;


/**
 * Either `readStatus` or `availability` or both are required
 */
public class PatchMessageRequest {
    /**
     * Message read status
     * Enum: Read, Unread
     */
    public String readStatus;
    /**
     * Message availability status. Message in `Deleted` state is still
     * preserved with all its attachments and can be restored. `Purged` means
     * that all attachments are already deleted and the message itself is about
     * to be physically deleted shortly
     * Enum: Alive, Deleted, Purged
     */
    public String availability;

    public PatchMessageRequest readStatus(String readStatus) {
        this.readStatus = readStatus;
        return this;
    }

    public PatchMessageRequest availability(String availability) {
        this.availability = availability;
        return this;
    }
}

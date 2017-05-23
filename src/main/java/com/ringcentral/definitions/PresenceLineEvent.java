package com.ringcentral.definitions;

public class PresenceLineEvent {
    // Extension information
    public PresenceLineEvent_ExtensionInfo extension;
    // Order number of a notification to state the chronology
    public Long sequence;

    public PresenceLineEvent extension(PresenceLineEvent_ExtensionInfo extension) {
        this.extension = extension;
        return this;
    }

    public PresenceLineEvent sequence(Long sequence) {
        this.sequence = sequence;
        return this;
    }
}

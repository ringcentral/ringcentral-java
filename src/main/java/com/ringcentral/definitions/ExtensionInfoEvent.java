package com.ringcentral.definitions;

public class ExtensionInfoEvent {
    // Internal identifier of an extension
    public String extensionId;
    // Type of extension info change
    public String eventType;

    public ExtensionInfoEvent extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public ExtensionInfoEvent eventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
}

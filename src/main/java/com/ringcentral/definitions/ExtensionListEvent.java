package com.ringcentral.definitions;

public class ExtensionListEvent {
    // Internal identifier of an extension
    public String extensionId;
    // Type of extension info change
    public String eventType;

    public ExtensionListEvent extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public ExtensionListEvent eventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
}

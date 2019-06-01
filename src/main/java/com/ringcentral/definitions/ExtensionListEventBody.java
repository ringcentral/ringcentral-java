package com.ringcentral.definitions;


public class ExtensionListEventBody {
    /**
     * Internal identifier of an extension
     */
    public String extensionId;
    /**
     * Type of extension info change
     * Enum: Create, Update, Delete
     */
    public String eventType;
    /**
     * Internal identifier of a subscription owner extension
     */
    public String ownerId;

    public ExtensionListEventBody extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public ExtensionListEventBody eventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    public ExtensionListEventBody ownerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

}

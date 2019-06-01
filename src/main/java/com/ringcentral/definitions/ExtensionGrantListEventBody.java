package com.ringcentral.definitions;


public class ExtensionGrantListEventBody {
    /**
     * Internal identifier of an extension
     */
    public String extensionId;
    /**
     * Internal identifier of a subscription owner extension
     */
    public String ownerId;

    public ExtensionGrantListEventBody extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public ExtensionGrantListEventBody ownerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

}

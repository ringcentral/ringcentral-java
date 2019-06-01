package com.ringcentral.definitions;


public class ExtensionFavoritesEventBody {
    /**
     * Internal identifier of an extension
     */
    public String extensionId;
    /**
     * Internal identifier of a subscription owner extension
     */
    public String ownerId;

    public ExtensionFavoritesEventBody extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public ExtensionFavoritesEventBody ownerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

}

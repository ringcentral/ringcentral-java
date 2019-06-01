package com.ringcentral.definitions;


public class GetPresenceExtensionInfo {
    /**
     * Internal identifier of an extension
     */
    public String id;
    /**
     * Canonical URI of an extension
     */
    public String uri;
    /**
     * Extension number (usually 3 or 4 digits)
     */
    public String extensionNumber;

    public GetPresenceExtensionInfo id(String id) {
        this.id = id;
        return this;
    }

    public GetPresenceExtensionInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public GetPresenceExtensionInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

}

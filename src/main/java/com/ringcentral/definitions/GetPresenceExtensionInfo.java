package com.ringcentral.definitions;


/**
 * Information on extension, for which this presence data is returned
 */
public class GetPresenceExtensionInfo {
    /**
     * Internal identifier of an extension
     * Format: int64
     */
    public Long id;
    /**
     * Canonical URI of an extension
     * Format: uri
     */
    public String uri;
    /**
     * Extension number (usually 3 or 4 digits)
     */
    public String extensionNumber;

    public GetPresenceExtensionInfo id(Long id) {
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

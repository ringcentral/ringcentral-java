package com.ringcentral.definitions;


/**
 * Information on extension
 */
public class ExtensionInfoCallLog {
    /**
     * Internal identifier of an extension
     * Format: int64
     */
    public Long id;
    /**
     * Canonical URI of an extension
     */
    public String uri;

    public ExtensionInfoCallLog id(Long id) {
        this.id = id;
        return this;
    }

    public ExtensionInfoCallLog uri(String uri) {
        this.uri = uri;
        return this;
    }
}

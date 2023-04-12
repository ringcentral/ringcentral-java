package com.ringcentral.definitions;


/**
 * Information about extension on whose behalf a call is initiated. For Secretary call log the Boss extension info is returned
 */
public class ExtensionInfoCallLog {
    /**
     * Internal identifier of an extension
     * Required
     * Format: int64
     */
    public Long id;
    /**
     * Canonical URI of an extension
     * Required
     * Format: uri
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

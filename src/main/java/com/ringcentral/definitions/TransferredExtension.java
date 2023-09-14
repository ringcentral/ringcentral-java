package com.ringcentral.definitions;


/**
 * Transfer extension settings, set/returned if `callHandlingAction` is specified as `TransferToExtension`
 */
public class TransferredExtension {
    /**
     * Internal identifier of an extension
     */
    public String id;
    /**
     * Canonical URI of an extension resource
     */
    public String uri;

    public TransferredExtension id(String id) {
        this.id = id;
        return this;
    }

    public TransferredExtension uri(String uri) {
        this.uri = uri;
        return this;
    }
}

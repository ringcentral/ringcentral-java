package com.ringcentral.definitions;


/**
 * Account information
 */
public class GetExtensionAccountInfo {
    /**
     * Internal identifier of an account
     */
    public String id;
    /**
     * Canonical URI of an account resource
     * Format: uri
     */
    public String uri;

    public GetExtensionAccountInfo id(String id) {
        this.id = id;
        return this;
    }

    public GetExtensionAccountInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
}

package com.ringcentral.definitions;


public class ExtensionInfoCallLog {
    /**
     * Internal identifier of an extension
     */
    public String id;
    /**
     * Canonical URI of an extension
     */
    public String uri;

    public ExtensionInfoCallLog id(String id) {
        this.id = id;
        return this;
    }

    public ExtensionInfoCallLog uri(String uri) {
        this.uri = uri;
        return this;
    }

}

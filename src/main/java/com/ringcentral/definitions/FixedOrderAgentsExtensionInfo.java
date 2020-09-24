package com.ringcentral.definitions;


public class FixedOrderAgentsExtensionInfo {
    /**
     * Internal identifier of an extension
     */
    public String id;
    /**
     * Canonical URI of an extension
     */
    public String uri;
    /**
     * Number of department extension
     */
    public String extensionNumber;

    public FixedOrderAgentsExtensionInfo id(String id) {
        this.id = id;
        return this;
    }

    public FixedOrderAgentsExtensionInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public FixedOrderAgentsExtensionInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

}

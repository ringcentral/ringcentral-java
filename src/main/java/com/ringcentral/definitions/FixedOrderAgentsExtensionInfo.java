package com.ringcentral.definitions;


public class FixedOrderAgentsExtensionInfo {
    /**
     * Internal identifier of an extension
     */
    public String id;
    /**
     * Canonical URI of an extension
     * Format: uri
     */
    public String uri;
    /**
     * Number of extension
     */
    public String extensionNumber;
    /**
     * Name of agent extension
     */
    public String name;

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

    public FixedOrderAgentsExtensionInfo name(String name) {
        this.name = name;
        return this;
    }
}

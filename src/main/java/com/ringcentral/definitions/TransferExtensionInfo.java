package com.ringcentral.definitions;


/**
 * Transfer extension settings, set/returned if `callHandlingAction` is specified as `TransferToExtension`
 */
public class TransferExtensionInfo {
    /**
     * Internal identifier of an extension
     */
    public String id;
    /**
     * Canonical URI of an extension resource
     */
    public String uri;
    /**
     * Extension name
     */
    public String name;
    /**
     * Extension number
     */
    public String extensionNumber;

    public TransferExtensionInfo id(String id) {
        this.id = id;
        return this;
    }

    public TransferExtensionInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public TransferExtensionInfo name(String name) {
        this.name = name;
        return this;
    }

    public TransferExtensionInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
}

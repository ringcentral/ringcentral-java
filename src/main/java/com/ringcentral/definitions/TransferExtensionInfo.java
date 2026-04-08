package com.ringcentral.definitions;

/**
 * Transfer extension settings, set/returned if `callHandlingAction` is specified as
 * `TransferToExtension`
 */
public class TransferExtensionInfo {
    /** Internal identifier of an extension */
    public String id;

    public TransferExtensionInfo id(String id) {
        this.id = id;
        return this;
    }

    /** Canonical URI of an extension resource */
    public String uri;

    public TransferExtensionInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    /** Extension name */
    public String name;

    public TransferExtensionInfo name(String name) {
        this.name = name;
        return this;
    }

    /** Extension number */
    public String extensionNumber;

    public TransferExtensionInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
}

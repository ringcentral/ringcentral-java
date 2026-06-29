package com.ringcentral.definitions;

/** Extension information (for ExtensionApps type only) */
public class ForwardingNumberExtensionInfo {
    /** Internal identifier of an extension */
    public String id;

    public ForwardingNumberExtensionInfo id(String id) {
        this.id = id;
        return this;
    }

    /** Extension name */
    public String name;

    public ForwardingNumberExtensionInfo name(String name) {
        this.name = name;
        return this;
    }

    /** Number of an extension */
    public String extensionNumber;

    public ForwardingNumberExtensionInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
}

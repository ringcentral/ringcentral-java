package com.ringcentral.definitions;


public class ForwardingNumberInfoExtension {
    /**
     * Internal identifier of an extension
     */
    public String id;
    /**
     * Number of an extension
     */
    public String extensionNumber;
    /**
     * Extension name
     */
    public String name;

    public ForwardingNumberInfoExtension id(String id) {
        this.id = id;
        return this;
    }

    public ForwardingNumberInfoExtension extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public ForwardingNumberInfoExtension name(String name) {
        this.name = name;
        return this;
    }
}

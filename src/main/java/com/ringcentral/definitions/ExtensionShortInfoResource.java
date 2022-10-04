package com.ringcentral.definitions;


public class ExtensionShortInfoResource {
    /**
     * Internal identifier of an extension
     */
    public String id;
    /**
     * Extension name
     */
    public String name;
    /**
     * Extension number
     */
    public String extensionNumber;

    public ExtensionShortInfoResource id(String id) {
        this.id = id;
        return this;
    }

    public ExtensionShortInfoResource name(String name) {
        this.name = name;
        return this;
    }

    public ExtensionShortInfoResource extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
}

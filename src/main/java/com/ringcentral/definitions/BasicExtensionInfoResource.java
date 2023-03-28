package com.ringcentral.definitions;


public class BasicExtensionInfoResource {
    /**
     *
     */
    public String id;
    /**
     *
     */
    public String name;
    /**
     *
     */
    public String extensionNumber;

    public BasicExtensionInfoResource id(String id) {
        this.id = id;
        return this;
    }

    public BasicExtensionInfoResource name(String name) {
        this.name = name;
        return this;
    }

    public BasicExtensionInfoResource extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
}

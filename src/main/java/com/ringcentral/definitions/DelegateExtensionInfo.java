package com.ringcentral.definitions;


public class DelegateExtensionInfo {
    /**
     * Canonical URI of an extension
     */
    public String uri;
    /**
     * Extension name
     */
    public String name;
    /**
     * Number of an extension
     */
    public String extensionNumber;

    public DelegateExtensionInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public DelegateExtensionInfo name(String name) {
        this.name = name;
        return this;
    }

    public DelegateExtensionInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

}

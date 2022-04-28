package com.ringcentral.definitions;


/**
 * Additional info about the key
 */
public class KeyInfo {
    /**
     *
     */
    public String extensionNumber;
    /**
     *
     */
    public String name;

    public KeyInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public KeyInfo name(String name) {
        this.name = name;
        return this;
    }
}

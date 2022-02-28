package com.ringcentral.definitions;


/**
 * Additional info about the key
 */
public class KeyInfo {
    /**
     *
     */
    public String extensionNumber;

    public KeyInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
}

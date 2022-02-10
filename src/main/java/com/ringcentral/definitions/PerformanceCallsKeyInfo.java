package com.ringcentral.definitions;


/**
 * Additional info about the key
 */
public class PerformanceCallsKeyInfo {
    /**
     * Number of extension
     */
    public String extensionNumber;

    public PerformanceCallsKeyInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
}

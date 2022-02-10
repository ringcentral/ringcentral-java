package com.ringcentral.definitions;


/**
 * Internal identifier of an extension the device should be assigned to
 */
public class DeviceExtensionInfo {
    /**
     * Internal identifier of an extension
     * Format: int64
     */
    public Long id;
    /**
     * Link to an extension resource
     */
    public String uri;
    /**
     * Number of extension
     */
    public String extensionNumber;

    public DeviceExtensionInfo id(Long id) {
        this.id = id;
        return this;
    }

    public DeviceExtensionInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public DeviceExtensionInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
}

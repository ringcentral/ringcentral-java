package com.ringcentral.definitions;


public class DeviceExtensionInfo
{
    /**
     * Internal identifier of an extension
     * Format: int64
     */
    public Long id;
    public DeviceExtensionInfo id(Long id)
    {
        this.id = id;
        return this;
    }

    /**
     * Canonical URL of an extension resource
     * Format: uri
     */
    public String uri;
    public DeviceExtensionInfo uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Short extension number
     */
    public String extensionNumber;
    public DeviceExtensionInfo extensionNumber(String extensionNumber)
    {
        this.extensionNumber = extensionNumber;
        return this;
    }
}
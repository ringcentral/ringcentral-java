package com.ringcentral.definitions;


public class FixedOrderAgentsExtensionInfo
{
    /**
     * Internal identifier of an extension
     */
    public String id;
    public FixedOrderAgentsExtensionInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Canonical URI of an extension
     */
    public String uri;
    public FixedOrderAgentsExtensionInfo uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Number of extension
     */
    public String extensionNumber;
    public FixedOrderAgentsExtensionInfo extensionNumber(String extensionNumber)
    {
        this.extensionNumber = extensionNumber;
        return this;
    }

    /**
     * Name of agent extension
     */
    public String name;
    public FixedOrderAgentsExtensionInfo name(String name)
    {
        this.name = name;
        return this;
    }
}
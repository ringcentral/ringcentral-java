package com.ringcentral.definitions;


public class BasicExtensionInfoResource
{
    /**
     */
    public String id;
    public BasicExtensionInfoResource id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     */
    public String name;
    public BasicExtensionInfoResource name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     */
    public String extensionNumber;
    public BasicExtensionInfoResource extensionNumber(String extensionNumber)
    {
        this.extensionNumber = extensionNumber;
        return this;
    }
}
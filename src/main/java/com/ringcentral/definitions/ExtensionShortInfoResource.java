package com.ringcentral.definitions;


public class ExtensionShortInfoResource
{
    /**
     * Internal identifier of an extension
     */
    public String id;
    public ExtensionShortInfoResource id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Extension name
     */
    public String name;
    public ExtensionShortInfoResource name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Extension number
     */
    public String extensionNumber;
    public ExtensionShortInfoResource extensionNumber(String extensionNumber)
    {
        this.extensionNumber = extensionNumber;
        return this;
    }
}
package com.ringcentral.definitions;


public class ForwardingNumberInfoExtension
{
    /**
     * Internal identifier of an extension
     */
    public String id;
    public ForwardingNumberInfoExtension id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Number of an extension
     */
    public String extensionNumber;
    public ForwardingNumberInfoExtension extensionNumber(String extensionNumber)
    {
        this.extensionNumber = extensionNumber;
        return this;
    }

    /**
     * Extension name
     */
    public String name;
    public ForwardingNumberInfoExtension name(String name)
    {
        this.name = name;
        return this;
    }
}
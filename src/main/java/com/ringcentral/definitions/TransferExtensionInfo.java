package com.ringcentral.definitions;


public class TransferExtensionInfo
{
    /**
     * Internal identifier of an extension the call is transferred to
     */
    public String id;
    public TransferExtensionInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Extension name
     */
    public String name;
    public TransferExtensionInfo name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Extension number
     */
    public String extensionNumber;
    public TransferExtensionInfo extensionNumber(String extensionNumber)
    {
        this.extensionNumber = extensionNumber;
        return this;
    }
}
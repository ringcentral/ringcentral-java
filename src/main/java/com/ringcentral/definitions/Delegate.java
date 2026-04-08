package com.ringcentral.definitions;


public class Delegate
{
    /**
     * Delegate id (equal as extension id of delegate)
     */
    public String id;
    public Delegate id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Delegate name
     */
    public String name;
    public Delegate name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Delegate account id
     */
    public String accountId;
    public Delegate accountId(String accountId)
    {
        this.accountId = accountId;
        return this;
    }

    /**
     * Delegate extension id
     * Required
     */
    public String extensionId;
    public Delegate extensionId(String extensionId)
    {
        this.extensionId = extensionId;
        return this;
    }
}
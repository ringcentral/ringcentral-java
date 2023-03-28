package com.ringcentral.definitions;


public class Delegate {
    /**
     * Delegate id (equal as extension id of delegate)
     */
    public String id;
    /**
     * Delegate name
     */
    public String name;
    /**
     * Delegate account id
     */
    public String accountId;
    /**
     * Delegate extension id
     * Required
     */
    public String extensionId;

    public Delegate id(String id) {
        this.id = id;
        return this;
    }

    public Delegate name(String name) {
        this.name = name;
        return this;
    }

    public Delegate accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public Delegate extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }
}

package com.ringcentral.definitions;


/**
 * Meeting host
 */
public class Host {
    /**
     * account id
     */
    public String accountId;
    /**
     * extension id
     */
    public String extensionId;
    /**
     * displayName
     */
    public String displayName;

    public Host accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public Host extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public Host displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
}

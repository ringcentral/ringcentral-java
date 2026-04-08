package com.ringcentral.definitions;

/** Meeting host */
public class Host {
    /** Account id */
    public String accountId;

    public Host accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /** Extension id */
    public String extensionId;

    public Host extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    /** Display name */
    public String displayName;

    public Host displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
}

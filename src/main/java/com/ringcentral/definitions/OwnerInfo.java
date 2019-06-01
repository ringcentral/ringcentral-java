package com.ringcentral.definitions;


public class OwnerInfo {
    /**
     * Internal identifier of an account
     */
    public String accountId;
    /**
     * Internal identifier of an extension
     */
    public String extensionId;

    public OwnerInfo accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public OwnerInfo extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

}

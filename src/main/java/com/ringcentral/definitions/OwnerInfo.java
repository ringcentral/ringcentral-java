package com.ringcentral.definitions;


// Deprecated. Information on call owner
public class OwnerInfo {
    /**
     * Internal identifier of an account that monitors a call
     */
    public String accountId;
    /**
     * Internal identifier of an extension that monitors a call
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

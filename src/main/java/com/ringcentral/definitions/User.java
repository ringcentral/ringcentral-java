package com.ringcentral.definitions;


public class User {
    /**
     * User account identifier
     * Required
     * Example: 664287016
     */
    public String accountId;
    /**
     * User extension identifier
     * Required
     * Example: 664307016
     */
    public String extensionId;

    public User accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public User extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }
}

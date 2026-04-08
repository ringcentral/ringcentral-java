package com.ringcentral.definitions;

public class RcwUserModel {
    /** User ID Required */
    public String userId;

    public RcwUserModel userId(String userId) {
        this.userId = userId;
        return this;
    }

    /** Account ID Required */
    public String accountId;

    public RcwUserModel accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
}

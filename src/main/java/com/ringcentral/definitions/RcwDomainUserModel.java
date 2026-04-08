package com.ringcentral.definitions;

public class RcwDomainUserModel {
    /** User ID Required */
    public String userId;

    public RcwDomainUserModel userId(String userId) {
        this.userId = userId;
        return this;
    }

    /** Account ID Required */
    public String accountId;

    public RcwDomainUserModel accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /** Identity domain Required Default: pbx Enum: pbx, ilm */
    public String domain;

    public RcwDomainUserModel domain(String domain) {
        this.domain = domain;
        return this;
    }
}

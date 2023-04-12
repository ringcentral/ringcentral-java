package com.ringcentral.definitions;


public class RcwDomainUserModel {
    /**
     * User ID
     * Required
     */
    public String userId;
    /**
     * Account ID
     * Required
     */
    public String accountId;
    /**
     * Identity domain
     * Required
     * Default: pbx
     * Enum: pbx, ilm
     */
    public String domain;

    public RcwDomainUserModel userId(String userId) {
        this.userId = userId;
        return this;
    }

    public RcwDomainUserModel accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public RcwDomainUserModel domain(String domain) {
        this.domain = domain;
        return this;
    }
}

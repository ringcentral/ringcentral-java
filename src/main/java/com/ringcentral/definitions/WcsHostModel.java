package com.ringcentral.definitions;

/** The internal IDs of RC-authenticated users. */
public class WcsHostModel {
    /** Describes host&#039;s license, &#039;true&#039; - license is active Required */
    public Boolean entitled;

    public WcsHostModel entitled(Boolean entitled) {
        this.entitled = entitled;
        return this;
    }

    /** User ID Required */
    public String userId;

    public WcsHostModel userId(String userId) {
        this.userId = userId;
        return this;
    }

    /** Account ID Required */
    public String accountId;

    public WcsHostModel accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /** */
    public RcwDomainUserModel linkedUser;

    public WcsHostModel linkedUser(RcwDomainUserModel linkedUser) {
        this.linkedUser = linkedUser;
        return this;
    }
}

package com.ringcentral.definitions;


/**
 * The internal IDs of RC-authenticated users.
 */
public class RcwLinkedUserModel {
    /**
     *
     */
    public RcwDomainUserModel linkedUser;

    public RcwLinkedUserModel linkedUser(RcwDomainUserModel linkedUser) {
        this.linkedUser = linkedUser;
        return this;
    }
}

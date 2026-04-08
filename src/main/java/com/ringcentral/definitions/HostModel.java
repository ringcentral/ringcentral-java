package com.ringcentral.definitions;

/** The internal IDs of RC-authenticated users. */
public class HostModel {
    /** First (given) name Example: John */
    public String firstName;

    public HostModel firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /** Last (family) name Example: Doe */
    public String lastName;

    public HostModel lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /** */
    public RcwDomainUserModel linkedUser;

    public HostModel linkedUser(RcwDomainUserModel linkedUser) {
        this.linkedUser = linkedUser;
        return this;
    }
}

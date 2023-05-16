package com.ringcentral.definitions;


public class BatchProvisionUsersRequestItemRoles {
    /**
     * Internal identifier of a role to be assigned
     * Example: 1
     */
    public String id;

    public BatchProvisionUsersRequestItemRoles id(String id) {
        this.id = id;
        return this;
    }
}

package com.ringcentral.definitions;


public class AssignedRolesResource {
    /**
     * Format: uri
     */
    public String uri;
    /**
     *
     */
    public AssignedRoleResource[] records;

    public AssignedRolesResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public AssignedRolesResource records(AssignedRoleResource[] records) {
        this.records = records;
        return this;
    }
}

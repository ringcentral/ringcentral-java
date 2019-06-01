package com.ringcentral.definitions;


public class AssistedUsersResource {
    /**
     *
     */
    public AssistedUserResource[] records;

    public AssistedUsersResource records(AssistedUserResource[] records) {
        this.records = records;
        return this;
    }

}

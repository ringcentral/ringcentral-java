package com.ringcentral.definitions;


public class BatchProvisionUsersResponse {
    /**
     * Required
     */
    public BatchProvisionUsersResponseResults[] results;

    public BatchProvisionUsersResponse results(BatchProvisionUsersResponseResults[] results) {
        this.results = results;
        return this;
    }
}

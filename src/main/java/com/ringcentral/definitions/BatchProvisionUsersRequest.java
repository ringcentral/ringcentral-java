package com.ringcentral.definitions;


/**
 * Describes request for user extension provisioning
 */
public class BatchProvisionUsersRequest {
    /**
     * Required
     */
    public BatchProvisionUsersRequestItem[] records;

    public BatchProvisionUsersRequest records(BatchProvisionUsersRequestItem[] records) {
        this.records = records;
        return this;
    }
}

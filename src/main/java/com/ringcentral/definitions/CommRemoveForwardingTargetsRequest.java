package com.ringcentral.definitions;


public class CommRemoveForwardingTargetsRequest {
    /**
     * Required
     */
    public CommRemoveForwardingTargetsRequestRecords[] records;

    public CommRemoveForwardingTargetsRequest records(CommRemoveForwardingTargetsRequestRecords[] records) {
        this.records = records;
        return this;
    }
}

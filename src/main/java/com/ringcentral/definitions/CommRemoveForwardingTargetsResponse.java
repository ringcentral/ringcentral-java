package com.ringcentral.definitions;


public class CommRemoveForwardingTargetsResponse {
    /**
     * Required
     */
    public CommRemoveForwardingTargetsItemResource[] records;

    public CommRemoveForwardingTargetsResponse records(CommRemoveForwardingTargetsItemResource[] records) {
        this.records = records;
        return this;
    }
}

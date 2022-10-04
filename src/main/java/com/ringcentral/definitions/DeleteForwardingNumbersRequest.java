package com.ringcentral.definitions;


public class DeleteForwardingNumbersRequest {
    /**
     * List of forwarding number ids
     */
    public ForwardingNumberId[] records;

    public DeleteForwardingNumbersRequest records(ForwardingNumberId[] records) {
        this.records = records;
        return this;
    }
}

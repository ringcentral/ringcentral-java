package com.ringcentral.definitions;


public class BulkAddDevicesResponse {
    /**
     * Required
     */
    public BulkAddDevicesResponseResults[] results;

    public BulkAddDevicesResponse results(BulkAddDevicesResponseResults[] results) {
        this.results = results;
        return this;
    }
}

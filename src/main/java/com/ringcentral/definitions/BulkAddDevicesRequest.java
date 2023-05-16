package com.ringcentral.definitions;


public class BulkAddDevicesRequest {
    /**
     * Required
     */
    public BulkAddDevicesItem[] records;

    public BulkAddDevicesRequest records(BulkAddDevicesItem[] records) {
        this.records = records;
        return this;
    }
}

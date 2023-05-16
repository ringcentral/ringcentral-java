package com.ringcentral.definitions;


public class DeleteDeviceFromInventoryRequest {
    /**
     * List of internal identifiers of the devices that should be deleted
     * Required
     */
    public DeleteDeviceFromInventoryRequestRecords[] records;

    public DeleteDeviceFromInventoryRequest records(DeleteDeviceFromInventoryRequestRecords[] records) {
        this.records = records;
        return this;
    }
}

package com.ringcentral.definitions;


public class DeleteDeviceFromInventoryResponse {
    /**
     * Required
     */
    public DeleteDeviceFromInventoryResponseRecords[] records;

    public DeleteDeviceFromInventoryResponse records(DeleteDeviceFromInventoryResponseRecords[] records) {
        this.records = records;
        return this;
    }
}

package com.ringcentral.definitions;


public class DeleteDeviceFromInventoryRequestRecords {
    /**
     * Internal identifier of a device that should be deleted
     */
    public String deviceId;

    public DeleteDeviceFromInventoryRequestRecords deviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
}

package com.ringcentral.definitions;


public class DeleteDeviceFromInventoryResponseRecords {
    /**
     * Specifies if a device is successfully deleted
     */
    public Boolean bulkItemSuccessful;
    /**
     * Internal identifier of a device
     */
    public String deviceId;
    /**
     * The list of errors occurred during processing of particular item of bulk operation.
     * Returned only if `bulkItemSuccessful` is false
     */
    public ApiError[] bulkItemErrors;

    public DeleteDeviceFromInventoryResponseRecords bulkItemSuccessful(Boolean bulkItemSuccessful) {
        this.bulkItemSuccessful = bulkItemSuccessful;
        return this;
    }

    public DeleteDeviceFromInventoryResponseRecords deviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    public DeleteDeviceFromInventoryResponseRecords bulkItemErrors(ApiError[] bulkItemErrors) {
        this.bulkItemErrors = bulkItemErrors;
        return this;
    }
}

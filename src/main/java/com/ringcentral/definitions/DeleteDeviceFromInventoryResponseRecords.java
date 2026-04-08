package com.ringcentral.definitions;

public class DeleteDeviceFromInventoryResponseRecords {
    /** Specifies if a device is successfully deleted */
    public Boolean bulkItemSuccessful;

    public DeleteDeviceFromInventoryResponseRecords bulkItemSuccessful(Boolean bulkItemSuccessful) {
        this.bulkItemSuccessful = bulkItemSuccessful;
        return this;
    }

    /** Internal identifier of a device */
    public String deviceId;

    public DeleteDeviceFromInventoryResponseRecords deviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * The list of errors occurred during processing of particular item of bulk operation. Returned
     * only if `bulkItemSuccessful` is false
     */
    public ApiError[] bulkItemErrors;

    public DeleteDeviceFromInventoryResponseRecords bulkItemErrors(ApiError[] bulkItemErrors) {
        this.bulkItemErrors = bulkItemErrors;
        return this;
    }
}

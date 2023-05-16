package com.ringcentral.definitions;


public class BulkAddDevicesErrorItem {
    /**
     * Indicates if the provisioning operation was successful for this item, always `false` in this model
     * Required
     */
    public Boolean successful;
    /**
     * Required
     */
    public ApiErrorWithParameter[] errors;

    public BulkAddDevicesErrorItem successful(Boolean successful) {
        this.successful = successful;
        return this;
    }

    public BulkAddDevicesErrorItem errors(ApiErrorWithParameter[] errors) {
        this.errors = errors;
        return this;
    }
}

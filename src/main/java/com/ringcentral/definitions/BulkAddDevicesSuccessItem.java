package com.ringcentral.definitions;


public class BulkAddDevicesSuccessItem {
    /**
     * Indicates if the provisioning operation was successful for this item, always `true` in this model
     * Required
     * Example: true
     */
    public Boolean successful;
    /**
     * Internal identifier of the created device
     * Required
     * Example: 787878
     */
    public String id;
    /**
     * Required
     */
    public BulkOperationExtensionReference extension;
    /**
     * Phone number in e.164 format (with &#039;+&#039; prefix)
     * Required
     * Example: +16501234567
     */
    public String phoneNumber;

    public BulkAddDevicesSuccessItem successful(Boolean successful) {
        this.successful = successful;
        return this;
    }

    public BulkAddDevicesSuccessItem id(String id) {
        this.id = id;
        return this;
    }

    public BulkAddDevicesSuccessItem extension(BulkOperationExtensionReference extension) {
        this.extension = extension;
        return this;
    }

    public BulkAddDevicesSuccessItem phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}

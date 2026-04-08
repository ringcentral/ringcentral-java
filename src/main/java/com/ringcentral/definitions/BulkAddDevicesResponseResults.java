package com.ringcentral.definitions;


public class BulkAddDevicesResponseResults
{
    /**
     * Indicates if the provisioning operation was successful for this item, always `false` in this model
     */
    public Boolean successful;
    public BulkAddDevicesResponseResults successful(Boolean successful)
    {
        this.successful = successful;
        return this;
    }

    /**
     * Internal identifier of the created device
     * Example: 787878
     */
    public String id;
    public BulkAddDevicesResponseResults id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     */
    public BulkOperationExtensionReference extension;
    public BulkAddDevicesResponseResults extension(BulkOperationExtensionReference extension)
    {
        this.extension = extension;
        return this;
    }

    /**
     * Phone number in e.164 format (with &#039;+&#039; prefix)
     * Example: +16501234567
     */
    public String phoneNumber;
    public BulkAddDevicesResponseResults phoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     */
    public ApiErrorWithParameter[] errors;
    public BulkAddDevicesResponseResults errors(ApiErrorWithParameter[] errors)
    {
        this.errors = errors;
        return this;
    }
}
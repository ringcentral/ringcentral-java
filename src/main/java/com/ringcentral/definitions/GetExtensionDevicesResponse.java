package com.ringcentral.definitions;


public class GetExtensionDevicesResponse
{
    /**
     * Link to the list of extension devices
     */
    public String uri;
    public GetExtensionDevicesResponse uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * List of extension devices
     * Required
     */
    public ExtensionDeviceResponse[] records;
    public GetExtensionDevicesResponse records(ExtensionDeviceResponse[] records)
    {
        this.records = records;
        return this;
    }

    /**
     * Required
     */
    public DeviceProvisioningNavigationInfo navigation;
    public GetExtensionDevicesResponse navigation(DeviceProvisioningNavigationInfo navigation)
    {
        this.navigation = navigation;
        return this;
    }

    /**
     * Required
     */
    public DeviceProvisioningPagingInfo paging;
    public GetExtensionDevicesResponse paging(DeviceProvisioningPagingInfo paging)
    {
        this.paging = paging;
        return this;
    }
}
package com.ringcentral.definitions;


public class GetExtensionDevicesResponse {
    /**
     * Link to the list of extension devices
     */
    public String uri;
    /**
     * List of extension devices
     * Required
     */
    public ExtensionDeviceResponse[] records;
    /**
     * Required
     */
    public DeviceProvisioningNavigationInfo navigation;
    /**
     * Required
     */
    public DeviceProvisioningPagingInfo paging;

    public GetExtensionDevicesResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    public GetExtensionDevicesResponse records(ExtensionDeviceResponse[] records) {
        this.records = records;
        return this;
    }

    public GetExtensionDevicesResponse navigation(DeviceProvisioningNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public GetExtensionDevicesResponse paging(DeviceProvisioningPagingInfo paging) {
        this.paging = paging;
        return this;
    }
}

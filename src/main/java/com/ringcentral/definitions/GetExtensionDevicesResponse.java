package com.ringcentral.definitions;


public class GetExtensionDevicesResponse {
    /**
     * List of extension devices
     * Required
     */
    public GetDeviceInfoResponse[] records;
    /**
     * Information on navigation
     * Required
     */
    public DeviceProvisioningNavigationInfo navigation;
    /**
     * Information on paging
     * Required
     */
    public DeviceProvisioningPagingInfo paging;

    public GetExtensionDevicesResponse records(GetDeviceInfoResponse[] records) {
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

package com.ringcentral.definitions;


public class GetExtensionDevicesResponse {
    /**
     * Link to a list of extension devices
     * Format: uri
     */
    public String uri;
    /**
     * List of extension devices
     * Required
     */
    public DeviceResource[] records;
    /**
     * Required
     */
    public PageNavigationModel navigation;
    /**
     * Required
     */
    public EnumeratedPagingModel paging;

    public GetExtensionDevicesResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    public GetExtensionDevicesResponse records(DeviceResource[] records) {
        this.records = records;
        return this;
    }

    public GetExtensionDevicesResponse navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }

    public GetExtensionDevicesResponse paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}

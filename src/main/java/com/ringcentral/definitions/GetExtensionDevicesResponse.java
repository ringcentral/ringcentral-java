package com.ringcentral.definitions;


public class GetExtensionDevicesResponse
{
    /**
     * Link to a list of extension devices
     * Format: uri
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
    public DeviceResource[] records;
    public GetExtensionDevicesResponse records(DeviceResource[] records)
    {
        this.records = records;
        return this;
    }

    /**
     * Required
     */
    public PageNavigationModel navigation;
    public GetExtensionDevicesResponse navigation(PageNavigationModel navigation)
    {
        this.navigation = navigation;
        return this;
    }

    /**
     * Required
     */
    public EnumeratedPagingModel paging;
    public GetExtensionDevicesResponse paging(EnumeratedPagingModel paging)
    {
        this.paging = paging;
        return this;
    }
}
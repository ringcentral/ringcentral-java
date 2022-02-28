package com.ringcentral.definitions;


public class ListDevicesAutomaticLocationUpdates
{
    /**
     * Link to devices resource
     */
    public String uri;
    public ListDevicesAutomaticLocationUpdates uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * List of users&#039; devices with the current status of Emergency Address Auto Update Feature
     */
    public AutomaticLocationUpdatesDeviceInfo[] records;
    public ListDevicesAutomaticLocationUpdates records(AutomaticLocationUpdatesDeviceInfo[] records)
    {
        this.records = records;
        return this;
    }

    /**
     */
    public ProvisioningNavigationInfo navigation;
    public ListDevicesAutomaticLocationUpdates navigation(ProvisioningNavigationInfo navigation)
    {
        this.navigation = navigation;
        return this;
    }

    /**
     */
    public ProvisioningPagingInfo paging;
    public ListDevicesAutomaticLocationUpdates paging(ProvisioningPagingInfo paging)
    {
        this.paging = paging;
        return this;
    }
}
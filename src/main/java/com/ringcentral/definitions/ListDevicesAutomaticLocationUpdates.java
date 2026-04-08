package com.ringcentral.definitions;


public class ListDevicesAutomaticLocationUpdates
{
    /**
     * Link to a devices resource
     * Format: uri
     */
    public String uri;
    public ListDevicesAutomaticLocationUpdates uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * List of the user(s) devices with the current status of Emergency
    * Address Auto Update Feature
     */
    public AutomaticLocationUpdatesDeviceInfo[] records;
    public ListDevicesAutomaticLocationUpdates records(AutomaticLocationUpdatesDeviceInfo[] records)
    {
        this.records = records;
        return this;
    }

    /**
     */
    public PageNavigationModel navigation;
    public ListDevicesAutomaticLocationUpdates navigation(PageNavigationModel navigation)
    {
        this.navigation = navigation;
        return this;
    }

    /**
     */
    public EnumeratedPagingModel paging;
    public ListDevicesAutomaticLocationUpdates paging(EnumeratedPagingModel paging)
    {
        this.paging = paging;
        return this;
    }
}
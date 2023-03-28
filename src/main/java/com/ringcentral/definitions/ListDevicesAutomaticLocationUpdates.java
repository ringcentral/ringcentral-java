package com.ringcentral.definitions;


public class ListDevicesAutomaticLocationUpdates {
    /**
     * Link to a devices resource
     * Format: uri
     */
    public String uri;
    /**
     * List of the user(s) devices with the current status of Emergency
     * Address Auto Update Feature
     */
    public AutomaticLocationUpdatesDeviceInfo[] records;
    /**
     *
     */
    public ProvisioningNavigationInfo navigation;
    /**
     *
     */
    public ProvisioningPagingInfo paging;

    public ListDevicesAutomaticLocationUpdates uri(String uri) {
        this.uri = uri;
        return this;
    }

    public ListDevicesAutomaticLocationUpdates records(AutomaticLocationUpdatesDeviceInfo[] records) {
        this.records = records;
        return this;
    }

    public ListDevicesAutomaticLocationUpdates navigation(ProvisioningNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public ListDevicesAutomaticLocationUpdates paging(ProvisioningPagingInfo paging) {
        this.paging = paging;
        return this;
    }
}

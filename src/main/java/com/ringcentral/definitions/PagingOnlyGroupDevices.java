package com.ringcentral.definitions;


public class PagingOnlyGroupDevices {
    /**
     * Link to the list of devices assigned to the paging only group
     */
    public String uri;
    /**
     * List of paging devices assigned to this group
     */
    public PagingDeviceInfo[] records;
    /**
     *
     */
    public ProvisioningNavigationInfo navigation;
    /**
     *
     */
    public ProvisioningPagingInfo paging;

    public PagingOnlyGroupDevices uri(String uri) {
        this.uri = uri;
        return this;
    }

    public PagingOnlyGroupDevices records(PagingDeviceInfo[] records) {
        this.records = records;
        return this;
    }

    public PagingOnlyGroupDevices navigation(ProvisioningNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public PagingOnlyGroupDevices paging(ProvisioningPagingInfo paging) {
        this.paging = paging;
        return this;
    }
}

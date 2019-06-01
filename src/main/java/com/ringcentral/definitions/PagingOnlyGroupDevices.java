package com.ringcentral.definitions;


public class PagingOnlyGroupDevices {
    /**
     * List of paging devices assigned to this group
     */
    public PagingDeviceInfo[] records;
    /**
     * Information on navigation
     */
    public ProvisioningNavigationInfo navigation;
    /**
     * Information on paging
     */
    public ProvisioningPagingInfo paging;

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

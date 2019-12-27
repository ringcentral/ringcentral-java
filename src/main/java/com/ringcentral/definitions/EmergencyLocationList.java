package com.ringcentral.definitions;


public class EmergencyLocationList {
    /**
     *
     */
    public EmergencyLocationInfo[] records;
    /**
     * Information on navigation
     */
    public ProvisioningNavigationInfo navigation;
    /**
     * Information on paging
     */
    public ProvisioningPagingInfo paging;

    public EmergencyLocationList records(EmergencyLocationInfo[] records) {
        this.records = records;
        return this;
    }

    public EmergencyLocationList navigation(ProvisioningNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public EmergencyLocationList paging(ProvisioningPagingInfo paging) {
        this.paging = paging;
        return this;
    }

}

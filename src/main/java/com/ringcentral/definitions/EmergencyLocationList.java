package com.ringcentral.definitions;


public class EmergencyLocationList {
    /**
     * Link to the emergency location list resource
     */
    public String uri;
    /**
     *
     */
    public EmergencyLocationInfo[] records;
    /**
     *
     */
    public ProvisioningNavigationInfo navigation;
    /**
     *
     */
    public ProvisioningPagingInfo paging;

    public EmergencyLocationList uri(String uri) {
        this.uri = uri;
        return this;
    }

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

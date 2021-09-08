package com.ringcentral.definitions;


public class EmergencyLocationsResource {
    /**
     *
     */
    public EmergencyLocationInfo[] records;
    /**
     *
     */
    public ProvisioningPagingInfo paging;

    public EmergencyLocationsResource records(EmergencyLocationInfo[] records) {
        this.records = records;
        return this;
    }

    public EmergencyLocationsResource paging(ProvisioningPagingInfo paging) {
        this.paging = paging;
        return this;
    }
}

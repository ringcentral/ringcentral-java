package com.ringcentral.definitions;


public class EmergencyLocationsResource {
    /**
     *
     */
    public CommonEmergencyLocationResource[] records;
    /**
     *
     */
    public EmergencyLocationsPaging paging;

    public EmergencyLocationsResource records(CommonEmergencyLocationResource[] records) {
        this.records = records;
        return this;
    }

    public EmergencyLocationsResource paging(EmergencyLocationsPaging paging) {
        this.paging = paging;
        return this;
    }
}

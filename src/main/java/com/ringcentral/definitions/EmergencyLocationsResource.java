package com.ringcentral.definitions;


public class EmergencyLocationsResource {
    /**
     *
     */
    public EmergencyLocationResource[] records;
    /**
     *
     */
    public EmergencyLocationsPaging paging;

    public EmergencyLocationsResource records(EmergencyLocationResource[] records) {
        this.records = records;
        return this;
    }

    public EmergencyLocationsResource paging(EmergencyLocationsPaging paging) {
        this.paging = paging;
        return this;
    }
}

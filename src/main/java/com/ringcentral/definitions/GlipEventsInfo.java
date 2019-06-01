package com.ringcentral.definitions;


public class GlipEventsInfo {
    /**
     * List of events created by the current user
     */
    public GlipEventInfo[] records;
    /**
     *
     */
    public GlipNavigationInfo navigation;

    public GlipEventsInfo records(GlipEventInfo[] records) {
        this.records = records;
        return this;
    }

    public GlipEventsInfo navigation(GlipNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

}

package com.ringcentral.definitions;

public class CallMonitoringGroups {
    /** Link to a call monitoring groups resource Required Format: uri */
    public String uri;

    public CallMonitoringGroups uri(String uri) {
        this.uri = uri;
        return this;
    }

    /** List of call monitoring group members Required */
    public CallMonitoringGroup[] records;

    public CallMonitoringGroups records(CallMonitoringGroup[] records) {
        this.records = records;
        return this;
    }

    /** Required */
    public PageNavigationModel navigation;

    public CallMonitoringGroups navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }

    /** Required */
    public EnumeratedPagingModel paging;

    public CallMonitoringGroups paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}

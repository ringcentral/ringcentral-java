package com.ringcentral.definitions;


public class CallMonitoringGroups {
    /**
     * Link to a call monitoring groups resource
     * Required
     * Format: uri
     */
    public String uri;
    /**
     * List of call monitoring group members
     * Required
     */
    public CallMonitoringGroup[] records;
    /**
     * Required
     */
    public PageNavigationModel navigation;
    /**
     * Required
     */
    public EnumeratedPagingModel paging;

    public CallMonitoringGroups uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CallMonitoringGroups records(CallMonitoringGroup[] records) {
        this.records = records;
        return this;
    }

    public CallMonitoringGroups navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }

    public CallMonitoringGroups paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}

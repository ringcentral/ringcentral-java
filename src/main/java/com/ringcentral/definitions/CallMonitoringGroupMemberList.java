package com.ringcentral.definitions;


public class CallMonitoringGroupMemberList {
    /**
     * Link to a call monitoring group members resource
     * Required
     * Format: uri
     */
    public String uri;
    /**
     * List of a call monitoring group members
     * Required
     */
    public CallMonitoringGroupMemberInfo[] records;
    /**
     * Required
     */
    public PageNavigationModel navigation;
    /**
     * Required
     */
    public EnumeratedPagingModel paging;

    public CallMonitoringGroupMemberList uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CallMonitoringGroupMemberList records(CallMonitoringGroupMemberInfo[] records) {
        this.records = records;
        return this;
    }

    public CallMonitoringGroupMemberList navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }

    public CallMonitoringGroupMemberList paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}

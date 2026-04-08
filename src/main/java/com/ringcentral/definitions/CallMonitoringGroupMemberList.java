package com.ringcentral.definitions;


public class CallMonitoringGroupMemberList
{
    /**
     * Link to a call monitoring group members resource
     * Required
     * Format: uri
     */
    public String uri;
    public CallMonitoringGroupMemberList uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * List of a call monitoring group members
     * Required
     */
    public CallMonitoringGroupMemberInfo[] records;
    public CallMonitoringGroupMemberList records(CallMonitoringGroupMemberInfo[] records)
    {
        this.records = records;
        return this;
    }

    /**
     * Required
     */
    public PageNavigationModel navigation;
    public CallMonitoringGroupMemberList navigation(PageNavigationModel navigation)
    {
        this.navigation = navigation;
        return this;
    }

    /**
     * Required
     */
    public EnumeratedPagingModel paging;
    public CallMonitoringGroupMemberList paging(EnumeratedPagingModel paging)
    {
        this.paging = paging;
        return this;
    }
}
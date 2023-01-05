package com.ringcentral.definitions;


public class CallMonitoringGroups
{
    /**
     * Link to a call monitoring groups resource
     * Required
     * Format: uri
     */
    public String uri;
    public CallMonitoringGroups uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * List of call monitoring group members
     * Required
     */
    public CallMonitoringGroup[] records;
    public CallMonitoringGroups records(CallMonitoringGroup[] records)
    {
        this.records = records;
        return this;
    }

    /**
     * Required
     */
    public ProvisioningNavigationInfo navigation;
    public CallMonitoringGroups navigation(ProvisioningNavigationInfo navigation)
    {
        this.navigation = navigation;
        return this;
    }

    /**
     * Required
     */
    public ProvisioningPagingInfo paging;
    public CallMonitoringGroups paging(ProvisioningPagingInfo paging)
    {
        this.paging = paging;
        return this;
    }
}
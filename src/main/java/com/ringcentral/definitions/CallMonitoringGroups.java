package com.ringcentral.definitions;


public class CallMonitoringGroups {
    /**
     * Link to a call monitoring groups resource
     * Required
     */
    public String uri;
    /**
     * List of call monitoring group members
     * Required
     */
    public CallMonitoringGroup[] records;
    /**
     * Information on navigation
     * Required
     */
    public ProvisioningNavigationInfo navigation;
    /**
     * Information on paging
     * Required
     */
    public ProvisioningPagingInfo paging;

    public CallMonitoringGroups uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CallMonitoringGroups records(CallMonitoringGroup[] records) {
        this.records = records;
        return this;
    }

    public CallMonitoringGroups navigation(ProvisioningNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public CallMonitoringGroups paging(ProvisioningPagingInfo paging) {
        this.paging = paging;
        return this;
    }

}

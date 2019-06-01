package com.ringcentral.definitions;


public class CallMonitoringGroupMemberList {
    /**
     * Link to a call monitoring group members resource
     * Required
     */
    public String uri;
    /**
     * List of a call monitoring group members
     * Required
     */
    public CallMonitoringGroupMemberInfo[] records;
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

    public CallMonitoringGroupMemberList uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CallMonitoringGroupMemberList records(CallMonitoringGroupMemberInfo[] records) {
        this.records = records;
        return this;
    }

    public CallMonitoringGroupMemberList navigation(ProvisioningNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public CallMonitoringGroupMemberList paging(ProvisioningPagingInfo paging) {
        this.paging = paging;
        return this;
    }

}

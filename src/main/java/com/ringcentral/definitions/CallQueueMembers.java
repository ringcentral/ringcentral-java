package com.ringcentral.definitions;


public class CallQueueMembers {
    /**
     * Link to a call queue members resource
     * Required
     */
    public String uri;
    /**
     * List of call queue members
     * Required
     */
    public CallQueueMemberInfo[] records;
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

    public CallQueueMembers uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CallQueueMembers records(CallQueueMemberInfo[] records) {
        this.records = records;
        return this;
    }

    public CallQueueMembers navigation(ProvisioningNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public CallQueueMembers paging(ProvisioningPagingInfo paging) {
        this.paging = paging;
        return this;
    }

}

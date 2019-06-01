package com.ringcentral.definitions;


public class CallQueues {
    /**
     * Link to a call queues resource
     * Required
     */
    public String uri;
    /**
     * List of call queues
     * Required
     */
    public CallQueueInfo[] records;
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

    public CallQueues uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CallQueues records(CallQueueInfo[] records) {
        this.records = records;
        return this;
    }

    public CallQueues navigation(ProvisioningNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public CallQueues paging(ProvisioningPagingInfo paging) {
        this.paging = paging;
        return this;
    }

}

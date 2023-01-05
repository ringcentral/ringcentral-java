package com.ringcentral.definitions;


public class CallQueues
{
    /**
     * Link to a call queues resource
     * Required
     * Format: uri
     */
    public String uri;
    public CallQueues uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * List of call queues
     * Required
     */
    public CallQueueInfo[] records;
    public CallQueues records(CallQueueInfo[] records)
    {
        this.records = records;
        return this;
    }

    /**
     * Required
     */
    public ProvisioningNavigationInfo navigation;
    public CallQueues navigation(ProvisioningNavigationInfo navigation)
    {
        this.navigation = navigation;
        return this;
    }

    /**
     * Required
     */
    public ProvisioningPagingInfo paging;
    public CallQueues paging(ProvisioningPagingInfo paging)
    {
        this.paging = paging;
        return this;
    }
}
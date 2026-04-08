package com.ringcentral.definitions;


public class CallQueueList
{
    /**
     * Link to a call queues resource
     * Required
     * Format: uri
     */
    public String uri;
    public CallQueueList uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * List of call queues
     * Required
     */
    public CallQueueInfo[] records;
    public CallQueueList records(CallQueueInfo[] records)
    {
        this.records = records;
        return this;
    }

    /**
     * Required
     */
    public PageNavigationModel navigation;
    public CallQueueList navigation(PageNavigationModel navigation)
    {
        this.navigation = navigation;
        return this;
    }

    /**
     * Required
     */
    public EnumeratedPagingModel paging;
    public CallQueueList paging(EnumeratedPagingModel paging)
    {
        this.paging = paging;
        return this;
    }
}
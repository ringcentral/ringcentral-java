package com.ringcentral.definitions;


public class CallQueues {
    /**
     * Link to a call queues resource
     * Required
     * Format: uri
     */
    public String uri;
    /**
     * List of call queues
     * Required
     */
    public CallQueueInfo[] records;
    /**
     * Required
     */
    public PageNavigationModel navigation;
    /**
     * Required
     */
    public EnumeratedPagingModel paging;

    public CallQueues uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CallQueues records(CallQueueInfo[] records) {
        this.records = records;
        return this;
    }

    public CallQueues navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }

    public CallQueues paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}

package com.ringcentral.definitions;


public class CallQueueList {
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

    public CallQueueList uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CallQueueList records(CallQueueInfo[] records) {
        this.records = records;
        return this;
    }

    public CallQueueList navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }

    public CallQueueList paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}

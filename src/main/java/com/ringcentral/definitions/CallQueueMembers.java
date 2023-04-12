package com.ringcentral.definitions;


public class CallQueueMembers {
    /**
     * Link to a call queue members resource
     * Required
     * Format: uri
     */
    public String uri;
    /**
     * List of call queue members
     * Required
     */
    public CallQueueMemberInfo[] records;
    /**
     * Required
     */
    public PageNavigationModel navigation;
    /**
     * Required
     */
    public EnumeratedPagingModel paging;

    public CallQueueMembers uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CallQueueMembers records(CallQueueMemberInfo[] records) {
        this.records = records;
        return this;
    }

    public CallQueueMembers navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }

    public CallQueueMembers paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}

package com.ringcentral.definitions;

public class CallQueueMembers {
    /** Link to a call queue members resource Required Format: uri */
    public String uri;

    public CallQueueMembers uri(String uri) {
        this.uri = uri;
        return this;
    }

    /** List of call queue members Required */
    public CallQueueMemberInfo[] records;

    public CallQueueMembers records(CallQueueMemberInfo[] records) {
        this.records = records;
        return this;
    }

    /** Required */
    public PageNavigationModel navigation;

    public CallQueueMembers navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }

    /** Required */
    public EnumeratedPagingModel paging;

    public CallQueueMembers paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}

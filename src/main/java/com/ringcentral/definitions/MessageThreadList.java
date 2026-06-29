package com.ringcentral.definitions;

public class MessageThreadList {
    /** Required */
    public MessageThread[] records;

    public MessageThreadList records(MessageThread[] records) {
        this.records = records;
        return this;
    }

    /** Required */
    public EnumeratedPagingModel paging;

    public MessageThreadList paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}

package com.ringcentral.definitions;

public class ThreadMessageList {
    /** Required */
    public ThreadMessageModel[] records;

    public ThreadMessageList records(ThreadMessageModel[] records) {
        this.records = records;
        return this;
    }

    /** Required */
    public EnumeratedPagingModel paging;

    public ThreadMessageList paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}

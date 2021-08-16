package com.ringcentral.definitions;


public class MessageBatchListResponse {
    /**
     *
     */
    public MessageBatchInfo[] records;
    /**
     *
     */
    public PagingResource paging;

    public MessageBatchListResponse records(MessageBatchInfo[] records) {
        this.records = records;
        return this;
    }

    public MessageBatchListResponse paging(PagingResource paging) {
        this.paging = paging;
        return this;
    }
}

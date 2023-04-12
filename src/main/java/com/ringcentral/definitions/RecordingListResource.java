package com.ringcentral.definitions;


public class RecordingListResource {
    /**
     * Required
     */
    public RecordingItemModel[] records;
    /**
     * Required
     */
    public RcwPagingModel paging;

    public RecordingListResource records(RecordingItemModel[] records) {
        this.records = records;
        return this;
    }

    public RecordingListResource paging(RcwPagingModel paging) {
        this.paging = paging;
        return this;
    }
}

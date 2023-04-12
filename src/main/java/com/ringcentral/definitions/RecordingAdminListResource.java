package com.ringcentral.definitions;


public class RecordingAdminListResource {
    /**
     * Required
     */
    public RecordingAdminModel[] records;
    /**
     * Required
     */
    public RcwPagingModel paging;

    public RecordingAdminListResource records(RecordingAdminModel[] records) {
        this.records = records;
        return this;
    }

    public RecordingAdminListResource paging(RcwPagingModel paging) {
        this.paging = paging;
        return this;
    }
}

package com.ringcentral.definitions;

public class RecordingAdminListResource {
    /** Required */
    public RecordingAdminModel[] records;

    public RecordingAdminListResource records(RecordingAdminModel[] records) {
        this.records = records;
        return this;
    }

    /** Required */
    public RcwPagingModel paging;

    public RecordingAdminListResource paging(RcwPagingModel paging) {
        this.paging = paging;
        return this;
    }
}

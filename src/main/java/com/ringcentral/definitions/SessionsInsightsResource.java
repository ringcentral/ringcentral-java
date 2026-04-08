package com.ringcentral.definitions;

public class SessionsInsightsResource {
    /** Required */
    public RecordingInsights[] records;

    public SessionsInsightsResource records(RecordingInsights[] records) {
        this.records = records;
        return this;
    }

    /** Required */
    public RSPagingModel paging;

    public SessionsInsightsResource paging(RSPagingModel paging) {
        this.paging = paging;
        return this;
    }
}

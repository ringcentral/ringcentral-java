package com.ringcentral.definitions;


public class SessionsInsightsResource {
    /**
     * Required
     */
    public RecordingInsights[] records;
    /**
     * Required
     */
    public RSPagingModel paging;

    public SessionsInsightsResource records(RecordingInsights[] records) {
        this.records = records;
        return this;
    }

    public SessionsInsightsResource paging(RSPagingModel paging) {
        this.paging = paging;
        return this;
    }
}

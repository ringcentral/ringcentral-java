package com.ringcentral.definitions;


public class GetSessionInsightsResponse {
    /**
     * Required
     */
    public RecordingInsights[] records;
    /**
     * Required
     */
    public RSPagingModel paging;

    public GetSessionInsightsResponse records(RecordingInsights[] records) {
        this.records = records;
        return this;
    }

    public GetSessionInsightsResponse paging(RSPagingModel paging) {
        this.paging = paging;
        return this;
    }
}

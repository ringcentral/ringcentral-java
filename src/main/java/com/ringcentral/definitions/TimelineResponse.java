package com.ringcentral.definitions;


public class TimelineResponse {
    /**
     * Required
     */
    public ResponsePaging paging;
    /**
     * Required
     */
    public TimelineResponseData data;

    public TimelineResponse paging(ResponsePaging paging) {
        this.paging = paging;
        return this;
    }

    public TimelineResponse data(TimelineResponseData data) {
        this.data = data;
        return this;
    }
}

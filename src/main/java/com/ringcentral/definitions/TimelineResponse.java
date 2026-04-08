package com.ringcentral.definitions;


public class TimelineResponse
{
    /**
     * Required
     */
    public ResponsePaging paging;
    public TimelineResponse paging(ResponsePaging paging)
    {
        this.paging = paging;
        return this;
    }

    /**
     * Required
     */
    public TimelineResponseData data;
    public TimelineResponse data(TimelineResponseData data)
    {
        this.data = data;
        return this;
    }
}
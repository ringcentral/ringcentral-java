package com.ringcentral.definitions;


public class CommRangeResource
{
    /**
     * Start date-time
     * Required
     */
    public String startDateTime;
    public CommRangeResource startDateTime(String startDateTime)
    {
        this.startDateTime = startDateTime;
        return this;
    }

    /**
     * End date-time
     * Required
     */
    public String endDateTime;
    public CommRangeResource endDateTime(String endDateTime)
    {
        this.endDateTime = endDateTime;
        return this;
    }
}
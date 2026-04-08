package com.ringcentral.definitions;

public class CommRangeRequest {
    /** Start date-time */
    public String startDateTime;

    public CommRangeRequest startDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }

    /** End date-time Required */
    public String endDateTime;

    public CommRangeRequest endDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
        return this;
    }
}

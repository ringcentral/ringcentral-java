package com.ringcentral.definitions;


public class CommRangeResource {
    /**
     * Start date-time
     * Required
     * Format: date-time
     */
    public String startDateTime;
    /**
     * End date-time
     * Required
     * Format: date-time
     */
    public String endDateTime;

    public CommRangeResource startDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }

    public CommRangeResource endDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
        return this;
    }
}

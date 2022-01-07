package com.ringcentral.definitions;


// Query parameters for operation performanceReportCallsTimeline
public class PerformanceReportCallsTimelineParameters {
    /**
     * Aggregation interval
     * Enum: Hour, Day, Week, Month
     */
    public String interval;

    public PerformanceReportCallsTimelineParameters interval(String interval) {
        this.interval = interval;
        return this;
    }
}

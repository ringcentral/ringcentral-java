package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsTimeInterval {
    /**
     * Time in format hh:mm
     * Required
     */
    public String from;
    /**
     * Time in format hh:mm
     * Required
     */
    public String to;

    public AnalyticsLegacyPerformanceCallsTimeInterval from(String from) {
        this.from = from;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsTimeInterval to(String to) {
        this.to = to;
        return this;
    }
}

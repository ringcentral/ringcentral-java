package com.ringcentral.definitions;


public class PerformanceCallsTimeInterval {
    /**
     * Starting time in the fromat hh:mm
     * Required
     */
    public String from;
    /**
     * Ending time in the format hh:mm
     * Required
     */
    public String to;

    public PerformanceCallsTimeInterval from(String from) {
        this.from = from;
        return this;
    }

    public PerformanceCallsTimeInterval to(String to) {
        this.to = to;
        return this;
    }
}

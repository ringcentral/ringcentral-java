package com.ringcentral.definitions;


public class PerformanceCallsTimeInterval {
    /**
     * Time in format hh:mm
     */
    public String from;
    /**
     * Time in format hh:mm
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

package com.ringcentral.definitions;


public class PerformanceCallsTimer {
    /**
     * Required
     * Enum: Sum, Average, Max, Min
     */
    public String aggregationType;

    public PerformanceCallsTimer aggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
        return this;
    }
}

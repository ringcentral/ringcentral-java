package com.ringcentral.definitions;


public class PerformanceCallsCounter {
    /**
     * Required
     * Enum: Sum, Average, Max, Min
     */
    public String aggregationType;

    public PerformanceCallsCounter aggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
        return this;
    }
}

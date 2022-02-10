package com.ringcentral.definitions;


public class PerformanceCallsTimer {
    /**
     * Type of aggregation. If set to &#039;Min&#039;, &#039;Max&#039; or &#039;Average&#039; then `aggregationInterval` is supported. If set to &#039;Sum&#039; or &#039;Percent&#039; then `aggregationInterval` is not supported
     * Required
     * Enum: Sum, Average, Max, Min, Percent
     */
    public String aggregationType;
    /**
     * Interval of aggregation
     * Enum: Hour, Day, Week, Month
     */
    public String aggregationInterval;

    public PerformanceCallsTimer aggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
        return this;
    }

    public PerformanceCallsTimer aggregationInterval(String aggregationInterval) {
        this.aggregationInterval = aggregationInterval;
        return this;
    }
}

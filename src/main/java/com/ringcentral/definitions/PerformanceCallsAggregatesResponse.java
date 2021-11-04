package com.ringcentral.definitions;


public class PerformanceCallsAggregatesResponse {
    /**
     * Required
     */
    public java.util.Map<String, PerformanceCallsData> data;

    public PerformanceCallsAggregatesResponse data(java.util.Map<String, PerformanceCallsData> data) {
        this.data = data;
        return this;
    }
}

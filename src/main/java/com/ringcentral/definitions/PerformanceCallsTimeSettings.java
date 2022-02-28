package com.ringcentral.definitions;


/**
 * Date-time range for which the calls are aggregated. The call is considered to be within time range if it started within time range. Both borders are inclusive
 */
public class PerformanceCallsTimeSettings {
    /**
     * Required
     */
    public PerformanceCallsTimeRange timeRange;
    /**
     *
     */
    public PerformanceCallsAdvancedTimeSettings advancedTimeSettings;

    public PerformanceCallsTimeSettings timeRange(PerformanceCallsTimeRange timeRange) {
        this.timeRange = timeRange;
        return this;
    }

    public PerformanceCallsTimeSettings advancedTimeSettings(PerformanceCallsAdvancedTimeSettings advancedTimeSettings) {
        this.advancedTimeSettings = advancedTimeSettings;
        return this;
    }
}

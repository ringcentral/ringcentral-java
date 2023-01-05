package com.ringcentral.definitions;


    /**
* Date-time range for which the calls are aggregated. The call is considered to be within time range if it started within time range. Both borders are inclusive
*/
public class AnalyticsLegacyPerformanceCallsTimeSettings
{
    /**
     * Required
     */
    public AnalyticsLegacyPerformanceCallsTimeRange timeRange;
    public AnalyticsLegacyPerformanceCallsTimeSettings timeRange(AnalyticsLegacyPerformanceCallsTimeRange timeRange)
    {
        this.timeRange = timeRange;
        return this;
    }

    /**
     */
    public AnalyticsLegacyPerformanceCallsAdvancedTimeSettings advancedTimeSettings;
    public AnalyticsLegacyPerformanceCallsTimeSettings advancedTimeSettings(AnalyticsLegacyPerformanceCallsAdvancedTimeSettings advancedTimeSettings)
    {
        this.advancedTimeSettings = advancedTimeSettings;
        return this;
    }
}
package com.ringcentral.definitions;


    /**
* Conditional aggregation of calls based on the overall call length
*/
public class AnalyticsLegacyPerformanceCallsFilterByLength
{
    /**
     * Format: int64
     */
    public Long minValueSeconds;
    public AnalyticsLegacyPerformanceCallsFilterByLength minValueSeconds(Long minValueSeconds)
    {
        this.minValueSeconds = minValueSeconds;
        return this;
    }

    /**
     * Format: int64
     */
    public Long maxValueSeconds;
    public AnalyticsLegacyPerformanceCallsFilterByLength maxValueSeconds(Long maxValueSeconds)
    {
        this.maxValueSeconds = maxValueSeconds;
        return this;
    }
}
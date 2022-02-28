package com.ringcentral.definitions;


    /**
* Conditional aggregation of calls based on the time spent by specified mailbox(es) on call
*/
public class PerformanceCallsFilterTimeSpentByMailbox
{
    /**
     * Format: int64
     */
    public Long minValueSeconds;
    public PerformanceCallsFilterTimeSpentByMailbox minValueSeconds(Long minValueSeconds)
    {
        this.minValueSeconds = minValueSeconds;
        return this;
    }

    /**
     * Format: int64
     */
    public Long maxValueSeconds;
    public PerformanceCallsFilterTimeSpentByMailbox maxValueSeconds(Long maxValueSeconds)
    {
        this.maxValueSeconds = maxValueSeconds;
        return this;
    }
}
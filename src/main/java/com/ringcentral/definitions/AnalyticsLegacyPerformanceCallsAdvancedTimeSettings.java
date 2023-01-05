package com.ringcentral.definitions;


    /**
* Allows more granular control over time included in the report
*/
public class AnalyticsLegacyPerformanceCallsAdvancedTimeSettings
{
    /**
     * Name of the timezone that will be used for `includeDays` and `includeHours` filters. For example &#039;America/Los_Angeles&#039;, &#039;Europe/Moscow&#039;. See also *[Time Zones](https://www.iana.org/time-zones)*
     * Required
     */
    public String timeZone;
    public AnalyticsLegacyPerformanceCallsAdvancedTimeSettings timeZone(String timeZone)
    {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * Days of the week for which the report is calculated
     * Enum: Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
     */
    public String[] includeDays;
    public AnalyticsLegacyPerformanceCallsAdvancedTimeSettings includeDays(String[] includeDays)
    {
        this.includeDays = includeDays;
        return this;
    }

    /**
     * Hours of the day for which the report is calculated
     */
    public AnalyticsLegacyPerformanceCallsTimeInterval[] includeHours;
    public AnalyticsLegacyPerformanceCallsAdvancedTimeSettings includeHours(AnalyticsLegacyPerformanceCallsTimeInterval[] includeHours)
    {
        this.includeHours = includeHours;
        return this;
    }
}
package com.ringcentral.definitions;


    /**
* Allows more granular control over time included in the report
*/
public class PerformanceCallsAdvancedTimeSettings
{
    /**
     * IANA-compatible time zone name, for example &#039;America/Los_Angeles&#039;, &#039;Europe/Moscow&#039;. See also *[Time Zones](https://www.iana.org/time-zones)*
     */
    public String timeZone;
    public PerformanceCallsAdvancedTimeSettings timeZone(String timeZone)
    {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * Days of the week for which the report is calculated
     * Enum: Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
     */
    public String[] includeDays;
    public PerformanceCallsAdvancedTimeSettings includeDays(String[] includeDays)
    {
        this.includeDays = includeDays;
        return this;
    }

    /**
     * Hours of the day for which the report is calculated
     */
    public PerformanceCallsTimeInterval[] includeHours;
    public PerformanceCallsAdvancedTimeSettings includeHours(PerformanceCallsTimeInterval[] includeHours)
    {
        this.includeHours = includeHours;
        return this;
    }
}
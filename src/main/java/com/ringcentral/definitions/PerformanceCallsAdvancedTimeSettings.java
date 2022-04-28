package com.ringcentral.definitions;


/**
 * Allows more granular control over time included in the report
 */
public class PerformanceCallsAdvancedTimeSettings {
    /**
     * Name of the timezone that will be used for `includeDays` and `includeHours` filters. For example &#039;America/Los_Angeles&#039;, &#039;Europe/Moscow&#039;. See also *[Time Zones](https://www.iana.org/time-zones)*
     */
    public String timeZone;
    /**
     * Days of the week for which the report is calculated
     * Enum: Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
     */
    public String[] includeDays;
    /**
     * Hours of the day for which the report is calculated
     */
    public PerformanceCallsTimeInterval[] includeHours;

    public PerformanceCallsAdvancedTimeSettings timeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    public PerformanceCallsAdvancedTimeSettings includeDays(String[] includeDays) {
        this.includeDays = includeDays;
        return this;
    }

    public PerformanceCallsAdvancedTimeSettings includeHours(PerformanceCallsTimeInterval[] includeHours) {
        this.includeHours = includeHours;
        return this;
    }
}

package com.ringcentral.definitions;


/**
 * Date-time range for the calls. The call is considered to be within time range if it started within time range. Both borders are inclusive
 */
public class TimeSettings {
    /**
     * Name of the timezone that will be used for `includeDays` and `includeHours` filters and aggregation intervals. For example &#039;America/Los_Angeles&#039;, &#039;Europe/Zurich&#039;. See also *[Time Zones](https://www.iana.org/time-zones)*. Value in this field doesn&#039;t affect interpretation of time in `timeRange`, as it already includes offset from UTC
     * Required
     */
    public String timeZone;
    /**
     * Required
     */
    public TimeRange timeRange;
    /**
     *
     */
    public AdvancedTimeSettings advancedTimeSettings;

    public TimeSettings timeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    public TimeSettings timeRange(TimeRange timeRange) {
        this.timeRange = timeRange;
        return this;
    }

    public TimeSettings advancedTimeSettings(AdvancedTimeSettings advancedTimeSettings) {
        this.advancedTimeSettings = advancedTimeSettings;
        return this;
    }
}

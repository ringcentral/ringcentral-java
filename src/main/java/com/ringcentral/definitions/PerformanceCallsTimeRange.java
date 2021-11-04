package com.ringcentral.definitions;


// Date-time range for the calls aggregated. A call is considered to be in the time range if it started within the time frame specified. Both borders are inclusive.
public class PerformanceCallsTimeRange {
    /**
     * The start date-time for resulting records in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format including timezone, for example 2016-03-10T18:07:52.534Z.
     * Required
     * Format: date-time
     */
    public String timeFrom;
    /**
     * The end date-time for resulting records in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format including timezone, for example 2016-03-10T18:07:52.534Z.
     * Required
     * Format: date-time
     */
    public String timeTo;

    public PerformanceCallsTimeRange timeFrom(String timeFrom) {
        this.timeFrom = timeFrom;
        return this;
    }

    public PerformanceCallsTimeRange timeTo(String timeTo) {
        this.timeTo = timeTo;
        return this;
    }
}

package com.ringcentral.definitions;


    /**
* Time range for the request
*/
public class TimeRange
{
    /**
     * The start date-time for resulting records in RFC 3339 format including offset between local time and UTC, for example 2016-03-15T18:07:52.534Z
     * Required
     * Format: date-time
     */
    public String timeFrom;
    public TimeRange timeFrom(String timeFrom)
    {
        this.timeFrom = timeFrom;
        return this;
    }

    /**
     * The end date-time for resulting records in RFC 3339 format including offset between local time and UTC, for example 2016-03-15T18:07:52.534Z
     * Required
     * Format: date-time
     */
    public String timeTo;
    public TimeRange timeTo(String timeTo)
    {
        this.timeTo = timeTo;
        return this;
    }
}
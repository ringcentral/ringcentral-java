package com.ringcentral.definitions;

/** Query parameters for operation listAccountMeetings */
public class ListAccountMeetingsParameters {
    /**
     * The token indicating the particular page of the result set to be retrieved. If omitted the
     * first page will be returned.
     */
    public String pageToken;

    public ListAccountMeetingsParameters pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

    /** Number of meeting records requested Maximum: 100 Minimum: 10 Format: int32 Default: 25 */
    public Long perPage;

    public ListAccountMeetingsParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    /**
     * ISO 8601 datetime value used to filter meetings that represents the beginning of the range
     * for `startTime` Format: date-time
     */
    public String startTimeFrom;

    public ListAccountMeetingsParameters startTimeFrom(String startTimeFrom) {
        this.startTimeFrom = startTimeFrom;
        return this;
    }

    /**
     * ISO 8601 datetime value used to filter meetings that represents the end of the range for
     * `startTime` Format: date-time
     */
    public String startTimeTo;

    public ListAccountMeetingsParameters startTimeTo(String startTimeTo) {
        this.startTimeTo = startTimeTo;
        return this;
    }

    /**
     * Comma-separated list of fields with optional sort direction. Use a &#039;+&#039; prefix for
     * ascending order or &#039;-&#039; for descending order. E.g., orderBy=+startTime Default:
     * -startTime
     */
    public String orderBy;

    public ListAccountMeetingsParameters orderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
}

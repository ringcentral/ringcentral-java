package com.ringcentral.definitions;


/**
 * Query parameters for operation rcwHistoryListAllSessions
 */
public class RcwHistoryListAllSessionsParameters {
    /**
     * Filter to return only webinar sessions containing particular substring within their names
     * Example: All-hands
     */
    public String nameFragment;
    /**
     * Filter to return only webinar sessions in certain status. Multiple values are supported.
     * Example: Active,Finished
     * Enum: Scheduled, Active, Finished
     */
    public String[] status;
    /**
     * The beginning of the time window by &#039;endTime&#039; .
     * Format: date-time
     */
    public String endTimeFrom;
    /**
     * The end of the time window by &#039;endTime&#039; .
     * Format: date-time
     */
    public String endTimeTo;
    /**
     * The number of items per page. If provided value in the request
     * is greater than a maximum, the maximum value is applied
     * Maximum: 1000
     * Minimum: 1
     * Format: int32
     * Example: 100
     * Default: 100
     */
    public Long perPage;
    /**
     * The token indicating the particular page of the result set to be retrieved.
     * If omitted the first page will be returned.
     */
    public String pageToken;

    public RcwHistoryListAllSessionsParameters nameFragment(String nameFragment) {
        this.nameFragment = nameFragment;
        return this;
    }

    public RcwHistoryListAllSessionsParameters status(String[] status) {
        this.status = status;
        return this;
    }

    public RcwHistoryListAllSessionsParameters endTimeFrom(String endTimeFrom) {
        this.endTimeFrom = endTimeFrom;
        return this;
    }

    public RcwHistoryListAllSessionsParameters endTimeTo(String endTimeTo) {
        this.endTimeTo = endTimeTo;
        return this;
    }

    public RcwHistoryListAllSessionsParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public RcwHistoryListAllSessionsParameters pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
}

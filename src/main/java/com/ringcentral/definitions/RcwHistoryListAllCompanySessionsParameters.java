package com.ringcentral.definitions;


/**
 * Query parameters for operation rcwHistoryListAllCompanySessions
 */
public class RcwHistoryListAllCompanySessionsParameters {
    /**
     * Identifier of the user who hosts a webinar (if omitted, webinars hosted by all company users will be returned)
     * Example: 77777777
     */
    public String[] hostUserId;
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

    public RcwHistoryListAllCompanySessionsParameters hostUserId(String[] hostUserId) {
        this.hostUserId = hostUserId;
        return this;
    }

    public RcwHistoryListAllCompanySessionsParameters status(String[] status) {
        this.status = status;
        return this;
    }

    public RcwHistoryListAllCompanySessionsParameters endTimeFrom(String endTimeFrom) {
        this.endTimeFrom = endTimeFrom;
        return this;
    }

    public RcwHistoryListAllCompanySessionsParameters endTimeTo(String endTimeTo) {
        this.endTimeTo = endTimeTo;
        return this;
    }

    public RcwHistoryListAllCompanySessionsParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public RcwHistoryListAllCompanySessionsParameters pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
}

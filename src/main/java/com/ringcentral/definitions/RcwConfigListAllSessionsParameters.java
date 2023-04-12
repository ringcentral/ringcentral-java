package com.ringcentral.definitions;


/**
 * Query parameters for operation rcwConfigListAllSessions
 */
public class RcwConfigListAllSessionsParameters {
    /**
     * Filter to return only webinar sessions containing particular substring within their names
     * Example: All-hands
     */
    public String nameFragment;
    /**
     * Session status from Configuration service
     * Example: Finished
     * Enum: Scheduled, Active, Finished
     */
    public String status;
    /**
     * The beginning of the time window by &#039;endTime&#039; (it is calculated as scheduledStartTime+scheduledDuration)
     * Format: date-time
     */
    public String endTimeFrom;
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

    public RcwConfigListAllSessionsParameters nameFragment(String nameFragment) {
        this.nameFragment = nameFragment;
        return this;
    }

    public RcwConfigListAllSessionsParameters status(String status) {
        this.status = status;
        return this;
    }

    public RcwConfigListAllSessionsParameters endTimeFrom(String endTimeFrom) {
        this.endTimeFrom = endTimeFrom;
        return this;
    }

    public RcwConfigListAllSessionsParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public RcwConfigListAllSessionsParameters pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
}

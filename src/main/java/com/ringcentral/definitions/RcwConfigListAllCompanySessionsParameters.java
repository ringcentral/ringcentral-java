package com.ringcentral.definitions;


/**
 * Query parameters for operation rcwConfigListAllCompanySessions
 */
public class RcwConfigListAllCompanySessionsParameters {
    /**
     * Session status (for the purposes of Configuration service)
     * Example: Scheduled
     * Enum: Scheduled, Active, Finished
     */
    public String status;
    /**
     * The beginning of the time window by &#039;endTime&#039; (it is calculated as scheduledStartTime+scheduledDuration)
     * Format: date-time
     */
    public String endTimeFrom;
    /**
     * Identifier of the user who hosts a webinar (if omitted, webinars hosted by all company users will be returned)
     * Example: 77777777
     */
    public String[] hostUserId;
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

    public RcwConfigListAllCompanySessionsParameters status(String status) {
        this.status = status;
        return this;
    }

    public RcwConfigListAllCompanySessionsParameters endTimeFrom(String endTimeFrom) {
        this.endTimeFrom = endTimeFrom;
        return this;
    }

    public RcwConfigListAllCompanySessionsParameters hostUserId(String[] hostUserId) {
        this.hostUserId = hostUserId;
        return this;
    }

    public RcwConfigListAllCompanySessionsParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public RcwConfigListAllCompanySessionsParameters pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
}

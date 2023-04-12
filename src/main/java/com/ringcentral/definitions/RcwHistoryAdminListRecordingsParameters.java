package com.ringcentral.definitions;


/**
 * Query parameters for operation rcwHistoryAdminListRecordings
 */
public class RcwHistoryAdminListRecordingsParameters {
    /**
     * Filter to return only webinar recordings containing particular substring within their names
     * Example: All-hands
     */
    public String nameFragment;
    /**
     * The beginning of the time window by &#039;creationTime&#039; .
     * Format: date-time
     */
    public String creationTimeFrom;
    /**
     * The end of the time window by &#039;creationTime&#039; .
     * Format: date-time
     */
    public String creationTimeTo;
    /**
     * The status of the recording.
     * Enum: Processing, Available, Failed, Purged
     */
    public String[] status;
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

    public RcwHistoryAdminListRecordingsParameters nameFragment(String nameFragment) {
        this.nameFragment = nameFragment;
        return this;
    }

    public RcwHistoryAdminListRecordingsParameters creationTimeFrom(String creationTimeFrom) {
        this.creationTimeFrom = creationTimeFrom;
        return this;
    }

    public RcwHistoryAdminListRecordingsParameters creationTimeTo(String creationTimeTo) {
        this.creationTimeTo = creationTimeTo;
        return this;
    }

    public RcwHistoryAdminListRecordingsParameters status(String[] status) {
        this.status = status;
        return this;
    }

    public RcwHistoryAdminListRecordingsParameters hostUserId(String[] hostUserId) {
        this.hostUserId = hostUserId;
        return this;
    }

    public RcwHistoryAdminListRecordingsParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public RcwHistoryAdminListRecordingsParameters pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
}

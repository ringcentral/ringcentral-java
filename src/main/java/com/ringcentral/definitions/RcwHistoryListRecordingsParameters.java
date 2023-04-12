package com.ringcentral.definitions;


/**
 * Query parameters for operation rcwHistoryListRecordings
 */
public class RcwHistoryListRecordingsParameters {
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

    public RcwHistoryListRecordingsParameters creationTimeFrom(String creationTimeFrom) {
        this.creationTimeFrom = creationTimeFrom;
        return this;
    }

    public RcwHistoryListRecordingsParameters creationTimeTo(String creationTimeTo) {
        this.creationTimeTo = creationTimeTo;
        return this;
    }

    public RcwHistoryListRecordingsParameters status(String[] status) {
        this.status = status;
        return this;
    }

    public RcwHistoryListRecordingsParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public RcwHistoryListRecordingsParameters pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
}

package com.ringcentral.definitions;


/**
 * Query parameters for operation listVideoMeetings
 */
public class ListVideoMeetingsParameters {
    /**
     * Search text
     */
    public String text;
    /**
     * The token indicating the particular page of the result set to be retrieved.
     * If omitted the first page will be returned.
     */
    public String pageToken;
    /**
     * The number of items per page. If provided value in the request
     * is greater than a maximum, the maximum value is applied
     * Format: int32
     */
    public Long perPage;
    /**
     * Specifies types meeting to be returned. Possible values:
     * - &lt;empty&gt; (not passed) - return only the meetings where the requesting user is the participant OR host OR deputy OR watcher;
     * - `All`- return `Alive` meetings where the requesting user is the host OR deputy OR watcher;
     * - `My`- return `Alive` meetings where the requesting user is the host OR deputy;
     * - `Shared` - return `Alive` meetings where the requesting user is the watcher AND not host;
     * - `Deleted` - return `Deleted` meetings where the requesting user is the host OR deputy.
     * Enum: All, My, Deleted, Shared
     */
    public String type;
    /**
     * Unix timestamp in milliseconds (inclusive) indicates the start time of meetings which should be included in response
     * Format: int64
     */
    public Long startTime;
    /**
     * Unix timestamp in milliseconds (inclusive) indicates the end time of meetings which should be included in response
     * Format: int64
     */
    public Long endTime;

    public ListVideoMeetingsParameters text(String text) {
        this.text = text;
        return this;
    }

    public ListVideoMeetingsParameters pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

    public ListVideoMeetingsParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public ListVideoMeetingsParameters type(String type) {
        this.type = type;
        return this;
    }

    public ListVideoMeetingsParameters startTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    public ListVideoMeetingsParameters endTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
}

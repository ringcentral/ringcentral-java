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
     * Token to get the next page
     */
    public String pageToken;
    /**
     * Number of records returned
     * Format: int32
     */
    public Long perPage;
    /**
     * Specify what kind of meeting should be returned. Possible values: All, My, Deleted, Shared
     * Request type meaning in meeting search:
     * `None` (not passed) - take meetings only where requested acc/ext is participant OR host OR deputy OR watcher.
     * `ALL`- access rights of meeting is equal to Alive AND requested acc/ext  is in watchers list OR host OR deputy
     * `My`- access rights of meeting is equal to Alive AND requested acc/ext is host OR deputy
     * `Shared` - access rights of meeting is equal to Alive AND requested acc/ext is in watcher list AND not HOST
     * `Deleted` - access rights of meeting is equal to Delete and requested acc/ext is host OR deputy
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

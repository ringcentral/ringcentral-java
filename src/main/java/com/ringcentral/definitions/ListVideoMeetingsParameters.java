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
     * Type of returned data
     * Enum: All, My, Deleted, Shared
     */
    public String type;

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
}

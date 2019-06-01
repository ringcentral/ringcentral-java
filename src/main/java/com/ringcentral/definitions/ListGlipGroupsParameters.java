package com.ringcentral.definitions;


public class ListGlipGroupsParameters {
    /**
     * Type of groups to be fetched (by default all type of groups will be fetched)
     * Enum: Group, Team, PrivateChat, PersonalChat
     */
    public String type;
    /**
     * Number of groups to be fetched by one request. The maximum value is 250, by default - 30
     * Maximum: 250
     * Default: 30
     */
    public Long recordCount;
    /**
     * Pagination token.
     */
    public String pageToken;

    public ListGlipGroupsParameters type(String type) {
        this.type = type;
        return this;
    }

    public ListGlipGroupsParameters recordCount(Long recordCount) {
        this.recordCount = recordCount;
        return this;
    }

    public ListGlipGroupsParameters pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

}

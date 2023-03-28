package com.ringcentral.definitions;


/**
 * Query parameters for operation readGlipEventsNew
 */
public class ReadGlipEventsNewParameters {
    /**
     * Number of groups to be fetched by one request. The maximum value is 250, by default - 30.
     * Maximum: 250
     * Format: int32
     * Default: 30
     */
    public Long recordCount;
    /**
     * Token of a page to be returned
     */
    public String pageToken;

    public ReadGlipEventsNewParameters recordCount(Long recordCount) {
        this.recordCount = recordCount;
        return this;
    }

    public ReadGlipEventsNewParameters pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
}

package com.ringcentral.definitions;


/**
 * Query parameters for operation getExtensionRecordings
 */
public class GetExtensionRecordingsParameters {
    /**
     * Token to get the next page
     */
    public String pageToken;
    /**
     * Number of records returned
     * Format: int32
     */
    public Long perPage;

    public GetExtensionRecordingsParameters pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

    public GetExtensionRecordingsParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }
}

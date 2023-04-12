package com.ringcentral.definitions;


/**
 * Query parameters for operation getAccountRecordings
 */
public class GetAccountRecordingsParameters {
    /**
     * Token to get the next page
     */
    public String pageToken;
    /**
     * Number of records returned
     * Format: int32
     */
    public Long perPage;

    public GetAccountRecordingsParameters pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

    public GetAccountRecordingsParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }
}

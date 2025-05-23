package com.ringcentral.definitions;


/**
 * Query parameters for operation getAccountRecordings
 */
public class GetAccountRecordingsParameters {
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

    public GetAccountRecordingsParameters pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

    public GetAccountRecordingsParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }
}

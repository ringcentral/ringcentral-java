package com.ringcentral.definitions;


/**
 * Query parameters for operation getExtensionRecordings
 */
public class GetExtensionRecordingsParameters {
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

    public GetExtensionRecordingsParameters pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

    public GetExtensionRecordingsParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }
}

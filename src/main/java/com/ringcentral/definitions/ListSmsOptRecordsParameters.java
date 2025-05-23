package com.ringcentral.definitions;


/**
 * Query parameters for operation listSmsOptRecords
 */
public class ListSmsOptRecordsParameters {
    /**
     * The token indicating the particular page of the result set to be retrieved.
     * If omitted the first page will be returned.
     */
    public String pageToken;
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
     * The sender&#039;s phone number(s) to filter records
     */
    public String[] from;
    /**
     * The recipient&#039;s phone number(s) to filter records
     */
    public String[] to;
    /**
     * The opt status to filter records. If omitted, `OptOut` records` are returned
     * Default: OptOut
     * Enum: OptOut, OptIn
     */
    public String[] optStatus;

    public ListSmsOptRecordsParameters pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

    public ListSmsOptRecordsParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public ListSmsOptRecordsParameters from(String[] from) {
        this.from = from;
        return this;
    }

    public ListSmsOptRecordsParameters to(String[] to) {
        this.to = to;
        return this;
    }

    public ListSmsOptRecordsParameters optStatus(String[] optStatus) {
        this.optStatus = optStatus;
        return this;
    }
}

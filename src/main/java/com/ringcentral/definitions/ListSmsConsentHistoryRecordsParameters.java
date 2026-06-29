package com.ringcentral.definitions;

/** Query parameters for operation listSmsConsentHistoryRecords */
public class ListSmsConsentHistoryRecordsParameters {
    /**
     * The token indicating the particular page of the result set to be retrieved. If omitted the
     * first page will be returned.
     */
    public String pageToken;

    public ListSmsConsentHistoryRecordsParameters pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

    /**
     * The number of items per page. If the provided value in the request is greater than a maximum,
     * the maximum value is applied Maximum: 1000 Minimum: 1 Format: int32 Example: 100 Default: 100
     */
    public Long perPage;

    public ListSmsConsentHistoryRecordsParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    /** The external party&#039;s phone number(s) */
    public String[] to;

    public ListSmsConsentHistoryRecordsParameters to(String[] to) {
        this.to = to;
        return this;
    }
}

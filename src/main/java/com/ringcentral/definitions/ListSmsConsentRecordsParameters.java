package com.ringcentral.definitions;

/** Query parameters for operation listSmsConsentRecords */
public class ListSmsConsentRecordsParameters {
    /**
     * The token indicating the particular page of the result set to be retrieved. If omitted the
     * first page will be returned.
     */
    public String pageToken;

    public ListSmsConsentRecordsParameters pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

    /**
     * The number of items per page. If the provided value in the request is greater than a maximum,
     * the maximum value is applied Maximum: 1000 Minimum: 1 Format: int32 Example: 100 Default: 100
     */
    public Long perPage;

    public ListSmsConsentRecordsParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    /** The sender&#039;s phone number(s) used to filter records */
    public String[] from;

    public ListSmsConsentRecordsParameters from(String[] from) {
        this.from = from;
        return this;
    }

    /** The recipient&#039;s phone number(s) used to filter records */
    public String[] to;

    public ListSmsConsentRecordsParameters to(String[] to) {
        this.to = to;
        return this;
    }

    /**
     * The opt-out/opt-in status to filter records by. If omitted, `OptOut` records are returned
     * Default: OptOut Enum: OptOut, OptIn
     */
    public String[] optStatus;

    public ListSmsConsentRecordsParameters optStatus(String[] optStatus) {
        this.optStatus = optStatus;
        return this;
    }

    /** The coverage (scope) to filter records by Enum: PhoneNumber, Account, CampaignType */
    public String[] coverage;

    public ListSmsConsentRecordsParameters coverage(String[] coverage) {
        this.coverage = coverage;
        return this;
    }

    /** The campaign type to filter records by Enum: Conversational, Informational, Promotional */
    public String[] campaignType;

    public ListSmsConsentRecordsParameters campaignType(String[] campaignType) {
        this.campaignType = campaignType;
        return this;
    }
}

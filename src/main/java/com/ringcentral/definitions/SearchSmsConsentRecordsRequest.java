package com.ringcentral.definitions;

public class SearchSmsConsentRecordsRequest {
    /**
     * The internal party&#039;s phone number(s) used to filter records (if requested `coverage` is
     * `PhoneNumber` or `Account`)
     */
    public String[] from;

    public SearchSmsConsentRecordsRequest from(String[] from) {
        this.from = from;
        return this;
    }

    /** The external party&#039;s phone number(s) used to filter records */
    public String[] to;

    public SearchSmsConsentRecordsRequest to(String[] to) {
        this.to = to;
        return this;
    }

    /**
     * Consent status of a recipient&#039;s phone number: - `OptOut` - The number is opted out of
     * receiving SMS. - `OptIn` - The number is opted in to receiving SMS (if it was previously
     * opted out). Example: OptOut Enum: OptOut, OptIn
     */
    public String optStatus;

    public SearchSmsConsentRecordsRequest optStatus(String optStatus) {
        this.optStatus = optStatus;
        return this;
    }

    /** The coverage(s) used to filter records Enum: PhoneNumber, Account, CampaignType */
    public String[] coverage;

    public SearchSmsConsentRecordsRequest coverage(String[] coverage) {
        this.coverage = coverage;
        return this;
    }

    /**
     * The campaign type(s) used to filter records (if requested `coverage` is `Campaign`) Enum:
     * Conversational, Informational, Promotional
     */
    public String[] campaignType;

    public SearchSmsConsentRecordsRequest campaignType(String[] campaignType) {
        this.campaignType = campaignType;
        return this;
    }

    /**
     * The token indicating the particular page of the result set to be retrieved. If omitted the
     * first page will be returned.
     */
    public String pageToken;

    public SearchSmsConsentRecordsRequest pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

    /**
     * The number of items per page. If provided value in the request is greater than a maximum, the
     * maximum value is applied Maximum: 1000 Minimum: 1 Format: int32 Default: 100
     */
    public Long perPage;

    public SearchSmsConsentRecordsRequest perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }
}

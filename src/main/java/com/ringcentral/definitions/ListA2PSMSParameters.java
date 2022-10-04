package com.ringcentral.definitions;


/**
 * Query parameters for operation listA2PSMS
 */
public class ListA2PSMSParameters {
    /**
     * Indicates if the response has to be detailed, includes text in the response if detailed
     * Default: Simple
     * Enum: Simple, Detailed
     */
    public String view;
    /**
     * List of phone numbers (specified in &#039;to&#039; or &#039;from&#039; fields of a message) to filter the results. Maximum number of phone numbers allowed to be specified as filters is 15
     * Example: 15551234455,15551235577
     */
    public String[] phoneNumber;
    /**
     * The page token of the page to be retrieved.
     * Example: pgt1
     */
    public String pageToken;
    /**
     * The number of messages to be returned per request
     * Format: int32
     * Example: 1
     * Default: 1000
     */
    public Long perPage;

    public ListA2PSMSParameters view(String view) {
        this.view = view;
        return this;
    }

    public ListA2PSMSParameters phoneNumber(String[] phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public ListA2PSMSParameters pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

    public ListA2PSMSParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }
}

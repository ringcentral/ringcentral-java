package com.ringcentral.definitions;


/**
 * Query parameters for operation listA2PSMS
 */
public class ListA2PSMSParameters {
    /**
     * Internal identifier of a message batch used for filtering records
     * Example: 1234
     */
    public String batchId;
    /**
     * Direction of a message to filter the message list result. By default there is no filter applied - both Inbound and Outbound messages are returned
     * Example: Outbound
     * Enum: Inbound, Outbound
     */
    public String direction;
    /**
     * Indicates if the response has to be detailed, includes text in the response if detailed
     * Default: Simple
     * Enum: Simple, Detailed
     */
    public String view;
    /**
     * Date to filter message list result. Messages with `creationTime` later than or equal to `dateFrom` value are returned. The default value is 1 day before the current datetime
     * Example: 2020-11-09T16:07:52.597Z
     */
    public String dateFrom;
    /**
     * Date to filter message list result. Messages with `creationTime` earlier than `dateTo` value are returned. The default is the current datetime
     * Example: 2020-11-25T16:07:52.597Z
     */
    public String dateTo;
    /**
     * List of phone numbers (specified in &#039;to&#039; or &#039;from&#039; fields of a message) to filter the results. Maximum number of phone numbers allowed to be specified as filters is 15
     * Example: phoneNumber=15551234455&amp;phoneNumber=15551235577
     */
    public String[] phoneNumber;
    /**
     * Token of a page to be retrieved
     * Example: pgt1
     */
    public String pageToken;
    /**
     * Number of messages to be returned per request
     * Format: int32
     * Example: 1
     * Default: 1000
     */
    public Long perPage;

    public ListA2PSMSParameters batchId(String batchId) {
        this.batchId = batchId;
        return this;
    }

    public ListA2PSMSParameters direction(String direction) {
        this.direction = direction;
        return this;
    }

    public ListA2PSMSParameters view(String view) {
        this.view = view;
        return this;
    }

    public ListA2PSMSParameters dateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
        return this;
    }

    public ListA2PSMSParameters dateTo(String dateTo) {
        this.dateTo = dateTo;
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

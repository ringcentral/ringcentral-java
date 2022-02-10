package com.ringcentral.definitions;


/**
 * Query parameters for operation listA2PBatches
 */
public class ListA2PBatchesParameters {
    /**
     * The default is 24 hours before `dateTo`
     * Format: date-time
     */
    public String dateFrom;
    /**
     * The default is current time
     * Format: date-time
     */
    public String dateTo;
    /**
     * Current status of a message batch
     * Enum: Processing, Sent, Completed
     */
    public String[] status;
    /**
     * Phone number in E.164 format from which the messages are going to be sent
     */
    public String from;
    /**
     * Token of the page to be retrieved
     */
    public String pageToken;
    /**
     * Number of records to be returned for the page
     */
    public String perPage;

    public ListA2PBatchesParameters dateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
        return this;
    }

    public ListA2PBatchesParameters dateTo(String dateTo) {
        this.dateTo = dateTo;
        return this;
    }

    public ListA2PBatchesParameters status(String[] status) {
        this.status = status;
        return this;
    }

    public ListA2PBatchesParameters from(String from) {
        this.from = from;
        return this;
    }

    public ListA2PBatchesParameters pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

    public ListA2PBatchesParameters perPage(String perPage) {
        this.perPage = perPage;
        return this;
    }
}

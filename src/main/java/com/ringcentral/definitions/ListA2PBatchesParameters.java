package com.ringcentral.definitions;


/**
 * Query parameters for operation listA2PBatches
 */
public class ListA2PBatchesParameters {
    /**
     * The beginning of the time range to filter the results in ISO 8601 format including timezone.
     * Default is the `dateTo` minus 24 hours
     * Format: date-time
     * Example: Mon Nov 09 2020 08:07:52 GMT-0800 (Pacific Standard Time)
     */
    public String dateFrom;
    /**
     * The end of the time range to filter the results in ISO 8601 format including timezone.
     * Default is the current time
     * Format: date-time
     * Example: Wed Nov 25 2020 08:07:52 GMT-0800 (Pacific Standard Time)
     */
    public String dateTo;
    /**
     * Phone number in E.164 format from which the messages are going to be sent
     * Example: 15551234455
     */
    public String from;
    /**
     * A list of batch statuses to filter the results
     * Example: Queued,Processing
     * Enum: Queued, Processing, Sent, Completed
     */
    public String[] status;
    /**
     * The page token of the page to be retrieved
     * Example: pgt1
     */
    public String pageToken;
    /**
     * The number of records to be returned per page
     * Format: int64
     * Example: 1
     */
    public Long perPage;

    public ListA2PBatchesParameters dateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
        return this;
    }

    public ListA2PBatchesParameters dateTo(String dateTo) {
        this.dateTo = dateTo;
        return this;
    }

    public ListA2PBatchesParameters from(String from) {
        this.from = from;
        return this;
    }

    public ListA2PBatchesParameters status(String[] status) {
        this.status = status;
        return this;
    }

    public ListA2PBatchesParameters pageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }

    public ListA2PBatchesParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }
}

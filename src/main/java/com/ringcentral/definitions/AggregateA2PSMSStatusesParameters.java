package com.ringcentral.definitions;


/**
 * Query parameters for operation aggregateA2PSMSStatuses
 */
public class AggregateA2PSMSStatusesParameters {
    /**
     * Internal identifier of a message batch to filter the response
     * Example: 55577
     */
    public String batchId;
    /**
     * Direction of a message to filter the message list result.
     * By default, there is no filter applied - both Inbound and Outbound messages are returned
     * Example: Inbound
     * Enum: Inbound, Outbound
     */
    public String[] direction;
    /**
     * The end of the time range to filter the results in ISO 8601 format including timezone. Default is the &#039;dateTo&#039; minus 24 hours
     * Format: date-time
     * Example: Mon Nov 09 2020 08:07:52 GMT-0800 (Pacific Standard Time)
     */
    public String dateFrom;
    /**
     * The end of the time range to filter the results in ISO 8601 format including timezone. Default is the current time
     * Format: date-time
     * Example: Wed Nov 25 2020 08:07:52 GMT-0800 (Pacific Standard Time)
     */
    public String dateTo;
    /**
     * List of phone numbers (specified in &#039;to&#039; or &#039;from&#039; fields of a message) to filter the results. Maximum number of phone numbers allowed to be specified as filters is 15
     * Example: 15551234455,15551235577
     */
    public String[] phoneNumber;

    public AggregateA2PSMSStatusesParameters batchId(String batchId) {
        this.batchId = batchId;
        return this;
    }

    public AggregateA2PSMSStatusesParameters direction(String[] direction) {
        this.direction = direction;
        return this;
    }

    public AggregateA2PSMSStatusesParameters dateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
        return this;
    }

    public AggregateA2PSMSStatusesParameters dateTo(String dateTo) {
        this.dateTo = dateTo;
        return this;
    }

    public AggregateA2PSMSStatusesParameters phoneNumber(String[] phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}

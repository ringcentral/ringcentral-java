package com.ringcentral.definitions;


// Query parameters for operation aggregateA2PSMSStatuses
public class AggregateA2PSMSStatusesParameters {
    /**
     * Date to filter message list result. Messages with `creationTime` later than or equal to `dateFrom` value are returned. The default value is 1 day before the current datetime
     * Format: date-time
     */
    public String dateFrom;
    /**
     * Date to filter message list result. Messages with `creationTime` earlier than `dateTo` value are returned. The default is the current datetime
     * Format: date-time
     */
    public String dateTo;
    /**
     * Identifier of a message batch used for filtering records
     */
    public String batchId;
    /**
     * Direction of a message to filter the message list result. By default there is no filter applied - both Inbound and Outbound messages are returned
     * Enum: Inbound, Outbound
     */
    public String direction;
    /**
     * List of phone numbers (specified in &#039;to&#039; or &#039;from&#039; fields of a message) to filter the results. Maximum number of phone numbers allowed to be specified as filters is 15
     */
    public String[] phoneNumber;

    public AggregateA2PSMSStatusesParameters dateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
        return this;
    }

    public AggregateA2PSMSStatusesParameters dateTo(String dateTo) {
        this.dateTo = dateTo;
        return this;
    }

    public AggregateA2PSMSStatusesParameters batchId(String batchId) {
        this.batchId = batchId;
        return this;
    }

    public AggregateA2PSMSStatusesParameters direction(String direction) {
        this.direction = direction;
        return this;
    }

    public AggregateA2PSMSStatusesParameters phoneNumber(String[] phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}

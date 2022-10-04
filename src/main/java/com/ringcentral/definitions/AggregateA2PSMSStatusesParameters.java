package com.ringcentral.definitions;


/**
 * Query parameters for operation aggregateA2PSMSStatuses
 */
public class AggregateA2PSMSStatusesParameters {
    /**
     * List of phone numbers (specified in &#039;to&#039; or &#039;from&#039; fields of a message) to filter the results. Maximum number of phone numbers allowed to be specified as filters is 15
     * Example: 15551234455,15551235577
     */
    public String[] phoneNumber;

    public AggregateA2PSMSStatusesParameters phoneNumber(String[] phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}

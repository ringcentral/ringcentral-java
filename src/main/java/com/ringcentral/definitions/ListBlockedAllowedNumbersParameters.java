package com.ringcentral.definitions;


/**
 * Query parameters for operation listBlockedAllowedNumbers
 */
public class ListBlockedAllowedNumbersParameters {
    /**
     * Status of a phone number
     * Default: Blocked
     * Enum: Blocked, Allowed
     */
    public String status;

    public ListBlockedAllowedNumbersParameters status(String status) {
        this.status = status;
        return this;
    }
}

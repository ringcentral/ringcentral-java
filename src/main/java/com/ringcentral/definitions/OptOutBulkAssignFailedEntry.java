package com.ringcentral.definitions;


/**
 * Represents a failure of adding opt-out / opt-in. A pair of a recipient phone number and an error message
 */
public class OptOutBulkAssignFailedEntry {
    /**
     * A recipient phone number
     * Example: 15551237756
     */
    public String to;
    /**
     * An error happened on adding opt-out / opt-in
     * Example: Unexpected issue on creating an opt-out from bulk-assign request
     */
    public String errorMessage;

    public OptOutBulkAssignFailedEntry to(String to) {
        this.to = to;
        return this;
    }

    public OptOutBulkAssignFailedEntry errorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
}

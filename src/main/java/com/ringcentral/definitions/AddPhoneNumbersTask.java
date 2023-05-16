package com.ringcentral.definitions;


public class AddPhoneNumbersTask {
    /**
     * Internal identifier of a task
     */
    public String id;
    /**
     * Task creation time in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format
     * Format: date-time
     */
    public String creationTime;
    /**
     * Task status
     * Example: Accepted
     */
    public String status;

    public AddPhoneNumbersTask id(String id) {
        this.id = id;
        return this;
    }

    public AddPhoneNumbersTask creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public AddPhoneNumbersTask status(String status) {
        this.status = status;
        return this;
    }
}

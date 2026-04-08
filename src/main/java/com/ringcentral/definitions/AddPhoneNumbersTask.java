package com.ringcentral.definitions;

public class AddPhoneNumbersTask {
    /** Internal identifier of a task */
    public String id;

    public AddPhoneNumbersTask id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Task creation time in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format Format:
     * date-time
     */
    public String creationTime;

    public AddPhoneNumbersTask creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /** Task status Example: Accepted */
    public String status;

    public AddPhoneNumbersTask status(String status) {
        this.status = status;
        return this;
    }
}

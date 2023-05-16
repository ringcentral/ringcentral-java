package com.ringcentral.definitions;


public class GetBulkAddTaskResultsV2Response {
    /**
     * List of account phone numbers
     * Required
     */
    public AddPhoneNumbersResponseItem[] records;
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

    public GetBulkAddTaskResultsV2Response records(AddPhoneNumbersResponseItem[] records) {
        this.records = records;
        return this;
    }

    public GetBulkAddTaskResultsV2Response id(String id) {
        this.id = id;
        return this;
    }

    public GetBulkAddTaskResultsV2Response creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public GetBulkAddTaskResultsV2Response status(String status) {
        this.status = status;
        return this;
    }
}

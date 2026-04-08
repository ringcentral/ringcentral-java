package com.ringcentral.definitions;

public class GetBulkAddTaskResultsV2Response {
    /** List of account phone numbers Required */
    public AddPhoneNumbersResponseItem[] records;

    public GetBulkAddTaskResultsV2Response records(AddPhoneNumbersResponseItem[] records) {
        this.records = records;
        return this;
    }

    /** Internal identifier of a task */
    public String id;

    public GetBulkAddTaskResultsV2Response id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Task creation time in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format Format:
     * date-time
     */
    public String creationTime;

    public GetBulkAddTaskResultsV2Response creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /** Task status Example: Accepted */
    public String status;

    public GetBulkAddTaskResultsV2Response status(String status) {
        this.status = status;
        return this;
    }
}

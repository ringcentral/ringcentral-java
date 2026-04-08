package com.ringcentral.definitions;

public class JobStatusResponse {
    /** */
    public String jobId;

    public JobStatusResponse jobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /** Format: date-time */
    public String creationTime;

    public JobStatusResponse creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /** Format: date-time */
    public String completionTime;

    public JobStatusResponse completionTime(String completionTime) {
        this.completionTime = completionTime;
        return this;
    }

    /** Format: date-time */
    public String expirationTime;

    public JobStatusResponse expirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    /** Enum: Success, Fail */
    public String status;

    public JobStatusResponse status(String status) {
        this.status = status;
        return this;
    }

    /** */
    public JobStatusResponseResponse response;

    public JobStatusResponse response(JobStatusResponseResponse response) {
        this.response = response;
        return this;
    }
}

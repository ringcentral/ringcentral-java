package com.ringcentral.definitions;


public class JobStatusResponse {
    /**
     *
     */
    public String jobId;
    /**
     * Format: date-time
     */
    public String creationTime;
    /**
     * Format: date-time
     */
    public String completionTime;
    /**
     * Format: date-time
     */
    public String expirationTime;

    public JobStatusResponse jobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    public JobStatusResponse creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public JobStatusResponse completionTime(String completionTime) {
        this.completionTime = completionTime;
        return this;
    }

    public JobStatusResponse expirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }
}

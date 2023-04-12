package com.ringcentral.definitions;


public class RecordingBaseModel {
    /**
     * Recording status
     * Required
     * Example: Available
     * Enum: Processing, Available, Failed, Purged
     */
    public String status;
    /**
     *
     */
    public ApiError failureReason;
    /**
     * Recording duration in seconds
     * Minimum: 1
     * Format: int32
     * Example: 3600
     */
    public Long duration;
    /**
     *
     */
    public RecordingSharedStatusModel shared;
    /**
     * Time after which recording shared link cannot be accessed by recipients.
     * Format: date-time
     * Example: 2023-10-01T10:05:00.000Z
     */
    public String sharedUriExpirationTime;

    public RecordingBaseModel status(String status) {
        this.status = status;
        return this;
    }

    public RecordingBaseModel failureReason(ApiError failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    public RecordingBaseModel duration(Long duration) {
        this.duration = duration;
        return this;
    }

    public RecordingBaseModel shared(RecordingSharedStatusModel shared) {
        this.shared = shared;
        return this;
    }

    public RecordingBaseModel sharedUriExpirationTime(String sharedUriExpirationTime) {
        this.sharedUriExpirationTime = sharedUriExpirationTime;
        return this;
    }
}

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
     * Indicates if Host or Admin has shared a recording.
     * Can be set to true only then recording status is &#039;Available&#039;.
     * Example: true
     */
    public Boolean shared;
    /**
     * Time after which recording shared link cannot be accessed by recipients.
     * Format: date-time
     * Example: Sun Oct 01 2023 03:05:00 GMT-0700 (Pacific Daylight Time)
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

    public RecordingBaseModel shared(Boolean shared) {
        this.shared = shared;
        return this;
    }

    public RecordingBaseModel sharedUriExpirationTime(String sharedUriExpirationTime) {
        this.sharedUriExpirationTime = sharedUriExpirationTime;
        return this;
    }
}

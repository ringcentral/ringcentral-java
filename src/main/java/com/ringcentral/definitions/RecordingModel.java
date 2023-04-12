package com.ringcentral.definitions;


public class RecordingModel {
    /**
     * Internal object ID
     * Example: 78654321
     */
    public String id;
    /**
     * Object creation time
     * Required
     * Format: date-time
     */
    public String creationTime;
    /**
     * Object last modification time
     * Required
     * Format: date-time
     */
    public String lastModifiedTime;
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

    public RecordingModel id(String id) {
        this.id = id;
        return this;
    }

    public RecordingModel creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public RecordingModel lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public RecordingModel status(String status) {
        this.status = status;
        return this;
    }

    public RecordingModel failureReason(ApiError failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    public RecordingModel duration(Long duration) {
        this.duration = duration;
        return this;
    }

    public RecordingModel shared(RecordingSharedStatusModel shared) {
        this.shared = shared;
        return this;
    }

    public RecordingModel sharedUriExpirationTime(String sharedUriExpirationTime) {
        this.sharedUriExpirationTime = sharedUriExpirationTime;
        return this;
    }
}

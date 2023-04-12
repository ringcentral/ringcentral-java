package com.ringcentral.definitions;


public class RecordingItemModel {
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
    /**
     *
     */
    public SessionRefModel session;

    public RecordingItemModel id(String id) {
        this.id = id;
        return this;
    }

    public RecordingItemModel creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public RecordingItemModel lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public RecordingItemModel status(String status) {
        this.status = status;
        return this;
    }

    public RecordingItemModel failureReason(ApiError failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    public RecordingItemModel duration(Long duration) {
        this.duration = duration;
        return this;
    }

    public RecordingItemModel shared(RecordingSharedStatusModel shared) {
        this.shared = shared;
        return this;
    }

    public RecordingItemModel sharedUriExpirationTime(String sharedUriExpirationTime) {
        this.sharedUriExpirationTime = sharedUriExpirationTime;
        return this;
    }

    public RecordingItemModel session(SessionRefModel session) {
        this.session = session;
        return this;
    }
}

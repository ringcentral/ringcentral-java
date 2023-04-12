package com.ringcentral.definitions;


public class RecordingAdminModel {
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
    public SessionRefAdminModel session;

    public RecordingAdminModel id(String id) {
        this.id = id;
        return this;
    }

    public RecordingAdminModel creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public RecordingAdminModel lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public RecordingAdminModel status(String status) {
        this.status = status;
        return this;
    }

    public RecordingAdminModel failureReason(ApiError failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    public RecordingAdminModel duration(Long duration) {
        this.duration = duration;
        return this;
    }

    public RecordingAdminModel shared(RecordingSharedStatusModel shared) {
        this.shared = shared;
        return this;
    }

    public RecordingAdminModel sharedUriExpirationTime(String sharedUriExpirationTime) {
        this.sharedUriExpirationTime = sharedUriExpirationTime;
        return this;
    }

    public RecordingAdminModel session(SessionRefAdminModel session) {
        this.session = session;
        return this;
    }
}

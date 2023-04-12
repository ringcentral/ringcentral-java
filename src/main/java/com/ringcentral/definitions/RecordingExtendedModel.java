package com.ringcentral.definitions;


public class RecordingExtendedModel {
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
     * Shared URI of the recording. If a password was required to join a webinar, the URI should contain the password encoded
     * Required
     * Format: uri
     * Example: https://v.ringcentral.com/w/a/recording/de7yd8ew7yfsdfjh899843rgj?pw=a1b2c3d4
     */
    public String recordingSharedUri;

    public RecordingExtendedModel id(String id) {
        this.id = id;
        return this;
    }

    public RecordingExtendedModel creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public RecordingExtendedModel lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public RecordingExtendedModel status(String status) {
        this.status = status;
        return this;
    }

    public RecordingExtendedModel failureReason(ApiError failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    public RecordingExtendedModel duration(Long duration) {
        this.duration = duration;
        return this;
    }

    public RecordingExtendedModel shared(RecordingSharedStatusModel shared) {
        this.shared = shared;
        return this;
    }

    public RecordingExtendedModel sharedUriExpirationTime(String sharedUriExpirationTime) {
        this.sharedUriExpirationTime = sharedUriExpirationTime;
        return this;
    }

    public RecordingExtendedModel recordingSharedUri(String recordingSharedUri) {
        this.recordingSharedUri = recordingSharedUri;
        return this;
    }
}

package com.ringcentral.definitions;


public class RecordingItemExtendedModel {
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
    /**
     * Shared URI of the recording. If a password was required to join a webinar, the URI should contain the password encoded
     * Required
     * Format: uri
     * Example: https://v.ringcentral.com/w/a/recording/de7yd8ew7yfsdfjh899843rgj?pw=a1b2c3d4
     */
    public String recordingSharedUri;
    /**
     *
     */
    public SessionRefModel session;

    public RecordingItemExtendedModel id(String id) {
        this.id = id;
        return this;
    }

    public RecordingItemExtendedModel creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public RecordingItemExtendedModel lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public RecordingItemExtendedModel status(String status) {
        this.status = status;
        return this;
    }

    public RecordingItemExtendedModel failureReason(ApiError failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    public RecordingItemExtendedModel duration(Long duration) {
        this.duration = duration;
        return this;
    }

    public RecordingItemExtendedModel shared(Boolean shared) {
        this.shared = shared;
        return this;
    }

    public RecordingItemExtendedModel sharedUriExpirationTime(String sharedUriExpirationTime) {
        this.sharedUriExpirationTime = sharedUriExpirationTime;
        return this;
    }

    public RecordingItemExtendedModel recordingSharedUri(String recordingSharedUri) {
        this.recordingSharedUri = recordingSharedUri;
        return this;
    }

    public RecordingItemExtendedModel session(SessionRefModel session) {
        this.session = session;
        return this;
    }
}

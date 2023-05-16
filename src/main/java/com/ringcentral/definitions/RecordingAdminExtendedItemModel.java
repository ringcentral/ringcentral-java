package com.ringcentral.definitions;


public class RecordingAdminExtendedItemModel {
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
    /**
     *
     */
    public SessionRefAdminModel session;

    public RecordingAdminExtendedItemModel id(String id) {
        this.id = id;
        return this;
    }

    public RecordingAdminExtendedItemModel creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public RecordingAdminExtendedItemModel lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public RecordingAdminExtendedItemModel status(String status) {
        this.status = status;
        return this;
    }

    public RecordingAdminExtendedItemModel failureReason(ApiError failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    public RecordingAdminExtendedItemModel duration(Long duration) {
        this.duration = duration;
        return this;
    }

    public RecordingAdminExtendedItemModel shared(Boolean shared) {
        this.shared = shared;
        return this;
    }

    public RecordingAdminExtendedItemModel sharedUriExpirationTime(String sharedUriExpirationTime) {
        this.sharedUriExpirationTime = sharedUriExpirationTime;
        return this;
    }

    public RecordingAdminExtendedItemModel recordingSharedUri(String recordingSharedUri) {
        this.recordingSharedUri = recordingSharedUri;
        return this;
    }

    public RecordingAdminExtendedItemModel session(SessionRefAdminModel session) {
        this.session = session;
        return this;
    }
}

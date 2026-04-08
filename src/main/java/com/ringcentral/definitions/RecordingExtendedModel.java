package com.ringcentral.definitions;

public class RecordingExtendedModel {
    /** Internal object ID Example: 78654321 */
    public String id;

    public RecordingExtendedModel id(String id) {
        this.id = id;
        return this;
    }

    /** Object creation time Required Format: date-time */
    public String creationTime;

    public RecordingExtendedModel creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /** Object last modification time Required Format: date-time */
    public String lastModifiedTime;

    public RecordingExtendedModel lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /** Recording status Required Example: Available Enum: Processing, Available, Failed, Purged */
    public String status;

    public RecordingExtendedModel status(String status) {
        this.status = status;
        return this;
    }

    /** */
    public ApiError failureReason;

    public RecordingExtendedModel failureReason(ApiError failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /** Recording duration in seconds Minimum: 1 Format: int32 Example: 3600 */
    public Long duration;

    public RecordingExtendedModel duration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Indicates if Host or Admin has shared a recording. Can be set to true only then recording
     * status is &#039;Available&#039;. Example: true
     */
    public Boolean shared;

    public RecordingExtendedModel shared(Boolean shared) {
        this.shared = shared;
        return this;
    }

    /**
     * Time after which recording shared link cannot be accessed by recipients. Format: date-time
     * Example: Sun Oct 01 2023 03:05:00 GMT-0700 (Pacific Daylight Time)
     */
    public String sharedUriExpirationTime;

    public RecordingExtendedModel sharedUriExpirationTime(String sharedUriExpirationTime) {
        this.sharedUriExpirationTime = sharedUriExpirationTime;
        return this;
    }

    /**
     * Shared URI of the recording. If a password was required to join a webinar, the URI should
     * contain the password encoded Required Format: uri Example:
     * https://v.ringcentral.com/w/a/recording/de7yd8ew7yfsdfjh899843rgj?pw=a1b2c3d4
     */
    public String recordingSharedUri;

    public RecordingExtendedModel recordingSharedUri(String recordingSharedUri) {
        this.recordingSharedUri = recordingSharedUri;
        return this;
    }
}

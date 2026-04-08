package com.ringcentral.definitions;

public class SessionLivestreamMinimalModel {
    /** Identifier of the livestream Required Example: 40740e06-4eec-4458-a86e-8578e192274q */
    public String livestreamId;

    public SessionLivestreamMinimalModel livestreamId(String livestreamId) {
        this.livestreamId = livestreamId;
        return this;
    }

    /** Name of the livestreaming service provider Required Example: YouTube */
    public String serviceProvider;

    public SessionLivestreamMinimalModel serviceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
        return this;
    }

    /**
     * Livestream status Required Example: Configured Enum: Initialized, Authorized, Configured,
     * PublishSetup, Publishing, Error, Paused, Break, Deleted, Completed
     */
    public String livestreamStatus;

    public SessionLivestreamMinimalModel livestreamStatus(String livestreamStatus) {
        this.livestreamStatus = livestreamStatus;
        return this;
    }

    /**
     * Livestream status Example: Configured Enum: Initialized, Authorized, Configured,
     * PublishSetup, Publishing, Error, Paused, Break, Deleted, Completed
     */
    public String previousLivestreamStatus;

    public SessionLivestreamMinimalModel previousLivestreamStatus(String previousLivestreamStatus) {
        this.previousLivestreamStatus = previousLivestreamStatus;
        return this;
    }

    /**
     * Time at which the session started to publish media to livestream service provider. Format:
     * date-time
     */
    public String livestreamStartTime;

    public SessionLivestreamMinimalModel livestreamStartTime(String livestreamStartTime) {
        this.livestreamStartTime = livestreamStartTime;
        return this;
    }

    /** */
    public ApiError error;

    public SessionLivestreamMinimalModel error(ApiError error) {
        this.error = error;
        return this;
    }
}

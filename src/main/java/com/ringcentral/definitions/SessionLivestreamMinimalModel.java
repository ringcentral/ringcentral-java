package com.ringcentral.definitions;


public class SessionLivestreamMinimalModel {
    /**
     * Identifier of the livestream
     * Required
     * Example: 40740e06-4eec-4458-a86e-8578e192274q
     */
    public String livestreamId;
    /**
     * Name of the livestreaming service provider
     * Required
     * Example: YoutTube
     */
    public String serviceProvider;
    /**
     * Last known state of the livestream as notified by Webinar Livestreaming Controller Service (WLCS).
     * Value may not be consistent with latest state, especially for livestream associated with OAuth2.0 based service providers.
     * Thus, state must be obtained directly from WLCS
     * Required
     * Example: Initialized
     * Enum: Initialized, Authorized, Configured, PublishSetup, Publishing, Paused, Error, Break, Deleted, Completed
     */
    public String livestreamStatus;
    /**
     * Last known state of the livestream as notified by Webinar Livestreaming Controller Service (WLCS).
     * Value may not be consistent with latest state, especially for livestream associated with OAuth2.0 based service providers.
     * Thus, state must be obtained directly from WLCS
     * Example: Initialized
     * Enum: Initialized, Authorized, Configured, PublishSetup, Publishing, Paused, Error, Break, Deleted, Completed
     */
    public String previousLivestreamStatus;
    /**
     * Time at which the session started to publish media to livestream service provider.
     * Format: date-time
     */
    public String livestreamStartTime;
    /**
     *
     */
    public ApiError error;

    public SessionLivestreamMinimalModel livestreamId(String livestreamId) {
        this.livestreamId = livestreamId;
        return this;
    }

    public SessionLivestreamMinimalModel serviceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
        return this;
    }

    public SessionLivestreamMinimalModel livestreamStatus(String livestreamStatus) {
        this.livestreamStatus = livestreamStatus;
        return this;
    }

    public SessionLivestreamMinimalModel previousLivestreamStatus(String previousLivestreamStatus) {
        this.previousLivestreamStatus = previousLivestreamStatus;
        return this;
    }

    public SessionLivestreamMinimalModel livestreamStartTime(String livestreamStartTime) {
        this.livestreamStartTime = livestreamStartTime;
        return this;
    }

    public SessionLivestreamMinimalModel error(ApiError error) {
        this.error = error;
        return this;
    }
}

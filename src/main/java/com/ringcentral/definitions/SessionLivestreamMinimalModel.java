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

    public SessionLivestreamMinimalModel error(ApiError error) {
        this.error = error;
        return this;
    }
}

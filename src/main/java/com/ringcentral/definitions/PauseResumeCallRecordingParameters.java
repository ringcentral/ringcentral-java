package com.ringcentral.definitions;


// Query parameters for operation pauseResumeCallRecording
public class PauseResumeCallRecordingParameters {
    /**
     * Identifies a brand of a logged in user or a brand of a sign-up session
     * Default: ~
     */
    public String brandId;

    public PauseResumeCallRecordingParameters brandId(String brandId) {
        this.brandId = brandId;
        return this;
    }
}

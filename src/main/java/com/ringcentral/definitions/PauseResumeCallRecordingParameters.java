package com.ringcentral.definitions;


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

package com.ringcentral.definitions;


/**
 * Query parameters for operation caiSpeakerDiarize
 */
public class CaiSpeakerDiarizeParameters {
    /**
     * The webhook URI to which the job response will be returned
     * Format: uri
     */
    public String webhook;

    public CaiSpeakerDiarizeParameters webhook(String webhook) {
        this.webhook = webhook;
        return this;
    }
}

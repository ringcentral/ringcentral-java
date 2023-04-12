package com.ringcentral.definitions;


/**
 * Query parameters for operation caiSpeakerDiarize
 */
public class CaiSpeakerDiarizeParameters {
    /**
     * The webhook uri to which responses will be posted
     * Format: uri
     */
    public String webhook;

    public CaiSpeakerDiarizeParameters webhook(String webhook) {
        this.webhook = webhook;
        return this;
    }
}

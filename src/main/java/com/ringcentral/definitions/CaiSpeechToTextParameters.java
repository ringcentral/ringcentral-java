package com.ringcentral.definitions;


/**
 * Query parameters for operation caiSpeechToText
 */
public class CaiSpeechToTextParameters {
    /**
     * The webhook URI to which the job response will be returned
     * Format: uri
     */
    public String webhook;

    public CaiSpeechToTextParameters webhook(String webhook) {
        this.webhook = webhook;
        return this;
    }
}

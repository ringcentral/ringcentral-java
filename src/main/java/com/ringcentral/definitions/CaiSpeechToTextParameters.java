package com.ringcentral.definitions;


/**
 * Query parameters for operation caiSpeechToText
 */
public class CaiSpeechToTextParameters {
    /**
     * The webhook uri to which responses will be posted
     * Format: uri
     */
    public String webhook;

    public CaiSpeechToTextParameters webhook(String webhook) {
        this.webhook = webhook;
        return this;
    }
}

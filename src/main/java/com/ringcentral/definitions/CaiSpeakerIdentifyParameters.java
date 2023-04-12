package com.ringcentral.definitions;


/**
 * Query parameters for operation caiSpeakerIdentify
 */
public class CaiSpeakerIdentifyParameters {
    /**
     * The webhook uri to which responses will be posted
     * Format: uri
     */
    public String webhook;

    public CaiSpeakerIdentifyParameters webhook(String webhook) {
        this.webhook = webhook;
        return this;
    }
}

package com.ringcentral.definitions;


/**
 * Query parameters for operation caiSpeakerIdentify
 */
public class CaiSpeakerIdentifyParameters {
    /**
     * The webhook URI to which the job response will be returned
     * Format: uri
     */
    public String webhook;

    public CaiSpeakerIdentifyParameters webhook(String webhook) {
        this.webhook = webhook;
        return this;
    }
}

package com.ringcentral.definitions;


/**
 * Query parameters for operation caiAnalyzeInteraction
 */
public class CaiAnalyzeInteractionParameters {
    /**
     * The webhook URI to which the job response will be returned
     * Format: uri
     */
    public String webhook;

    public CaiAnalyzeInteractionParameters webhook(String webhook) {
        this.webhook = webhook;
        return this;
    }
}

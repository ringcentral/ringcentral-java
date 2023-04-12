package com.ringcentral.definitions;


/**
 * Query parameters for operation caiAnalyzeInteraction
 */
public class CaiAnalyzeInteractionParameters {
    /**
     * The webhook uri to which responses will be posted
     * Format: uri
     */
    public String webhook;

    public CaiAnalyzeInteractionParameters webhook(String webhook) {
        this.webhook = webhook;
        return this;
    }
}

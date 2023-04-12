package com.ringcentral.definitions;


/**
 * Query parameters for operation caiSummarize
 */
public class CaiSummarizeParameters {
    /**
     * The webhook uri to which responses will be posted
     * Format: uri
     */
    public String webhook;

    public CaiSummarizeParameters webhook(String webhook) {
        this.webhook = webhook;
        return this;
    }
}

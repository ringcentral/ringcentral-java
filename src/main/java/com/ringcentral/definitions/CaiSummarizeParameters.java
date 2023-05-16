package com.ringcentral.definitions;


/**
 * Query parameters for operation caiSummarize
 */
public class CaiSummarizeParameters {
    /**
     * The webhook URI to which the job response will be returned
     * Format: uri
     */
    public String webhook;

    public CaiSummarizeParameters webhook(String webhook) {
        this.webhook = webhook;
        return this;
    }
}

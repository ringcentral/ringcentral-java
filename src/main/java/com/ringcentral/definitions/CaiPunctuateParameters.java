package com.ringcentral.definitions;


/**
 * Query parameters for operation caiPunctuate
 */
public class CaiPunctuateParameters {
    /**
     * The webhook URI to which the job response will be returned
     * Format: uri
     */
    public String webhook;

    public CaiPunctuateParameters webhook(String webhook) {
        this.webhook = webhook;
        return this;
    }
}

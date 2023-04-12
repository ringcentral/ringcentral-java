package com.ringcentral.definitions;


/**
 * Query parameters for operation caiPunctuate
 */
public class CaiPunctuateParameters {
    /**
     * The webhook uri to which responses will be posted
     * Format: uri
     */
    public String webhook;

    public CaiPunctuateParameters webhook(String webhook) {
        this.webhook = webhook;
        return this;
    }
}

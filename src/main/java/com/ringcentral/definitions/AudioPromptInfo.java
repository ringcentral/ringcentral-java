package com.ringcentral.definitions;


/**
 * For 'Audio' mode only. Prompt media reference
 */
public class AudioPromptInfo {
    /**
     * Link to a prompt audio file
     * Format: uri
     */
    public String uri;
    /**
     * Internal identifier of a prompt
     */
    public String id;

    public AudioPromptInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public AudioPromptInfo id(String id) {
        this.id = id;
        return this;
    }
}

package com.ringcentral.definitions;


public class AudioPromptInfo {
    /**
     * Link to an prompt audio file
     */
    public String uri;
    /**
     * Internal identifier of an prompt
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

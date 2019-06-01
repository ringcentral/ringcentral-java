package com.ringcentral.definitions;


public class PronouncedNameInfo {
    /**
     * Voice name type. 'Default' - default extension name; first name and last name specified in user profile; 'TextToSpeech' - custom text; user name spelled the way it sounds and specified by user; 'Recorded' - custom audio, user name recorded in user's own voice (supported only for extension retrieval)
     * Enum: Default, TextToSpeech, Recorded
     */
    public String type;
    /**
     * Custom text
     */
    public String text;

    public PronouncedNameInfo type(String type) {
        this.type = type;
        return this;
    }

    public PronouncedNameInfo text(String text) {
        this.text = text;
        return this;
    }

}

package com.ringcentral.definitions;


public class PronouncedNameInfo {
    /**
     * Voice name type. &#039;Default&#039; - default extension name; first
     * name and last name specified in user profile; &#039;TextToSpeech&#039; - custom
     * text; user name spelled the way it sounds and specified by user; &#039;Recorded&#039;
     * - custom audio, user name recorded in user&#039;s own voice (supported only
     * for extension retrieval)
     * Enum: Default, TextToSpeech, Recorded
     */
    public String type;
    /**
     * Custom text
     */
    public String text;
    /**
     *
     */
    public PronouncedNamePromptInfo prompt;

    public PronouncedNameInfo type(String type) {
        this.type = type;
        return this;
    }

    public PronouncedNameInfo text(String text) {
        this.text = text;
        return this;
    }

    public PronouncedNameInfo prompt(PronouncedNamePromptInfo prompt) {
        this.prompt = prompt;
        return this;
    }
}

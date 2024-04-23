package com.ringcentral.definitions;


public class PronouncedNameInfo {
    /**
     * The method used to pronounce the user&#039;s name:
     * - `Default` - default extension name; first and last name specified in user&#039;s profile are pronounced using text-to-speech;
     * - `TextToSpeech` - custom text specified by a user  pronounced using text-to-speech;
     * - `Recorded` - custom audio uploaded by a user, the name recorded in user&#039;s own voice (supported only for extension retrieval).
     * Enum: Default, TextToSpeech, Recorded
     */
    public String type;
    /**
     * Custom text (for `TextToSpeech` type only)
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

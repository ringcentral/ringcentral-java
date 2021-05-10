package com.ringcentral.definitions;


// Prompt metadata
public class IVRMenuPromptInfo {
    /**
     * Prompt mode: custom media or text
     * Enum: Audio, TextToSpeech
     */
    public String mode;
    /**
     *
     */
    public AudioPromptInfo audio;
    /**
     * For 'TextToSpeech' mode only. Prompt text
     */
    public String text;
    /**
     *
     */
    public PromptLanguageInfo language;

    public IVRMenuPromptInfo mode(String mode) {
        this.mode = mode;
        return this;
    }

    public IVRMenuPromptInfo audio(AudioPromptInfo audio) {
        this.audio = audio;
        return this;
    }

    public IVRMenuPromptInfo text(String text) {
        this.text = text;
        return this;
    }

    public IVRMenuPromptInfo language(PromptLanguageInfo language) {
        this.language = language;
        return this;
    }
}

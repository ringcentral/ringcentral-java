package com.ringcentral.definitions;


/**
 * Prompt metadata
 */
public class IvrMenuPromptInfo {
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
     * For &#039;TextToSpeech&#039; mode only. Prompt text
     */
    public String text;
    /**
     *
     */
    public PromptLanguageInfo language;

    public IvrMenuPromptInfo mode(String mode) {
        this.mode = mode;
        return this;
    }

    public IvrMenuPromptInfo audio(AudioPromptInfo audio) {
        this.audio = audio;
        return this;
    }

    public IvrMenuPromptInfo text(String text) {
        this.text = text;
        return this;
    }

    public IvrMenuPromptInfo language(PromptLanguageInfo language) {
        this.language = language;
        return this;
    }
}

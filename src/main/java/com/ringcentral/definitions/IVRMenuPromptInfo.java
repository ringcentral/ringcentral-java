package com.ringcentral.definitions;


public class IVRMenuPromptInfo {
    /**
     * Prompt mode: custom media or text
     * Enum: Audio, TextToSpeech
     */
    public String mode;
    /**
     * For 'Audio' mode only. Prompt media reference
     */
    public PromptLanguageInfo audio;
    /**
     * For 'TextToSpeech' mode only. Prompt text
     */
    public String text;
    /**
     * For 'TextToSpeech' mode only. Prompt language metadata
     */
    public AudioPromptInfo language;

    public IVRMenuPromptInfo mode(String mode) {
        this.mode = mode;
        return this;
    }

    public IVRMenuPromptInfo audio(PromptLanguageInfo audio) {
        this.audio = audio;
        return this;
    }

    public IVRMenuPromptInfo text(String text) {
        this.text = text;
        return this;
    }

    public IVRMenuPromptInfo language(AudioPromptInfo language) {
        this.language = language;
        return this;
    }

}

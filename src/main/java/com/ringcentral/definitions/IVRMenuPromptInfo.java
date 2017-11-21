package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class IVRMenuPromptInfo
{
    // Prompt mode: custom media or text = ['Audio', 'TextToSpeech']
    public String mode;
    public IVRMenuPromptInfo mode(String mode) {
        this.mode = mode;
        return this;
    }
    // For 'Audio' mode only. Prompt media reference
    public PromptLanguageInfo audio;
    public IVRMenuPromptInfo audio(PromptLanguageInfo audio) {
        this.audio = audio;
        return this;
    }
    // For 'TextToSpeech' mode only. Prompt text
    public String text;
    public IVRMenuPromptInfo text(String text) {
        this.text = text;
        return this;
    }
    // For 'TextToSpeech' mode only. Prompt language metadata
    public AudioPromptInfo language;
    public IVRMenuPromptInfo language(AudioPromptInfo language) {
        this.language = language;
        return this;
    }
}

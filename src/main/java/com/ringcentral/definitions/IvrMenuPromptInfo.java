package com.ringcentral.definitions;


    /**
* Prompt metadata
*/
public class IvrMenuPromptInfo
{
    /**
     * Prompt mode: custom media or text
     * Enum: Audio, TextToSpeech
     */
    public String mode;
    public IvrMenuPromptInfo mode(String mode)
    {
        this.mode = mode;
        return this;
    }

    /**
     */
    public AudioPromptInfo audio;
    public IvrMenuPromptInfo audio(AudioPromptInfo audio)
    {
        this.audio = audio;
        return this;
    }

    /**
     * For &#039;TextToSpeech&#039; mode only. Prompt text
     */
    public String text;
    public IvrMenuPromptInfo text(String text)
    {
        this.text = text;
        return this;
    }

    /**
     */
    public PromptLanguageInfo language;
    public IvrMenuPromptInfo language(PromptLanguageInfo language)
    {
        this.language = language;
        return this;
    }
}
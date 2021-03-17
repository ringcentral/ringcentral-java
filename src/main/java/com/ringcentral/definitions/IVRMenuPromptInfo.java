package com.ringcentral.definitions;


    // Prompt metadata
public class IVRMenuPromptInfo
{
    /**
         * Prompt mode: custom media or text
         * Enum: Audio, TextToSpeech
         */
        public String mode;
  public IVRMenuPromptInfo mode(String mode)
  {
    this.mode = mode;
    return this;
  }
  

        /**
         */
        public AudioPromptInfo audio;
  public IVRMenuPromptInfo audio(AudioPromptInfo audio)
  {
    this.audio = audio;
    return this;
  }
  

        /**
         * For 'TextToSpeech' mode only. Prompt text
         */
        public String text;
  public IVRMenuPromptInfo text(String text)
  {
    this.text = text;
    return this;
  }
  

        /**
         */
        public PromptLanguageInfo language;
  public IVRMenuPromptInfo language(PromptLanguageInfo language)
  {
    this.language = language;
    return this;
  }
  
}

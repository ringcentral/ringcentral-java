package com.ringcentral.definitions;


    // For 'TextToSpeech' mode only. Prompt language metadata
public class PromptLanguageInfo
{
    /**
         * Link to a prompt language
         */
        public String uri;
  public PromptLanguageInfo uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Internal identifier of a language
         */
        public String id;
  public PromptLanguageInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Language name
         */
        public String name;
  public PromptLanguageInfo name(String name)
  {
    this.name = name;
    return this;
  }
  

        /**
         * Language locale code
         */
        public String localeCode;
  public PromptLanguageInfo localeCode(String localeCode)
  {
    this.localeCode = localeCode;
    return this;
  }
  
}

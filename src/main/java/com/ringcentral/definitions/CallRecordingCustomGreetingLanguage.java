package com.ringcentral.definitions;


    // Custom greeting language
public class CallRecordingCustomGreetingLanguage
{
    /**
         * Link to a language
         */
        public String uri;
  public CallRecordingCustomGreetingLanguage uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Internal identifier of a language
         */
        public String id;
  public CallRecordingCustomGreetingLanguage id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Language name
         */
        public String name;
  public CallRecordingCustomGreetingLanguage name(String name)
  {
    this.name = name;
    return this;
  }
  

        /**
         * Language locale code
         */
        public String localeCode;
  public CallRecordingCustomGreetingLanguage localeCode(String localeCode)
  {
    this.localeCode = localeCode;
    return this;
  }
  
}

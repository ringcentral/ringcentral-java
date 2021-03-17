package com.ringcentral.definitions;


    // Information on a greeting language. Supported for types 'StopRecording', 'StartRecording', 'AutomaticRecording'
public class CustomCompanyGreetingLanguageInfo
{
    /**
         * Internal identifier of a greeting language
         */
        public String id;
  public CustomCompanyGreetingLanguageInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Link to a greeting language
         */
        public String uri;
  public CustomCompanyGreetingLanguageInfo uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Name of a greeting language
         */
        public String name;
  public CustomCompanyGreetingLanguageInfo name(String name)
  {
    this.name = name;
    return this;
  }
  

        /**
         * Locale code of a greeting language
         */
        public String localeCode;
  public CustomCompanyGreetingLanguageInfo localeCode(String localeCode)
  {
    this.localeCode = localeCode;
    return this;
  }
  
}

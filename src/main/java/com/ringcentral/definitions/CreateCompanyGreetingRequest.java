package com.ringcentral.definitions;


public class CreateCompanyGreetingRequest
{
    /**
         * Type of a greeting, specifying the case when the greeting is played.
         * Enum: Company, StartRecording, StopRecording, AutomaticRecording
         */
        public String type;
  public CreateCompanyGreetingRequest type(String type)
  {
    this.type = type;
    return this;
  }
  

        /**
         * Internal identifier of an answering rule
         */
        public String answeringRuleId;
  public CreateCompanyGreetingRequest answeringRuleId(String answeringRuleId)
  {
    this.answeringRuleId = answeringRuleId;
    return this;
  }
  

        /**
         * Internal identifier of a language. See Get Language List
         */
        public String languageId;
  public CreateCompanyGreetingRequest languageId(String languageId)
  {
    this.languageId = languageId;
    return this;
  }
  

        /**
         * Meida file to upload
         */
        public Attachment binary;
  public CreateCompanyGreetingRequest binary(Attachment binary)
  {
    this.binary = binary;
    return this;
  }
  
}

package com.ringcentral.definitions;


public class CreateCustomUserGreetingRequest
{
    /**
         * Type of a greeting, specifying the case when the greeting is played.
         * Enum: Introductory, Announcement, ConnectingMessage, ConnectingAudio, Voicemail, Unavailable, HoldMusic
         */
        public String type;
  public CreateCustomUserGreetingRequest type(String type)
  {
    this.type = type;
    return this;
  }
  

        /**
         * Internal identifier of an answering rule
         */
        public String answeringRuleId;
  public CreateCustomUserGreetingRequest answeringRuleId(String answeringRuleId)
  {
    this.answeringRuleId = answeringRuleId;
    return this;
  }
  

        /**
         * Meida file to upload
         */
        public Attachment binary;
  public CreateCustomUserGreetingRequest binary(Attachment binary)
  {
    this.binary = binary;
    return this;
  }
  
}

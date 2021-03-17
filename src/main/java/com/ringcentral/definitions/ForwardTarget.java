package com.ringcentral.definitions;


    // Identifier of a call party the call will be forwarded to. Only **one of** these parameters: `phoneNumber`, `voicemail` or `extensionNumber` must be specified, otherwise an error is returned.
public class ForwardTarget
{
    /**
         * Phone number
         */
        public String phoneNumber;
  public ForwardTarget phoneNumber(String phoneNumber)
  {
    this.phoneNumber = phoneNumber;
    return this;
  }
  

        /**
         * Voicemail owner extension identifier
         */
        public String voicemail;
  public ForwardTarget voicemail(String voicemail)
  {
    this.voicemail = voicemail;
    return this;
  }
  

        /**
         * Number of an extension
         */
        public String extensionNumber;
  public ForwardTarget extensionNumber(String extensionNumber)
  {
    this.extensionNumber = extensionNumber;
    return this;
  }
  
}

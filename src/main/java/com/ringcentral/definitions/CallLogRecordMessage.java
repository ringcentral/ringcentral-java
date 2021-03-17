package com.ringcentral.definitions;


    // Linked message (Fax/Voicemail)
public class CallLogRecordMessage
{
    /**
         * Internal identifier of a message
         */
        public String id;
  public CallLogRecordMessage id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Type of a message
         */
        public String type;
  public CallLogRecordMessage type(String type)
  {
    this.type = type;
    return this;
  }
  

        /**
         * Link to a message resource
         */
        public String uri;
  public CallLogRecordMessage uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  
}

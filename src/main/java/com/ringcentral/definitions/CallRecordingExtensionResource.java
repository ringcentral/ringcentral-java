package com.ringcentral.definitions;


public class CallRecordingExtensionResource
{
    /**
         * Internal identifier of an extension
         */
        public String id;
  public CallRecordingExtensionResource id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         */
        public String uri;
  public CallRecordingExtensionResource uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         */
        public String extensionNumber;
  public CallRecordingExtensionResource extensionNumber(String extensionNumber)
  {
    this.extensionNumber = extensionNumber;
    return this;
  }
  

        /**
         */
        public String type;
  public CallRecordingExtensionResource type(String type)
  {
    this.type = type;
    return this;
  }
  

        /**
         * Direction of call
         * Enum: Outbound, Inbound, All
         */
        public String callDirection;
  public CallRecordingExtensionResource callDirection(String callDirection)
  {
    this.callDirection = callDirection;
    return this;
  }
  
}

package com.ringcentral.definitions;


public class CallRecordingExtensionInfo
{
    /**
         * Internal identifier of an extension
         */
        public String id;
  public CallRecordingExtensionInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Link to an extension resource
         */
        public String uri;
  public CallRecordingExtensionInfo uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Number of an extension
         */
        public String extensionNumber;
  public CallRecordingExtensionInfo extensionNumber(String extensionNumber)
  {
    this.extensionNumber = extensionNumber;
    return this;
  }
  

        /**
         * Name of an extension
         */
        public String name;
  public CallRecordingExtensionInfo name(String name)
  {
    this.name = name;
    return this;
  }
  
}

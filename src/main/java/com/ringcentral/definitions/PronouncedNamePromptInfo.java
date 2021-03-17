package com.ringcentral.definitions;


public class PronouncedNamePromptInfo
{
    /**
         */
        public String id;
  public PronouncedNamePromptInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Link to a prompt resource
         */
        public String contentUri;
  public PronouncedNamePromptInfo contentUri(String contentUri)
  {
    this.contentUri = contentUri;
    return this;
  }
  

        /**
         * Content media type
         * Enum: audio/mpeg, audio/wav
         */
        public String contentType;
  public PronouncedNamePromptInfo contentType(String contentType)
  {
    this.contentType = contentType;
    return this;
  }
  
}

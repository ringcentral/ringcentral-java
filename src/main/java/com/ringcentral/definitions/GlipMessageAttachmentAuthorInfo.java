package com.ringcentral.definitions;


    // Information about the author
public class GlipMessageAttachmentAuthorInfo
{
    /**
         * Name of a message author
         */
        public String name;
  public GlipMessageAttachmentAuthorInfo name(String name)
  {
    this.name = name;
    return this;
  }
  

        /**
         * Link to an author's name
         */
        public String uri;
  public GlipMessageAttachmentAuthorInfo uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Link to an image displayed to the left of an author's name; sized 82x82px
         */
        public String iconUri;
  public GlipMessageAttachmentAuthorInfo iconUri(String iconUri)
  {
    this.iconUri = iconUri;
    return this;
  }
  
}

package com.ringcentral.definitions;


public class TaskAttachment
{
    /**
         * Internal identifier of a file
         */
        public String id;
  public TaskAttachment id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Attachment type (currently only `File` value is supported).
         * Enum: File
         */
        public String type;
  public TaskAttachment type(String type)
  {
    this.type = type;
    return this;
  }
  

        /**
         * Name of the attached file (including extension name).
         */
        public String name;
  public TaskAttachment name(String name)
  {
    this.name = name;
    return this;
  }
  

        /**
         * Link to an attachment content
         */
        public String contentUri;
  public TaskAttachment contentUri(String contentUri)
  {
    this.contentUri = contentUri;
    return this;
  }
  
}

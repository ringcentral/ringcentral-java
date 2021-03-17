package com.ringcentral.definitions;


public class GlipEveryoneInfo
{
    /**
         * Internal identifier of a chat
         */
        public String id;
  public GlipEveryoneInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Type of a chat
         * Enum: Everyone
         */
        public String type;
  public GlipEveryoneInfo type(String type)
  {
    this.type = type;
    return this;
  }
  

        /**
         * Chat name
         */
        public String name;
  public GlipEveryoneInfo name(String name)
  {
    this.name = name;
    return this;
  }
  

        /**
         * Chat description
         */
        public String description;
  public GlipEveryoneInfo description(String description)
  {
    this.description = description;
    return this;
  }
  

        /**
         * Chat creation datetime in ISO 8601 format
         */
        public String creationTime;
  public GlipEveryoneInfo creationTime(String creationTime)
  {
    this.creationTime = creationTime;
    return this;
  }
  

        /**
         * Chat last change datetime in ISO 8601 format
         */
        public String lastModifiedTime;
  public GlipEveryoneInfo lastModifiedTime(String lastModifiedTime)
  {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }
  
}

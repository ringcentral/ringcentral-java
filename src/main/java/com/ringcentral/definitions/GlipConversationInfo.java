package com.ringcentral.definitions;


public class GlipConversationInfo
{
    /**
         * Internal identifier of a conversation
         */
        public String id;
  public GlipConversationInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Type of a conversation
         * Enum: Direct, Personal, Group
         */
        public String type;
  public GlipConversationInfo type(String type)
  {
    this.type = type;
    return this;
  }
  

        /**
         * Conversation creation datetime in ISO 8601 format
         */
        public String creationTime;
  public GlipConversationInfo creationTime(String creationTime)
  {
    this.creationTime = creationTime;
    return this;
  }
  

        /**
         * Conversation last change datetime in ISO 8601 format
         */
        public String lastModifiedTime;
  public GlipConversationInfo lastModifiedTime(String lastModifiedTime)
  {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }
  

        /**
         * List of glip members
         */
        public CreateGlipMember[] members;
  public GlipConversationInfo members(CreateGlipMember[] members)
  {
    this.members = members;
    return this;
  }
  
}

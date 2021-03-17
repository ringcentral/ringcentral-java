package com.ringcentral.definitions;


public class GlipMentionsInfo
{
    /**
         * Internal identifier of a user
         */
        public String id;
  public GlipMentionsInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Type of mention
         * Enum: Person, Team, File, Link, Event, Task, Note, Card
         */
        public String type;
  public GlipMentionsInfo type(String type)
  {
    this.type = type;
    return this;
  }
  

        /**
         * Name of a user
         */
        public String name;
  public GlipMentionsInfo name(String name)
  {
    this.name = name;
    return this;
  }
  
}

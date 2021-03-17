package com.ringcentral.definitions;

import com.google.gson.annotations.SerializedName;


public class GlipTeamInfo
{
    /**
         * Internal identifier of a team
         */
        public String id;
  public GlipTeamInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Type of a chat
         * Enum: Team
         */
        public String type;
  public GlipTeamInfo type(String type)
  {
    this.type = type;
    return this;
  }
  

        /**
         * Team access level
         */
        @SerializedName("public")
        public Boolean _public;
  public GlipTeamInfo _public(Boolean _public)
  {
    this._public = _public;
    return this;
  }
  

        /**
         * Team name
         */
        public String name;
  public GlipTeamInfo name(String name)
  {
    this.name = name;
    return this;
  }
  

        /**
         * Team description
         */
        public String description;
  public GlipTeamInfo description(String description)
  {
    this.description = description;
    return this;
  }
  

        /**
         * Team status
         * Enum: Active, Archived
         */
        public String status;
  public GlipTeamInfo status(String status)
  {
    this.status = status;
    return this;
  }
  

        /**
         * Team creation datetime in ISO 8601 format
         */
        public String creationTime;
  public GlipTeamInfo creationTime(String creationTime)
  {
    this.creationTime = creationTime;
    return this;
  }
  

        /**
         * Team last change datetime in ISO 8601 format
         */
        public String lastModifiedTime;
  public GlipTeamInfo lastModifiedTime(String lastModifiedTime)
  {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }
  
}

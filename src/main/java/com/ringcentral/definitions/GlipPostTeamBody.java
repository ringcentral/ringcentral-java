package com.ringcentral.definitions;

import com.google.gson.annotations.SerializedName;


public class GlipPostTeamBody
{
    /**
         * Team access level.
         */
        @SerializedName("public")
        public Boolean _public;
  public GlipPostTeamBody _public(Boolean _public)
  {
    this._public = _public;
    return this;
  }
  

        /**
         * Team name.
         * Required
         */
        public String name;
  public GlipPostTeamBody name(String name)
  {
    this.name = name;
    return this;
  }
  

        /**
         * Team description.
         */
        public String description;
  public GlipPostTeamBody description(String description)
  {
    this.description = description;
    return this;
  }
  

        /**
         * List of glip members
         */
        public CreateGlipMember[] members;
  public GlipPostTeamBody members(CreateGlipMember[] members)
  {
    this.members = members;
    return this;
  }
  
}

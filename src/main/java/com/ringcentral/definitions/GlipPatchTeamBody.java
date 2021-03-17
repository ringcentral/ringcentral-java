package com.ringcentral.definitions;

import com.google.gson.annotations.SerializedName;


public class GlipPatchTeamBody
{
    /**
         * Team access level
         */
        @SerializedName("public")
        public Boolean _public;
  public GlipPatchTeamBody _public(Boolean _public)
  {
    this._public = _public;
    return this;
  }
  

        /**
         * Team name. Maximum number of characters supported is 250
         */
        public String name;
  public GlipPatchTeamBody name(String name)
  {
    this.name = name;
    return this;
  }
  

        /**
         * Team description. Maximum number of characters supported is 1000
         */
        public String description;
  public GlipPatchTeamBody description(String description)
  {
    this.description = description;
    return this;
  }
  
}

package com.ringcentral.definitions;

import com.google.gson.annotations.SerializedName;


public class GlipPostTeamBody {
    /**
     * Team access level.
     */
    @SerializedName("public")
    public Boolean _public;
    /**
     * Team name.
     * Required
     */
    public String name;
    /**
     * Team description.
     */
    public String description;
    /**
     * List of glip members
     */
    public CreateGlipMember[] members;

    public GlipPostTeamBody _public(Boolean _public) {
        this._public = _public;
        return this;
    }

    public GlipPostTeamBody name(String name) {
        this.name = name;
        return this;
    }

    public GlipPostTeamBody description(String description) {
        this.description = description;
        return this;
    }

    public GlipPostTeamBody members(CreateGlipMember[] members) {
        this.members = members;
        return this;
    }

}

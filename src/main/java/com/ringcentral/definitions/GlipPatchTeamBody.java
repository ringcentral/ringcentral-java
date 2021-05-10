package com.ringcentral.definitions;

import com.google.gson.annotations.SerializedName;


public class GlipPatchTeamBody {
    /**
     * Team access level
     */
    @SerializedName("public")
    public Boolean _public;
    /**
     * Team name. Maximum number of characters supported is 250
     */
    public String name;
    /**
     * Team description. Maximum number of characters supported is 1000
     */
    public String description;

    public GlipPatchTeamBody _public(Boolean _public) {
        this._public = _public;
        return this;
    }

    public GlipPatchTeamBody name(String name) {
        this.name = name;
        return this;
    }

    public GlipPatchTeamBody description(String description) {
        this.description = description;
        return this;
    }
}

package com.ringcentral.definitions;

import com.google.gson.annotations.SerializedName;


public class TMCreateTeamRequest {
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
     * Identifier(s) of team members.
     */
    public TMCreateTeamRequestMembers[] members;

    public TMCreateTeamRequest _public(Boolean _public) {
        this._public = _public;
        return this;
    }

    public TMCreateTeamRequest name(String name) {
        this.name = name;
        return this;
    }

    public TMCreateTeamRequest description(String description) {
        this.description = description;
        return this;
    }

    public TMCreateTeamRequest members(TMCreateTeamRequestMembers[] members) {
        this.members = members;
        return this;
    }
}

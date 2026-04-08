package com.ringcentral.definitions;

import com.google.gson.annotations.SerializedName;


public class TMCreateTeamRequest
{
    /**
     * Team access level.
     */
    @SerializedName("public")
    public Boolean _public;
    public TMCreateTeamRequest _public(Boolean _public)
    {
        this._public = _public;
        return this;
    }

    /**
     * Team name.
     * Required
     */
    public String name;
    public TMCreateTeamRequest name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Team description.
     */
    public String description;
    public TMCreateTeamRequest description(String description)
    {
        this.description = description;
        return this;
    }

    /**
     * Identifier(s) of team members.
     */
    public TMCreateTeamRequestMembers[] members;
    public TMCreateTeamRequest members(TMCreateTeamRequestMembers[] members)
    {
        this.members = members;
        return this;
    }
}
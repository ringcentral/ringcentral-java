package com.ringcentral.definitions;

import com.google.gson.annotations.SerializedName;


public class TMTeamInfo
{
    /**
     * Internal identifier of a team
     */
    public String id;
    public TMTeamInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Type of a chat
     * Enum: Team
     */
    public String type;
    public TMTeamInfo type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Team access level
     */
    @SerializedName("public")
    public Boolean _public;
    public TMTeamInfo _public(Boolean _public)
    {
        this._public = _public;
        return this;
    }

    /**
     * Team name
     */
    public String name;
    public TMTeamInfo name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Team description
     */
    public String description;
    public TMTeamInfo description(String description)
    {
        this.description = description;
        return this;
    }

    /**
     * Team status
     * Enum: Active, Archived
     */
    public String status;
    public TMTeamInfo status(String status)
    {
        this.status = status;
        return this;
    }

    /**
     * Team creation datetime in ISO 8601 format
     * Format: date-time
     */
    public String creationTime;
    public TMTeamInfo creationTime(String creationTime)
    {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Team last change datetime in ISO 8601 format
     * Format: date-time
     */
    public String lastModifiedTime;
    public TMTeamInfo lastModifiedTime(String lastModifiedTime)
    {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
}
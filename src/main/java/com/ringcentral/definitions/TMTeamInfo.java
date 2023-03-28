package com.ringcentral.definitions;

import com.google.gson.annotations.SerializedName;


public class TMTeamInfo {
    /**
     * Internal identifier of a team
     */
    public String id;
    /**
     * Type of a chat
     * Enum: Team
     */
    public String type;
    /**
     * Team access level
     */
    @SerializedName("public")
    public Boolean _public;
    /**
     * Team name
     */
    public String name;
    /**
     * Team description
     */
    public String description;
    /**
     * Team status
     * Enum: Active, Archived
     */
    public String status;
    /**
     * Team creation datetime in ISO 8601 format
     * Format: date-time
     */
    public String creationTime;
    /**
     * Team last change datetime in ISO 8601 format
     * Format: date-time
     */
    public String lastModifiedTime;

    public TMTeamInfo id(String id) {
        this.id = id;
        return this;
    }

    public TMTeamInfo type(String type) {
        this.type = type;
        return this;
    }

    public TMTeamInfo _public(Boolean _public) {
        this._public = _public;
        return this;
    }

    public TMTeamInfo name(String name) {
        this.name = name;
        return this;
    }

    public TMTeamInfo description(String description) {
        this.description = description;
        return this;
    }

    public TMTeamInfo status(String status) {
        this.status = status;
        return this;
    }

    public TMTeamInfo creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public TMTeamInfo lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
}

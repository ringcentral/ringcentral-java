package com.ringcentral.definitions;

import com.alibaba.fastjson.annotation.JSONField;


public class GlipTeamInfo {
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
    @JSONField(name = "public")
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
     */
    public String creationTime;
    /**
     * Team last change datetime in ISO 8601 format
     */
    public String lastModifiedTime;

    public GlipTeamInfo id(String id) {
        this.id = id;
        return this;
    }

    public GlipTeamInfo type(String type) {
        this.type = type;
        return this;
    }

    public GlipTeamInfo _public(Boolean _public) {
        this._public = _public;
        return this;
    }

    public GlipTeamInfo name(String name) {
        this.name = name;
        return this;
    }

    public GlipTeamInfo description(String description) {
        this.description = description;
        return this;
    }

    public GlipTeamInfo status(String status) {
        this.status = status;
        return this;
    }

    public GlipTeamInfo creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public GlipTeamInfo lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

}

package com.ringcentral.definitions;

import com.alibaba.fastjson.annotation.JSONField;


public class GlipPostTeamBody {
    /**
     * Team access level.
     */
    @JSONField(name = "public")
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
    public Object[] members;

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

    public GlipPostTeamBody members(Object[] members) {
        this.members = members;
        return this;
    }

}

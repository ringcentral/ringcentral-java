package com.ringcentral.definitions;


public class GlipMentionsInfo {
    /**
     * Internal identifier of a user
     */
    public String id;
    /**
     * Type of mentions
     * Enum: Person, Team, File, Link, Event, Task, Note, Card
     */
    public String type;
    /**
     * Name of a user
     */
    public String name;

    public GlipMentionsInfo id(String id) {
        this.id = id;
        return this;
    }

    public GlipMentionsInfo type(String type) {
        this.type = type;
        return this;
    }

    public GlipMentionsInfo name(String name) {
        this.name = name;
        return this;
    }

}

package com.ringcentral.definitions;


public class TMMentionsInfo {
    /**
     * Internal identifier of a user
     */
    public String id;
    /**
     * Type of mention
     * Enum: Person, Team, File, Link, Event, Task, Note, Card
     */
    public String type;
    /**
     * Name of a user
     */
    public String name;

    public TMMentionsInfo id(String id) {
        this.id = id;
        return this;
    }

    public TMMentionsInfo type(String type) {
        this.type = type;
        return this;
    }

    public TMMentionsInfo name(String name) {
        this.name = name;
        return this;
    }
}

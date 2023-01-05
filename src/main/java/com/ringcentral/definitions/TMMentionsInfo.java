package com.ringcentral.definitions;


public class TMMentionsInfo
{
    /**
     * Internal identifier of a user
     */
    public String id;
    public TMMentionsInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Type of mention
     * Enum: Person, Team, File, Link, Event, Task, Note, Card
     */
    public String type;
    public TMMentionsInfo type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Name of a user
     */
    public String name;
    public TMMentionsInfo name(String name)
    {
        this.name = name;
        return this;
    }
}
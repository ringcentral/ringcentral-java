package com.ringcentral.definitions;


public class EveryoneTeamInfo
{
    /**
     * Internal identifier of a chat
     */
    public String id;
    public EveryoneTeamInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Type of a chat
     * Enum: Everyone
     */
    public String type;
    public EveryoneTeamInfo type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Chat name
     */
    public String name;
    public EveryoneTeamInfo name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Chat description
     */
    public String description;
    public EveryoneTeamInfo description(String description)
    {
        this.description = description;
        return this;
    }

    /**
     * Chat creation datetime in ISO 8601 format
     * Format: date-time
     */
    public String creationTime;
    public EveryoneTeamInfo creationTime(String creationTime)
    {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Chat last change datetime in ISO 8601 format
     * Format: date-time
     */
    public String lastModifiedTime;
    public EveryoneTeamInfo lastModifiedTime(String lastModifiedTime)
    {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
}
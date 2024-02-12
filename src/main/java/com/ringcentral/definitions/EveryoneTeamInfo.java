package com.ringcentral.definitions;


public class EveryoneTeamInfo {
    /**
     * Internal identifier of a chat
     */
    public String id;
    /**
     * Type of chat
     * Enum: Everyone
     */
    public String type;
    /**
     * Chat name
     */
    public String name;
    /**
     * Chat description
     */
    public String description;
    /**
     * Chat creation datetime in ISO 8601 format
     * Format: date-time
     */
    public String creationTime;
    /**
     * Chat last change datetime in ISO 8601 format
     * Format: date-time
     */
    public String lastModifiedTime;

    public EveryoneTeamInfo id(String id) {
        this.id = id;
        return this;
    }

    public EveryoneTeamInfo type(String type) {
        this.type = type;
        return this;
    }

    public EveryoneTeamInfo name(String name) {
        this.name = name;
        return this;
    }

    public EveryoneTeamInfo description(String description) {
        this.description = description;
        return this;
    }

    public EveryoneTeamInfo creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public EveryoneTeamInfo lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
}

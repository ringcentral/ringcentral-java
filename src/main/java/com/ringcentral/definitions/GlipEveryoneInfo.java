package com.ringcentral.definitions;


public class GlipEveryoneInfo {
    /**
     * Internal identifier of a chat
     */
    public String id;
    /**
     * Type of a chat
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
     */
    public String creationTime;
    /**
     * Chat last change datetime in ISO 8601 format
     */
    public String lastModifiedTime;

    public GlipEveryoneInfo id(String id) {
        this.id = id;
        return this;
    }

    public GlipEveryoneInfo type(String type) {
        this.type = type;
        return this;
    }

    public GlipEveryoneInfo name(String name) {
        this.name = name;
        return this;
    }

    public GlipEveryoneInfo description(String description) {
        this.description = description;
        return this;
    }

    public GlipEveryoneInfo creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public GlipEveryoneInfo lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

}

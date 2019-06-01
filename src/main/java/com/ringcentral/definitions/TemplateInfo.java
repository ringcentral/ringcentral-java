package com.ringcentral.definitions;


public class TemplateInfo {
    /**
     * Link to a template
     */
    public String uri;
    /**
     * Internal identifier of a template
     */
    public String id;
    /**
     * Enum: UserSettings, CallHandling
     */
    public String type;
    /**
     * Name of a template
     */
    public String name;
    /**
     * Time of a template creation
     */
    public String creationTime;
    /**
     * Time of the last template modification
     */
    public String lastModifiedTime;

    public TemplateInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public TemplateInfo id(String id) {
        this.id = id;
        return this;
    }

    public TemplateInfo type(String type) {
        this.type = type;
        return this;
    }

    public TemplateInfo name(String name) {
        this.name = name;
        return this;
    }

    public TemplateInfo creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public TemplateInfo lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

}

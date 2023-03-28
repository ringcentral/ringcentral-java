package com.ringcentral.definitions;


public class ScimSchemaResponse {
    /**
     * The unique URI of the schema
     * Required
     */
    public String id;
    /**
     * The name of the schema
     */
    public String name;
    /**
     * The description of the schema
     */
    public String description;
    /**
     *
     */
    public ScimSchemaAttribute[] attributes;
    /**
     *
     */
    public ScimMeta meta;

    public ScimSchemaResponse id(String id) {
        this.id = id;
        return this;
    }

    public ScimSchemaResponse name(String name) {
        this.name = name;
        return this;
    }

    public ScimSchemaResponse description(String description) {
        this.description = description;
        return this;
    }

    public ScimSchemaResponse attributes(ScimSchemaAttribute[] attributes) {
        this.attributes = attributes;
        return this;
    }

    public ScimSchemaResponse meta(ScimMeta meta) {
        this.meta = meta;
        return this;
    }
}

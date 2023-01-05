package com.ringcentral.definitions;


public class ScimSchemaResponse
{
    /**
     * The unique URI of the schema
     * Required
     */
    public String id;
    public ScimSchemaResponse id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * The name of the schema
     */
    public String name;
    public ScimSchemaResponse name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * The description of the schema
     */
    public String description;
    public ScimSchemaResponse description(String description)
    {
        this.description = description;
        return this;
    }

    /**
     */
    public ScimSchemaAttribute[] attributes;
    public ScimSchemaResponse attributes(ScimSchemaAttribute[] attributes)
    {
        this.attributes = attributes;
        return this;
    }

    /**
     */
    public ScimMeta meta;
    public ScimSchemaResponse meta(ScimMeta meta)
    {
        this.meta = meta;
        return this;
    }
}
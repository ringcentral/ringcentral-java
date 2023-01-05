package com.ringcentral.definitions;


public class ScimResourceTypeResponse
{
    /**
     * Unique resource type id, same value as the &quot;name&quot; attribute
     */
    public String id;
    public ScimResourceTypeResponse id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Resource type name
     * Required
     */
    public String name;
    public ScimResourceTypeResponse name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * The resource type&#039;s HTTP-addressable endpoint
     * Required
     */
    public String endpoint;
    public ScimResourceTypeResponse endpoint(String endpoint)
    {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Description of the resource type
     */
    public String description;
    public ScimResourceTypeResponse description(String description)
    {
        this.description = description;
        return this;
    }

    /**
     * Required
     * Enum: urn:ietf:params:scim:schemas:core:2.0:User
     */
    public String schema;
    public ScimResourceTypeResponse schema(String schema)
    {
        this.schema = schema;
        return this;
    }

    /**
     */
    public ScimSchemaExtension[] schemaExtensions;
    public ScimResourceTypeResponse schemaExtensions(ScimSchemaExtension[] schemaExtensions)
    {
        this.schemaExtensions = schemaExtensions;
        return this;
    }

    /**
     */
    public ScimMeta meta;
    public ScimResourceTypeResponse meta(ScimMeta meta)
    {
        this.meta = meta;
        return this;
    }
}
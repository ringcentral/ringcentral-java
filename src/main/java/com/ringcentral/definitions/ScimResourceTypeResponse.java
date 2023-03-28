package com.ringcentral.definitions;


public class ScimResourceTypeResponse {
    /**
     * Unique resource type id, same value as the &quot;name&quot; attribute
     */
    public String id;
    /**
     * Resource type name
     * Required
     */
    public String name;
    /**
     * The resource type&#039;s HTTP-addressable endpoint
     * Required
     */
    public String endpoint;
    /**
     * Description of the resource type
     */
    public String description;
    /**
     * Required
     * Enum: urn:ietf:params:scim:schemas:core:2.0:User
     */
    public String schema;
    /**
     *
     */
    public ScimSchemaExtension[] schemaExtensions;
    /**
     *
     */
    public ScimMeta meta;

    public ScimResourceTypeResponse id(String id) {
        this.id = id;
        return this;
    }

    public ScimResourceTypeResponse name(String name) {
        this.name = name;
        return this;
    }

    public ScimResourceTypeResponse endpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    public ScimResourceTypeResponse description(String description) {
        this.description = description;
        return this;
    }

    public ScimResourceTypeResponse schema(String schema) {
        this.schema = schema;
        return this;
    }

    public ScimResourceTypeResponse schemaExtensions(ScimSchemaExtension[] schemaExtensions) {
        this.schemaExtensions = schemaExtensions;
        return this;
    }

    public ScimResourceTypeResponse meta(ScimMeta meta) {
        this.meta = meta;
        return this;
    }
}

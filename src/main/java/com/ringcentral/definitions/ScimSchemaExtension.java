package com.ringcentral.definitions;


public class ScimSchemaExtension
{
    /**
     * Required
     * Enum: urn:ietf:params:scim:schemas:extension:enterprise:2.0:User
     */
    public String schema;
    public ScimSchemaExtension schema(String schema)
    {
        this.schema = schema;
        return this;
    }

    /**
     * Required
     */
    public Boolean required;
    public ScimSchemaExtension required(Boolean required)
    {
        this.required = required;
        return this;
    }
}
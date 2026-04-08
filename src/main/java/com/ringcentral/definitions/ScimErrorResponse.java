package com.ringcentral.definitions;


public class ScimErrorResponse
{
    /**
     * Detailed error message
     */
    public String detail;
    public ScimErrorResponse detail(String detail)
    {
        this.detail = detail;
        return this;
    }

    /**
     * Enum: urn:ietf:params:scim:api:messages:2.0:Error
     */
    public String[] schemas;
    public ScimErrorResponse schemas(String[] schemas)
    {
        this.schemas = schemas;
        return this;
    }

    /**
     * Bad request type when status code is 400
     * Enum: uniqueness, tooMany, mutability, sensitive, invalidSyntax, invalidFilter, invalidPath, invalidValue, invalidVers, noTarget
     */
    public String scimType;
    public ScimErrorResponse scimType(String scimType)
    {
        this.scimType = scimType;
        return this;
    }

    /**
     * Same as HTTP status code, e.g. 400, 401, etc.
     */
    public String status;
    public ScimErrorResponse status(String status)
    {
        this.status = status;
        return this;
    }
}
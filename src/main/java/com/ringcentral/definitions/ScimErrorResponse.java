package com.ringcentral.definitions;


public class ScimErrorResponse {
    /**
     * detail error message
     */
    public String detail;
    /**
     *
     */
    public String[] schemas;
    /**
     * bad request type when status code is 400
     * Enum: uniqueness, tooMany, mutability, sensitive, invalidSyntax, invalidFilter, invalidPath, invalidValue, invalidVers, noTarget
     */
    public String scimType;
    /**
     * same as HTTP status code, e.g. 400, 401, etc.
     */
    public String status;

    public ScimErrorResponse detail(String detail) {
        this.detail = detail;
        return this;
    }

    public ScimErrorResponse schemas(String[] schemas) {
        this.schemas = schemas;
        return this;
    }

    public ScimErrorResponse scimType(String scimType) {
        this.scimType = scimType;
        return this;
    }

    public ScimErrorResponse status(String status) {
        this.status = status;
        return this;
    }

}

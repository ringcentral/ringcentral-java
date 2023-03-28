package com.ringcentral.definitions;


public class ScimSchemaSearchResponse {
    /**
     * Resource type list
     */
    public ScimSchemaResponse[] Resources;
    /**
     * Format: int64
     */
    public Long itemsPerPage;
    /**
     * Enum: urn:ietf:params:scim:api:messages:2.0:ListResponse
     */
    public String[] schemas;
    /**
     * Format: int64
     */
    public Long startIndex;
    /**
     * Format: int64
     */
    public Long totalResults;

    public ScimSchemaSearchResponse Resources(ScimSchemaResponse[] Resources) {
        this.Resources = Resources;
        return this;
    }

    public ScimSchemaSearchResponse itemsPerPage(Long itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
        return this;
    }

    public ScimSchemaSearchResponse schemas(String[] schemas) {
        this.schemas = schemas;
        return this;
    }

    public ScimSchemaSearchResponse startIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }

    public ScimSchemaSearchResponse totalResults(Long totalResults) {
        this.totalResults = totalResults;
        return this;
    }
}

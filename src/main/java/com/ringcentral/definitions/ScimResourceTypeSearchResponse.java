package com.ringcentral.definitions;


public class ScimResourceTypeSearchResponse {
    /**
     * Resource type list
     */
    public ScimResourceTypeResponse[] Resources;
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

    public ScimResourceTypeSearchResponse Resources(ScimResourceTypeResponse[] Resources) {
        this.Resources = Resources;
        return this;
    }

    public ScimResourceTypeSearchResponse itemsPerPage(Long itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
        return this;
    }

    public ScimResourceTypeSearchResponse schemas(String[] schemas) {
        this.schemas = schemas;
        return this;
    }

    public ScimResourceTypeSearchResponse startIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }

    public ScimResourceTypeSearchResponse totalResults(Long totalResults) {
        this.totalResults = totalResults;
        return this;
    }
}

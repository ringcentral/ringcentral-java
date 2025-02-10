package com.ringcentral.definitions;


public class ScimUserSearchResponse {
    /**
     * User list
     */
    public ScimUserShortInfo[] Resources;
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

    public ScimUserSearchResponse Resources(ScimUserShortInfo[] Resources) {
        this.Resources = Resources;
        return this;
    }

    public ScimUserSearchResponse itemsPerPage(Long itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
        return this;
    }

    public ScimUserSearchResponse schemas(String[] schemas) {
        this.schemas = schemas;
        return this;
    }

    public ScimUserSearchResponse startIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }

    public ScimUserSearchResponse totalResults(Long totalResults) {
        this.totalResults = totalResults;
        return this;
    }
}

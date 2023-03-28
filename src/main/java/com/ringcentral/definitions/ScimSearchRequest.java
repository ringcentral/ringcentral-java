package com.ringcentral.definitions;


public class ScimSearchRequest {
    /**
     * Page size
     * Format: int32
     */
    public Long count;
    /**
     * Only support &#039;userName&#039; or &#039;email&#039; filter expressions for now
     */
    public String filter;
    /**
     * Enum: urn:ietf:params:scim:api:messages:2.0:SearchRequest
     */
    public String[] schemas;
    /**
     * Start index (1-based)
     * Format: int32
     */
    public Long startIndex;

    public ScimSearchRequest count(Long count) {
        this.count = count;
        return this;
    }

    public ScimSearchRequest filter(String filter) {
        this.filter = filter;
        return this;
    }

    public ScimSearchRequest schemas(String[] schemas) {
        this.schemas = schemas;
        return this;
    }

    public ScimSearchRequest startIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
}
